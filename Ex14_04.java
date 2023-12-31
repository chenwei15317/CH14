import java.io.*;

public class Ex14_04 {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("donkey.txt"), "UTF-8"));

            int intVal;

            while ((intVal = bufferedReader.read()) != -1) {
                System.out.print((char) intVal);
            }

            bufferedReader.close();

            int chineseCharacterCount = countChineseCharacters("donkey.txt");
            System.out.println("\nNumber of Chinese characters in donkey.txt: " + chineseCharacterCount);

        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static int countChineseCharacters(String filePath) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(filePath), "UTF-8"));

        int chineseCharCount = 0;
        int intVal;

        while ((intVal = reader.read()) != -1) {
            char currentChar = (char) intVal;

            if (Character.UnicodeBlock.of(currentChar) == Character.UnicodeBlock.CJK_UNIFIED_IDEOGRAPHS) {
                chineseCharCount++;
            }
        }
        reader.close();
        return chineseCharCount;
    }
}
