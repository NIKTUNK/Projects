import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ThreadPool
{
    public static void main(String[] args)
    {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        for (int i = 0; i < 10; i++)
        {
            executor.execute(new MyRun());
        }
        try {
            executor.awaitTermination(1000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executor.shutdown();
        System.out.println("END!!!!!!!!!!!!!!!");
    }
}

class MyRun implements Runnable
{
    public void run()
    {
        System.out.println(Thread.currentThread().getName() + " begins work");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " ends work");
    }
}