import javax.swing.JOptionPane;
public class RandomMusicNotes1
{
  public static void main(String[] args)
  {
    int musicNotes[] = new int[7];
    int howManyNotes, aRandomNumber, index;
    String pattern = "[0-9]{1,2}", userInput, results = "";
    String prompt = "How many random notes would you like";
    prompt += "\n(Input must be in the range 1 to 50)?";
    userInput = JOptionPane.showInputDialog(null,prompt);
    if ((userInput.equals("")))
     results =
      "Input required, numeric value in the range 1 to 50 required.";
    else if (!(userInput.matches(pattern)))
	results = "Format of user input is incorrect.";
    else if (Integer.parseInt(userInput) < 1 ||
             Integer.parseInt(userInput) > 50)
     results =
       "Program accepts numbers in the range 1 to 50 only.";
       else
       {
   	howManyNotes = Integer.parseInt(userInput);
         for (index = 0; index < howManyNotes; index++)
         {
   	  aRandomNumber = (int) (Math.random() * 7);
   	  musicNotes[aRandomNumber]++;
         }
         for (char i = 'A'; i <= 'G'; i++)
           results += i + ": " + musicNotes[i - 65] + "\n";
       }
       JOptionPane.showMessageDialog(null,results);
     }
   }
