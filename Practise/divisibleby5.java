import java.util.Scanner; 
class divisibleby5{
public static void main(String[] args){

Scanner my=new Scanner(System.in);
int num1;

System.out.println("Enter the number:");
num1=my.nextInt();

if (num1%5==0)
{
System.out.println("It is Divisible by 5 .");
}
else
{
System.out.println("It is not Divisible by 5.");
}
}
}
