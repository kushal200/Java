
/**
 * Write a description of class RightAngleTriangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class RightAngleTriangle
{
   
    public static void main(String[]args){
    int row,k=1;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number of rows:");
    row=input.nextInt();
    for(int i=1;i<=row;i++){
       
     for(int j=1;j<=i;j++){
        System.out.println(k++);
        System.out.println("");
        }
    
    }
    
    }
}
