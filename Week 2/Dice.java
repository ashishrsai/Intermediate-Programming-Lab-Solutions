
/**
 * Represents a Dice in a game
 *
 * @author (jim buckley)
 * @version (14/01/2019)
 */
import java.lang.Math;

public class Dice
{
    // instance variables - replace the example below with your own
    private int faceUp;

    /**
     * Constructor for objects of class Dice
     */
    public Dice()
    {
        // initialise instance variables
        faceUp = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return  the sum of x and y
     */
    public void rollDice()
    {
        // gets a random value for the dice, and places it in faceUp
        faceUp=((int)Math.random()*6)+1;
    }
    
    public int reportDice()
    {
        //reports the current value of the dice
        return(faceUp);
    }
}
