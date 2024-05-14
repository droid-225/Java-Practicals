import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class Prac36 {
    public static void main(String[] args) {
        Path dir = Paths.get("C:\\Users\\aryan\\eclipse-workspace\\Java Practicals\\src\\Files"); // replace with your directory
        try (DirectoryStream <Path> stream = Files.newDirectoryStream(dir)) {
            for (Path path : stream) {
                BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
                System.out.println("File: " + path.getFileName());
                System.out.println("Creation time: " + attr.creationTime());
                System.out.println("Last modified time: " + attr.lastModifiedTime());
                System.out.println("Size: " + attr.size());
                System.out.println("---------------------------");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
