import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Schedule
{
    public static void main(String[] args)
    {
//        ScheduledExecutorService shc = Executors.newScheduledThreadPool(3);
//        for (int i =0; i < 10; i++)
//        {
//            shc.schedule(new MyImpl(), 3000, TimeUnit.MILLISECONDS);
//        }
//        shc.shutdown();
        ScheduledExecutorService shc = Executors.newScheduledThreadPool(1);
        shc.scheduleAtFixedRate(new MyImpl(), 3000, 1000, TimeUnit.MILLISECONDS);
        try {
            shc.awaitTermination(10000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        shc.shutdown();
        System.out.println("End!!!!!!!!!!");
    }
}
class MyImpl implements Runnable
{
    public void run()
    {
        System.out.println("Thread" + Thread.currentThread().getName() + " Starts");
        try
        {
            Thread.sleep(1000);
        } catch (InterruptedException e)
        {
            throw new RuntimeException(e);
        }
        System.out.println("Thread" + Thread.currentThread().getName() + " Ends");
    }
}