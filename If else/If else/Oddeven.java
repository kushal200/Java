
/**
 * Write a description of class Oddeven here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Oddeven
{
  
    public static void main (String[] args){
         int num1;
         
        Scanner sc =new Scanner(System.in);
        num1=sc.nextInt();
        System.out.println("Enter the number:");
        if(num1%2==0){
        System.out.printf("The numebr is even %d", num1);
        }
        else{
        System.out.printf("The number is odd %d", num1);
        }
        
    
    }
}
