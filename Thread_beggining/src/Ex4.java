public class Ex4
{
    public static void main(String[] args) throws InterruptedException {
        System.out.println("The Start!");
        Thread thread4 = new Thread(new My1());

        thread4.start();
        thread4.join();
        System.out.println("The Middle!");
        Thr thread5 = new Thr();
        thread5.start();
        thread5.join();
        System.out.println("The End!");
        Thread.sleep(2000);
        System.out.println("The PostEnd!");
    }
}
class Thr extends Thread
{
    @Override
    public void run()
    {
        Thread.currentThread().setName("NewOne");
        for (int i = 1; i < 6; i++)
        {
            System.out.println(i + " Name of the thread: " + Thread.currentThread().getName());
            try
            {
                Thread.sleep(500);
            }
            catch(InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
    }
}
class My1 implements Runnable
{
    public void run()
    {
        Thread.currentThread().setName("OldOne");
        for (int i = 1; i<6;i++)
        {
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
            System.out.println(i + " Name of the thread: " + Thread.currentThread().getName());
        }
    }
}