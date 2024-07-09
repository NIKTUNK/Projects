public class r
{
    public static void main(String[] args) {
        Thread1 thread1= new Thread1();
        thread1.start();

        Thread2 thread2= new Thread2();
        thread2.start();
    }
    static class Thread1 extends Thread
    {
        public void run()
        {
            for (int i = 0;i<100;i++)
                System.out.println(i);
        }
    }
    static class Thread2 extends Thread
    {
        public void run()
        {
            for (int i = 0;i<100;i++)
                System.out.println(i);
        }
    }
}