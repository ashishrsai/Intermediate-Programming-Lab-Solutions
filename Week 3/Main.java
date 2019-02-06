
/**
 * The controlling class
 *
 * @author (Ashish Rajendra Kumar Sai)
 * @version (06/02/2019)
 */

 import java.util.Scanner;

 public class Main {


     public static void main(String[] args) {

         temp temperature = new temp();

         Scanner sc = new Scanner(System.in);
         int count = 1;


         System.out.println("Hello World! Welcome to this amazing program that will convert temp for you");

         do {

             System.out.println("Please select the unit of the temperature: 1) Celsius, 2)Fahrenheit, 3)Kelvin");
             int unit = sc.nextInt();
             System.out.println("Please enter the value of the temperature");
             double value = sc.nextDouble();

             //If else condition to call the right methods
             if (unit == 1){
                 temperature.setTheValueInC(value);
                 printValue(temperature);

             } else if (unit == 2){
                 temperature.setTheValueInF(value);

                 printValue(temperature);

             } else if (unit == 3){
                 temperature.setTheValueInK(value);
                 printValue(temperature);
             }

             System.out.println("Please select one of following: 1) Repeat, 2) Terminate the program");
             count = sc.nextInt();

         }while (count == 1);




     }

     private static void printValue(temp temperature) {
         double c;
         double f;
         double k;
         c = temperature.getC();
         f = temperature.getF();
         k = temperature.getK();

         System.out.println("The temperature is "+c+" Celsius , "+f+" Fahrenheit , "+k+" Kelvin");
     }


 }
