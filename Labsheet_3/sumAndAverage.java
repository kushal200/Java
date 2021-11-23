import java.util.Scanner;
public class sumAndAverage 
{
    public static void main(String[] args)

    {       
        int i,num=0,a=0;
        double avg;   
        System.out.println("Input the 5 numbers : ");  
        for (i=0;i<5;i++)
        {
            Scanner in = new Scanner(System.in);
            num = in.nextInt();
            a +=num;
        }
        avg=a/5;
        System.out.println("The sum of 5 no is : " +a+"\nThe Average is : " +avg);

    }
}
