public class Interrupt
{
    public static void main(String[] args) {
        Inter inter = new Inter();
        System.out.println("start");
        inter.start();
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        inter.interrupt();
        System.out.println("end!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
class Inter extends Thread
{
    public void run()
    {
        for (int i = 0; i < 1000; i++)
        {
            System.out.println(i);
            if (isInterrupted())
            {
                System.out.println("interrupted");
                return;
            }
        }
    }
}