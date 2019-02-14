import java.util.Scanner;

public class RegularExpressions3
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        String userInput, result;
        String pattern = "(3[01]|[12][0-9]|0[1-9])/(1[0-2]|0[1-9])/[0-9]{4}";
        System.out.print("Enter a date:\t");
        userInput = keyboard.nextLine();
        if (userInput.matches(pattern))
            result = "Valid date format.";
        else
            result = "Invalid date format.";
        System.out.print(result);
    }
}

