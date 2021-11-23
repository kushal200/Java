import java.util.Scanner;
public class triangle{
public static void main(String[] args)
{
float a,b,c,side;

Scanner sc=new Scanner(System.in);

    System.out.println("Enter the three side of triangle:");
    a=sc.nextFloat();
    b=sc.nextFloat();
    c=sc.nextFloat();
    
   if(a+b>c || b+c>a || a+c>b){
       System.out.println("It is valid.");
       if(a==b || b==c || c==a){
        System.out.println("It is Equilateral Triangle.");
        }
         else if((a==b && b==c) || ((b==c) && (c==a)) ||((c==a)||(a==b) ) )
         {
             System.out.println("It is Isosceles Triangle.");
            }
          
        
       
       
    
    }
    else
    {
        System.out.println("It is not valid.");
    }
    
    
    
}

}
