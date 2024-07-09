import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class BufferEx2
{
    public static void main(String[] args)
    {
        try (RandomAccessFile file = new RandomAccessFile("test2","rw");
            FileChannel channel = file.getChannel())
        {
            ByteBuffer buf1 = ByteBuffer.allocate(5);
            int i = channel.read(buf1);
            StringBuilder s = new StringBuilder();
            while (i > 0)
            {
                System.out.println("Read" + i);
                buf1.flip();
                while (buf1.hasRemaining())
                {
                    s.append((char) buf1.get());
                }
                buf1.clear();
                i = channel.read(buf1);
            }
            System.out.println(s);
        }
        catch (IOException e)
        {
            throw new RuntimeException(e);
        }
    }
}