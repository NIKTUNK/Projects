public class Ex1
{
    public static int counter1 = 0;
    public static synchronized void increm()
    {
        counter1++;
    }
    public static void main(String[] args) throws Exception
    {
        Thread thr1 = new Thread(new My());
        Thread thr2 = new Thread(new My());
        Thread thr3 = new Thread(new My());
        thr1.start();
        thr1.join();
        thr2.start();
        thr1.join();
        thr3.start();
        thr1.join();
    }
}
class My implements Runnable
{
    public void run()
    {
        for (int i = 0; i < 5; i++)
        {
            Ex1.increm();
            System.out.println(Thread.currentThread().getName() + " " + Ex1.counter1);
        }
    }
}