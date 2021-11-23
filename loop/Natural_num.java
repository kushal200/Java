
/**
 * Write a description of class Natural_num here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Natural_num
{
    public static void main (String[] args){
        int num, sum=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        num= input.nextInt();
        
        
        for(int i=1;i<=num;i++)
        {
           
            System.out.println(i+"\t");
            sum=sum+i;
            
            
        }
        System.out.println("the sum of natural number is:" +sum);
        
    
        
    }
   
    
}
