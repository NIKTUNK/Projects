public class Ex3
{
    public static void main(String[] args) {
        Thread thread3 = new Thread (new Thread3());
        thread3.start();

        Thread thread4= new Thread(new Thread4());
        thread4.start();
    }
    static class Thread3 implements Runnable
    {
        public void run()
        {
            for (int i = 0;i<100;i++)
                System.out.println(i);
        }
    }
    static class Thread4 implements Runnable
    {
        public void run()
        {
            for (int i = 0;i<100;i++)
                System.out.println(i);
        }
    }
}