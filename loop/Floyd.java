import java.util.Scanner;
public class Floyd{
public static void main(String [] args)
{
 int a,i,j;
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter the number of row");
 a=sc.nextInt();
 for(i=0;i<=a;i++){
    
    for(j=0;j<=i;j++)
    {
        if((i+j)%2==0)
        {
            System.out.printf("0");
     
        }
       
     
    else {
        System.out.printf("1");
    }
}
     System.out.println();
    }
}

}
