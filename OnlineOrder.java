package com.exe;

public class OnlineOrder {
//Flag to track the state of order and payment
	private boolean orderPlaced = false;
	private boolean paymentMade = false;
//Sychronized method to place an order 
	public synchronized void placeOrder() {
		System.out.println("Placing order...");
		orderPlaced = true;//Set the flag to indicate the order is placed
		notify();//Notify any waiting thread that the order is placed
		//Wait until payment is made
		while (!paymentMade) {
			try {
				wait();//Release the lock and wait until notified
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();//Preserve interrupt status
			}
		}
		System.out.println("Order completed.");//Order process is complete after payment
	}
//Sychronized method to make a payment
	public synchronized void makePayment() {
		//wait untill an order is placed
		while (!orderPlaced) {
			try {
				wait();//Release the lock and wait until notified
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();//Preserve interrupt status
			}
		}
		System.out.println("Processing payment...");
		paymentMade = true;//Set the flag to indicate the payment is made
		notify();//notify any waiting thread that the payment is made
	}

	public static void main(String[] args) {
		OnlineOrder onlineOrder = new OnlineOrder();
//Creste and start a thread to place an order
		Thread orderThread = new Thread(new Runnable() {

			public void run() {
				onlineOrder.placeOrder();
			}
		});

		Thread paymentThread = new Thread(new Runnable() {

			public void run() {
				onlineOrder.makePayment();
			}
		});
//Start both threads
		orderThread.start();
		paymentThread.start();
	}
}
