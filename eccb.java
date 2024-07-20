import java.io.*;
public class eccb {
    public static void main(String[] args) {
        // Write to file using character-based streams
        try (FileWriter fw = new FileWriter("k3.txt")) {
            String data = "Hello, world!";
            fw.write(data);
            System.out.println("Data has been written to file successfully.");
        } catch (IOException e) {
            System.out.println("Error writing to file");
        }

        // Read from file using character-based streams
        try (FileReader fr = new FileReader("k3.txt")) {
            int charData;
            while ((charData = fr.read()) != -1) {
                 System.out.print((char) charData);
            }
            System.out.println("Data read from file: ");
        } catch (IOException e) {
            System.out.println("Error reading from file: ");
        }
    }
}
