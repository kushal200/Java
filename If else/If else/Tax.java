
/**
 * Write a description of class Tax here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Tax
{
   public static void main(String[] args){
    int amount;
    double taxable_amount;
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter the amount:");
    amount=sc.nextInt();
     if (amount<=100000)
     {
        System.out.println("No Tax.");
        }
        else if(amount>100000 && amount<=150000){
            taxable_amount=0.1*amount;
            System.out.println("The taxable amount is " + taxable_amount);
            }
            else if(amount>150000 && amount<=250000){
                taxable_amount=5000+(0.2*150000);
                System.out.println("The taxable amount is " +taxable_amount);
              
            
            }
            else if(amount>250000){
            taxable_amount=25000+(0.3*250000);
            System.out.println("The taxable amount is " +taxable_amount);
           
            }
    }
    
    
}
