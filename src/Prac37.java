import java.io.*;

public class Prac37 {
    public static void main(String[] args) {
        File inputFile = new File("C:\\Users\\aryan\\eclipse-workspace\\Java Practicals\\src\\Files\\source.txt"); // replace with your source file
        File outputFile = new File("C:\\Users\\aryan\\eclipse-workspace\\Java Practicals\\src\\Files\\destination.txt"); // replace with your destination file

        try (
            InputStream input = new FileInputStream(inputFile);
            OutputStream output = new FileOutputStream(outputFile);
        ) {
            byte[] buf = new byte[1024];
            int bytesRead;

            while ((bytesRead = input.read(buf)) > 0) {
                output.write(buf, 0, bytesRead);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Text Copied From Source to Destination!");
    }
}

