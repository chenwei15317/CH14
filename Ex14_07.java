import java.io.FileWriter;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Ex14_07 {
    public static void main(String[] args) {
        char[] hi = {'H', 'e', 'l', '1', 'o', ' ', 'J', 'a', 'v', 'a', '!', '\r', '\n'};
        String filePath = "C:\\Users\\Jim\\VS\\Class\\CH14\\hello.txt";

        try (FileWriter fileWriter = new FileWriter(filePath, true)) {
            fileWriter.write(hi);
            fileWriter.write("Welcome!");
            System.out.println("Data has been written to " + filePath);
            readAndPrintFile(filePath);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void readAndPrintFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            System.out.println("File content:");
            reader.lines().forEach(System.out::println);
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
