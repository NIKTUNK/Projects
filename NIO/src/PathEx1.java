import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathEx1
{
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Program Files\\Java\\NIO\\test3.txt");
        Path path1 = Paths.get("C:\\Users\\Никита\\Desktop\\Testik");
    //    System.out.println(path.toAbsolutePath());
    //    System.out.println(path.getRoot());
    //    System.out.println(path.getParent());
    //    System.out.println(path1.getParent());
        if(!Files.exists(path))
            Files.createFile(path);
        if(!Files.exists(path1))
            Files.createDirectory(path1);
        System.out.println(path1.resolve(path.getFileName()));
        Files.copy(path, path1.resolve(path.getFileName()));
        System.out.println("Done!");
    }
}