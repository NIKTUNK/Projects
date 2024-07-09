import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Picture
{
    public static void main(String[] args)
    {
        FileInputStream obj1;
        FileOutputStream obj2;
        try {
            obj1= new FileInputStream("C:\\Users\\Никита\\Pictures\\еж.jpg");
            obj2 = new FileOutputStream("new_file_pic.jpg");
            int i;
            while((i=obj1.read())!=-1)
            {
                obj2.write(i);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}