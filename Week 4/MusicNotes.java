import javax.swing.JOptionPane;
public class MusicNotes
{
  public static void main(String[] args)
  {
    int numberOfNotesRequired, aRandomNumber;
    int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0;
    char aChar;
    String result = "", userInput;
    String notes = "ABCDEFG", pattern = "[0-9]{1,2}";
    String prompt = "How many random notes would you like";
    prompt += "\n(Input must be in the range 1 to 50)?";
    userInput = JOptionPane.showInputDialog(null,prompt);
    if (userInput.equals(""))
	result =
       "Input required - number in the range 1 to 50";
    else if (!(userInput.matches(pattern)))
      result =
       "Numeric input: 1 to 2 digits in length is required";
    else if (Integer.parseInt(userInput) < 1 ||
             Integer.parseInt(userInput) > 50)
      result =
       "Program accepts numbers in the range 1 to 50 only.";
       else
          {
            for (int index = 0; index < Integer.parseInt(userInput);
                                             index++)
            {
       	 aRandomNumber = (int) (Math.random() * 7);
       	 aChar = notes.charAt(aRandomNumber);
       	 switch (aChar)
       	 {
       	   case 'A': a++; break;	case 'B': b++; break;
       	   case 'C': c++; break; case 'D': d++; break;
       	   case 'E': e++; break; case 'F': f++; break;
       		  case 'G': g++;
              }
            }
            result += "\nCount of each note is as follows:";
            result += "\nA: " + a + "\nB: " + b + "\nC: " + c;
            result += "\nD: " + d;
            result += "\nE: " + e + "\nF: " + f + "\nG: " + g;
          }
          JOptionPane.showMessageDialog(null,result);
         }
       }
