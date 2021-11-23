import java.util.Scanner;
public class Increasenumber
{
    public static void main(String[] args)
    {
        int i,j,num,k=1;
        System.out.print("Input number of rows : ");
        Scanner in = new Scanner(System.in);
        num = in.nextInt();

        for(i=1;i<=num;i++)
        {
            for(j=1;j<=i;j++)
            {
                System.out.print(k++);
            }
            System.out.println("");
        }  		
    }
}
