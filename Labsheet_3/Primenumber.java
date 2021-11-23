import java.util.Scanner;
public class Primenumber 
{
 public static void main(String[] args) 
 {
  int remainder;
  boolean isPrime=true;
  Scanner in = new Scanner(System.in);
  System.out.print("Input a number : ");
  int num = in.nextInt(); 
  for(int i=2;i<=num/2;i++)
  {
     remainder=num%i;
     if(remainder==0)
     {
        isPrime=false;
        break;
     }
  }
 
  if(isPrime)
     System.out.println(num + " is a Prime number");
  else
     System.out.println(num + " is not a Prime number");
    }
}
