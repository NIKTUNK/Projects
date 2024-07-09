import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class Buffer
{
    public static void main(String[] args) throws IOException
    {
        StringBuilder stix = new StringBuilder();
        try (RandomAccessFile file = new RandomAccessFile("test.txt", "rw");
            FileChannel channel = file.getChannel())
        {
            ByteBuffer buf = ByteBuffer.allocate(25);
            int read_ = channel.read(buf);
            while (read_ > 0)
            {
                System.out.println("Read" + read_);
                buf.flip();
                while (buf.hasRemaining())
                {
                    stix.append((char) buf.get());
                }
                buf.clear();
                read_ = channel.read(buf);
            }
            String text2 = "\nLose yourself in the music";
            ByteBuffer buf2 = ByteBuffer.allocate(text2.getBytes().length);
            buf2.put(text2.getBytes());
            buf2.flip();
            channel.write(buf2);
            System.out.println(stix);
        }
    }
}