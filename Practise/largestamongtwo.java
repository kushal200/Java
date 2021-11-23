import java.util.Scanner;
public class largestamongtwo{

public static void main(String[] args){
int num1,num2;
   Scanner larg=new Scanner(System.in);
   
   System.out.println("Enter the first number:");
   num1=larg.nextInt();
   
   System.out.println("Enter the second number:");
   num2=larg.nextInt();
   
   if(num1>num2){
    
       System.out.println("The largest number is " +num1);
    }
    else if (num2>num1)
    {
        System.out.println("The largest is " +num2);
    }
    else
    System.out.println("Both are equal");
    
}

}
