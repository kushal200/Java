
/**
 * Write a description of class Divisible here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Divisible
{
   
    public static void main(String[] args){
     int num;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter the number:");
     num=sc.nextInt();
     
     if(num%5==0){
        System.out.printf("%d is divisible by 5.", num);
       
    
        }
        else{
         System.out.printf("%d is not divisible b 5.", num);
        }
        
        
     
     
     
     
    }
}
