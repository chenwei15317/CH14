import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ex14_02 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Input a string: ");
            String inputString = reader.readLine();

            String upperCaseString = inputString.toUpperCase();

            System.out.println("Original string: " + inputString);
            System.out.println("Uppercase string: " + upperCaseString);

        }
        
        catch (IOException e) {
            e.printStackTrace();
        } 
        
        finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            }          
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
