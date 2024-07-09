import java.io.FileWriter;
import java.io.IOException;
public class ReadnWrite
{
    public static void main(String[] args) throws IOException {
        String text = "Why be a king, if you can be a god";
        FileWriter obj = null;
        try
        {
            obj = new FileWriter("filee.txt");
            obj.write(text);
            System.out.println("Done!"); 
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