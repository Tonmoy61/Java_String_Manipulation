/* Write a program to convert each 1st char to uppercase from a string
        Input: rahim lives in sylhet
        Output: Rahim Lives in Sylhet */

package String_Manipulation;
import java.util.Scanner;

public class Convert_Uppercase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        StringBuilder UpperCaseLetter = new StringBuilder();

        System.out.println("Enter your words: ");

        String str = input.nextLine();

        Scanner lineScan = new Scanner(str);

        while(lineScan.hasNext()) {
            String word = lineScan.next();
            UpperCaseLetter.append(Character.toUpperCase(word.charAt(0))).append(word.substring(1)).append(" ");
        }
        System.out.println(UpperCaseLetter);

        input.close();
        lineScan.close();
    }
}
