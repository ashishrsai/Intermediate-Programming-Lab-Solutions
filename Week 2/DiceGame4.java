
/**
 * Write a description of class DiceGame4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DiceGame4
{
// instance variables - replace the example below with your own
    

    /**
     * 
     */
    public static void main(String[] args)
    {
        // initialise instance variables
        int noOfGoes = 12;
        int[] rolls = new int[noOfGoes];
        /* I might have done int[] rolls={0,0,0...} but 0 is the default value */ 
        
        int i;
        boolean[] winner = new boolean[6];
        boolean actualWinner=true;
        
        DiceV2 Dice1 = new DiceV2();

        for(i=0;i<6;i++){
            winner[i]=false; /* loop not needed as boolean arrays default to zero */
        }
        
        for(i=0; i<noOfGoes; i++){
            Dice1.rollDice();
            rolls[i]=Dice1.reportDice();
            System.out.println(rolls[i]);
            
            /* rolls[i] will be 1-6. Each element in array winner is turned to true if its number+1 has been rolled*/ 
            winner[(rolls[i]-1)]=true;
        }
        
        for(i=0; i<6; i++){
            if(winner[i]==false){
                actualWinner=false;
            }
        }    
         
        if(actualWinner){
            System.out.println("You're a winner");
        }
    }   
}
