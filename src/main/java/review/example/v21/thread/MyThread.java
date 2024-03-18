package review.example.v21.thread;

public class MyThread extends Thread {
    private int threadNumber;
    public MyThread(int threadNumber)
    {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {
        for (int i = 1; i <=5 ; i++) {
            System.out.println( i + " from thread " + threadNumber);

//            if (threadNumber == 3)
//            {
//                throw new RuntimeException("The exception won't affect other thread");
//            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
