import java.util.Scanner;
public class oddeven{
public static void main(String[] args){
    Scanner anup=new Scanner(System.in);
    int num1;
    System.out.println("Enter the number:");
    num1=anup.nextInt();
    
    if (num1%2==0){
    System.out.println(num1+ " is even");
    }
    
    else
    {
    System.out.println(num1+ " is odd");
    }
    

}

}