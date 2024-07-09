import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Buffered
{
    public static void main(String[] args) throws InterruptedException
    {
        long start2 = System.currentTimeMillis();
        FileReader obj2;
        try {
            int text2;
            obj2 = new FileReader("filee.txt");
            while ((text2 = obj2.read()) != -1) {
                System.out.print((char) text2);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long end2 = System.currentTimeMillis();
        System.out.println("\n" + (end2 - start2));

        long start = System.currentTimeMillis();
        BufferedReader obj1;
        try {
            int text;
            obj1 = new BufferedReader(new FileReader("filee.txt"));
            while ((text = obj1.read()) != -1) {
                System.out.print((char) text);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long end = System.currentTimeMillis();
        System.out.println("\n" + (end - start) + "\n ");
    }
}