import java.io.FileWriter;
import java.io.IOException;

public class Ex14_06 {
    public static void main(String[] args) {
        char[] hi = {'H', 'e', 'l', '1', 'o', ' ', 'J', 'a', 'v', 'a', '!', '\r', '\n'};

        try (FileWriter fileWriter = new FileWriter("hello.txt")) {
            fileWriter.write(hi);
            System.out.println("Data has been written to hello.txt");
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
