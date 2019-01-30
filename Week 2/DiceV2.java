
/**
 * Write a description of class DiceV2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class DiceV2
{
   // instance variables - replace the example below with your own
    private int faceUp;
    private Random randnum; 

    /**
     * Constructor for objects of class Dice
     */
    public DiceV2()
    {
        // initialise instance variables
        faceUp = 0;
        randnum= new Random();
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void rollDice()
    {
        // gets a random value for the dice, and places it in faceUp
        faceUp=randnum.nextInt(6)+1;
    }
    
    public int reportDice()
    {
        //reports the current value of the dice
        return(faceUp);
    }
}
