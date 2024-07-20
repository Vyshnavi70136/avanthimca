class MyThread extends Thread {
    private int id;

    public MyThread(int id) {
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
            MyThread thread = new MyThread(i);
            thread.start();
        }
    }
}
