/* Write a program that will give following output:
input:chattogram
 output: C8M */

package String_Manipulation;
import java.util.Scanner;

public class Division_Country {
    public static void main(String[] args) {
        System.out.println("Enter your district name: chattogram");

        Scanner input = new Scanner(System.in);
        String division;
        int index;

        System.out.println("Enter your district: ");
        division = input.nextLine();


        String firstIndex = String.valueOf(division.charAt(0)).toUpperCase();
        String secondIndex = String.valueOf(division.charAt(9)).toUpperCase();

        index = division.lastIndexOf('a');

        String result = firstIndex + index + secondIndex;

        System.out.println(result);

        input.close();

    }
}
