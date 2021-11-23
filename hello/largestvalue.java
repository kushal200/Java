import java.util.Scanner;
class largestvalue{
public static void main(String[] args)
{
    int num1,num2;
    Scanner larg=new Scanner(System.in);
    
    System.out.println("Enter the First number:");
    num1=larg.nextInt();
    
    System.out.println("Enter the second number:");
    num2=larg.nextInt();
    
    if(num1>num2){
    System.out.println("The largest Nuber=" +num1);
    }
    
    else if(num2>num1)
    {
        System.out.println("The Largest Nunber=" +num2);
       
    }
    else{
    System.out.println("The number are equal");
    }
    
    
    

    
    
    
    
}
}
