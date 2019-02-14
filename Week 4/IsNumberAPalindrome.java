public class IsNumberAPalindrome 
{
 public static void main(String args[])
 {
   String errorMsg1 = "No command-line argument provided.";
   String errorMsg2
     = "Incorrect number of command-line arguments provided.";
   String errorMsg3 = "Format of user input is invalid.";
   String pattern = "[0-9]{1,9}", result;
   boolean isPalindrome;
   if (args.length == 0)                 result = errorMsg1;
   else if (args.length != 1)            result = errorMsg2;
   else if (!(args[0].matches(pattern))) result = errorMsg3;
   else
   {
     isPalindrome = checkIfPalindrome(args[0]);
     if (isPalindrome)
       result = "Number input is palindromic.";
     else
       result = "Number input is not palindromic.";
   }
   System.out.println(result);
 }

 public static boolean checkIfPalindrome(String input)
  {
    int number = Integer.parseInt(input);
    int copyOfNumber = number, reverse = 0, remainder;
    while (number != 0)
    {
      remainder = number % 10;
      reverse = reverse * 10 + remainder;
      number = number / 10;
    }
    System.out.println("Number input:\t\t" + copyOfNumber);
    System.out.println("Number in reverse:\t" + reverse);
    if (copyOfNumber == reverse)
      return true;
    else
      return false;
  }
 }
