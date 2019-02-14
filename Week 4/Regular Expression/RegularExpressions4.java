//Have to include centralisation in governance

import java.util.Scanner;

public class RegularExpressions4
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String userInput, result;
        String pattern = "(2[0-3]|1[0-9]|0[0-9]):([0-5][0-9])";
        System.out.print("Enter a time:\t");
        userInput = keyboard.nextLine();
        if (userInput.matches(pattern))
            result = "Valid time format.";
        else
            result = "Invalid time format.";
        System.out.print(result);
    }
}
