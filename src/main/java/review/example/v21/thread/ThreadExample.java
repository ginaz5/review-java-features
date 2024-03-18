package review.example.v21.thread;

public class ThreadExample {
    public static void main(String[] args) throws InterruptedException {

        // Usage - Thread
        for (int i = 0; i < 5; i++) {
            MyRunnableThread myRunnableThread = new MyRunnableThread(i);
            Thread myThread = new Thread(myRunnableThread);
            myThread.start(); // add new thread

            myThread.join(); // this executes thread one by one
//            myThread.isAlive();
        }

//        throw new RuntimeException("The exception won't affect existing threads");

    }
}
