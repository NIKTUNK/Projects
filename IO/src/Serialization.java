import java.io.*;
import java.util.ArrayList;

public class Serialization
{
    public static void main(String[] args)
    {
        ArrayList list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        try {
            ObjectOutputStream obj2 = new ObjectOutputStream(new FileOutputStream("serial.txt"));
            obj2.writeObject(list);
            ObjectInputStream obj1 = new ObjectInputStream(new FileInputStream("serial.txt"));
            System.out.println(obj1.readObject());
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}