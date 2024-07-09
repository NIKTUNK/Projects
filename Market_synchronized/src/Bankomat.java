import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat
{
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();
        new Client("Nikita", lock);
        new Client("Oleg", lock);
        new Client("Ivan", lock);
        new Client("Egor", lock);
        new Client("Boris", lock);
        new Client("Sasha", lock);
        new Client("Dima", lock);
    }
}
class Client extends Thread
{
    Lock lock;
    String name;
    public Client(String name, Lock lock)
    {
        this.name = name;
        this.lock = lock;
        this.start();
    }
    public void run()
    {
        System.out.println(name + " waiting...");
        lock.lock();
        System.out.println(name + " works");
        try {
            sleep(5000);
            System.out.println(name + " ends");
            sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            lock.unlock();
        }
    }
}