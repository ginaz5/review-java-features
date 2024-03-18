package review.example.v21.thread;

public class MyRunnableThread implements Runnable {

    private int threadNumber;
    public MyRunnableThread(int threadNumber)
    {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i < 6; i++) {
            System.out.println( i + " from runnable thread " + threadNumber);

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
