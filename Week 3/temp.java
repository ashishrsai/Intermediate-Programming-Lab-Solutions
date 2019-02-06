
/**
 * The temp class
 *
 * @author Ashish Rajendra Kumar Sai
 * @version (06/02/2019)
 */


 public class temp {
     //Variables to store the value of temp
     private double c,k,f;

     //Constructor

     public temp(){

         c = 0.0;
         k = 0.0;
         f = 0.0;
     }

     //Method to execute if the value of temp given by the user is in C
     public void setTheValueInC(double cel){
         c=cel;
         //Now we should convert c to k and f
         //Converting c to f
         f = (cel*1.8)+32;
         //Converting c to k
         k = cel + 273.15;
         //Since this is a setter function, we do not return anything
     }


     //Method to execute if the value of temp given by the user is in F

     public void setTheValueInF(double fer){
         f = fer;
         //Now we should convert f to c and k
         //Converting f to c
         c = (fer - 32 ) * (0.55) ;
         //Converting f to k (Since we already have the value of C we can use the exiting formula for conversion)
         k = c + 273.15;
         //Since this is a setter function, we do not return anything
     }

     //Method to execute if the value of temp given by the user is in K

     public void setTheValueInK(double kel){
         k = kel;
         //Now we should convert k to c and f
         //Converting k to c
         c = kel - 273.15 ;
         //Converting k to f (Since we already have the value of C we can use the exiting formula for conversion)
         f = (c*(1.8))+32;
         //Since this is a setter function, we do not return anything
     }

     //getter for C
     public double getC (){
         return c;
     }

     //getter for F

     public double getF(){
         return f;
     }

     //getter for K
     public double getK(){
         return k;
     }

 }
