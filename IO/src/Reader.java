import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Reader
{
    public static void main(String[] args) throws IOException
    {
        int chart;
        FileReader obj = null;
        while (true)
        {
            try
            {
                obj = new FileReader("filee.txt");
                while ((chart = obj.read()) != -1)
                {
                    System.out.print((char) chart);
                }
                Scanner
                System.out.println();
                System.out.println("Done");
                break;
            }
            catch (IOException e)
            {
                throw new RuntimeException(e);
            }
            finally
            {
                obj.close();
            }
        }
    }
}