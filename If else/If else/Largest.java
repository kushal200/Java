
/**
 * Write a description of class Largest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Largest
{
   
    public static void main (String [] args){
       
        int number1,number2;
        Scanner num1=new Scanner(System.in);
        System.out.println("Enter the first number:");
        number1=num1.nextInt();
        
        Scanner num2=new Scanner(System.in);
        System.out.println("Enter the second number:");
        number2=num2.nextInt();
        
        if(number1>number2){
         System.out.println("The largest number is " +number1);
        }
        else if(number2>number1){
        System.out.println("The lagrest number is " +number2);
        
        }
        else{
        System.out.println("Both are equal.");
        }
        
        
          
       
        
        
    
    }
    
}
