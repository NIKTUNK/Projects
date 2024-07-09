public class My_shop
{
    public static void main(String[] args)
    {
        Market market = new Market();
        Consumer cons = new Consumer(market);
        Producer prod = new Producer(market);
        Thread consumer = new Thread(cons);
        Thread producer = new Thread(prod);
        consumer.start();
        producer.start();
    }
}
class Market
{
    int breadCount = 0;
    synchronized void getBread()
    {
        while (breadCount < 1)
        {
            try
            {
                wait();
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
        breadCount--;
        System.out.println("Consumer take\t 1 bread   Bread count = " + breadCount);
        notifyAll();
    }
    synchronized void putBread()
    {
        while (breadCount > 10)
        {
            try
            {
                wait();
            } catch (InterruptedException e)
            {
                throw new RuntimeException(e);
            }
        }
        breadCount++;
        System.out.println("Producer put\t 1 bread   Bread count = " + breadCount);
        notifyAll();
    }
}
class Producer implements Runnable
{
    Market market;
    Producer(Market market)
    {
        this.market = market;
    }
    public void run()
    {
        for (int i = 0; i < 10; i++)
            market.putBread();
    }
}
class Consumer implements Runnable
{
    Market market;
    Consumer(Market market)
    {
        this.market = market;
    }
    public void run()
    {
        for (int i = 0; i < 10; i++)
            market.getBread();
    }
}