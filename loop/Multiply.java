
/**
 * Write a description of class Multiply here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Multiply
{
    
    public static void main(String[] args){
    int num,i;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter the number for multiplication table:");
    num=input.nextInt();
    for(i=1;i<=10;i++){
    System.out.printf("%d * %d=%d\n",num,i,num*i);
    }
}
}
