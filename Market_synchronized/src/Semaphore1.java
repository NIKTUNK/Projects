import java.util.concurrent.Semaphore;
public class Semaphore1

{
    public static void main(String[] args)
    {
        Semaphore sem = new Semaphore(1);

        new My("Ivan1", sem);
        new My("Ivan2", sem);
        new My("Ivan3", sem);
        new My("Ivan4", sem);
        new My("Ivan5", sem);
        new My("Ivan6", sem);
        new My("Ivan7", sem);
        new My("Ivan8", sem);
        new My("Ivan9", sem);
    }
}

class My extends Thread
{
    String name;
    Semaphore callbox;
    public My (String name, Semaphore callbox)
    {
        this.name = name;
        this.callbox = callbox;
        this.start();
    }
    public void run()
    {
        try {
            System.out.println(name + " is waiting...");
            callbox.acquire();
            System.out.println(name + " is calling...");
            Thread.sleep(1500);
            System.out.println(name + " ends");
            Thread.sleep(1500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            callbox.release();
        }
    }
}