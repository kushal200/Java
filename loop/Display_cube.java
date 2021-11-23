
/**
 * Write a description of class Display_cube here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Display_cube
{
    public static void main (String[] args){
    
        int num,mul;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the number:");
        num=input.nextInt();
        for(int i=1;i<=num;i++){
        mul=i*i*i;
        System.out.printf("Number is:%d and the cube of %d is:%d\n",i,i,mul);
        
        }
    }
    
}