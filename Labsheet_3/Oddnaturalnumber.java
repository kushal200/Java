import java.util.Scanner;
public class Oddnaturalnumber
{
    public static void main(String[] args)
    {
        int i,num,sum=0;
        System.out.print("Input number of terms is: ");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.println ("\nThe odd numbers are :");
        for(i=1;i<=num;i++)
        {
            System.out.println (2*i-1);
            sum+=2*i-1;
        }
        System.out.println ("The Sum of odd Natural Number upto " +num+" terms is: " +sum);
    }
}
