import java.io.*;
public class ecbb {
    public static void main(String[] args) {
        // Write to file using byte streams
        try (FileOutputStream fos = new FileOutputStream("k2.txt")) {
            String data = "Hello, world!";
            byte[] bytes = data.getBytes();
            fos.write(bytes);
            System.out.println("Data has been written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }

        // Read from file using byte streams
        try (FileInputStream fis = new FileInputStream("k2.txt")) {
            int byteData;
            while ((byteData = fis.read()) != -1) {
                 System.out.print((char) byteData);
            }
            System.out.println("Data read from file: ");
        } catch (IOException e) {
             System.out.println("Error reading from file");
              
        }
    }
}
