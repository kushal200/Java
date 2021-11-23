import java.util.Scanner;
class botheven{
public static void main(String[] args){
    Scanner one=new Scanner(System.in);
    int num1;
    
    System.out.println("Enter the number");
    num1=one.nextInt();
    
    if(num1%2==0  && num1%5==0) {
    System.out.println("The number is even and divisible by 5.");
     
    }
    else
    {
    System.out.println("The number is not even and cannot be divisible by 5.");
    }
    
    
}    
}
