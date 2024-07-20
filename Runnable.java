class MyRunnable implements Runnable {
    private int id;

    public MyRunnable(int id) {
        this.id = id;
    }

    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thread " + id + " : " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            MyRunnable runnable = new MyRunnable(i);
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}

