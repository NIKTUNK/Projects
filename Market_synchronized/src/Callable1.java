import java.util.Scanner;
import java.util.concurrent.*;

public class Callable1
{
    public static int max;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input your number: ");
        max = scanner.nextInt();
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Call call = new Call(max);
        Future<Integer> res= executorService.submit(call);
        try {
            System.out.println("Your factorial is: " + res.get());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
        executorService.shutdown();
    }
}
class Call implements Callable<Integer>
{
    int f;
    public Call(int f)
    {
        this.f = f;
    }
    int a = 1;
    public Integer call()
    {
        for (int i = 1; i< Callable1.max+1; i++)
            a *=i;
        return a;
    }
}