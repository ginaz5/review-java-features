package review.example.v21.thread;

public class ThreadExample {
    public static void main(String[] args) {

        // Usage - Thread
        for (int i = 0; i < 5; i++) {
            MyRunnableThread myThread = new MyRunnableThread(i);
            Thread thread = new Thread(myThread);
            thread.start(); // add new thread
        }

//        throw new RuntimeException("The exception won't affect existing threads");

    }
}
