import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex14_08 {
    public static void main(String[] args) {
        String filePath = "proverb.txt";
        //我自己要打C:\\Users\\User\\Desktop\\Ch14\\Ch14\\Ex14_08\\proverb.txt才找得到
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                if (line.contains("You can't be perfect but you can be unique.")) {
                    continue;
                }
                 else {
                    System.out.println(line);
                }
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
