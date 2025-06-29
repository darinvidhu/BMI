/* Darin Vidhu A 
   29 - 06 - 2025
   21:30
 */

import java.util.*;
import java.lang.*;
public class BMI {
    public static void main (String args []){
        Scanner sc  = new Scanner (System.in);
        
        String result = "";

        System.out.println("Enter the height (cm) : ");     // get the height from the user
        float height = sc.nextFloat();

        
        System.out.println("Enter the weight (kg) : ") ;  // get the weight from the user
        float weight = sc.nextFloat();

        float BMI = weight / ((height /100)*(height/100)); //Calculate the BMI 
        
        if (BMI < 18.5){
            result = "Underweight";                         // if BMI is under 18.5 you are underweigth
        }
        else if (BMI >= 18.5 && BMI <= 24.9){
            result = "Fit";                                 // if BMI is btwn 18.5 and 24.9 you are fit
        }
        else if (BMI >= 25 && BMI <= 29.9){
            result = "Overweight" ;                          // if BMI is btwn 25 and 29.9 you are Overweight
        }
        else if (BMI >= 30){
            result = "Obese";                               //if BMI is above 30 , then you are Obese
        }

        String BMIfinal = String.format("%.2f" , BMI);  // Use stirng format to round the values to decimal
        System.out.println ("Your BMI is :" + BMIfinal + "\nyou are " + result);


        
    }
}