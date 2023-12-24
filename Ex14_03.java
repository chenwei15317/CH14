import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Ex14_03 {
    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        try {
            System.out.print("Input an integer (n): ");
            String input = reader.readLine();

            int n = Integer.parseInt(input);

            int sum = calculateSum(n);

            System.out.println("Sum of 1+2+...+" + n + " is: " + sum);

        } 
        
        catch (IOException | NumberFormatException e) {
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

    private static int calculateSum(int n) {
        return n * (n + 1) / 2;
    }
}
