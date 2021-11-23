import java.util.Scanner;
public class checktax{
public static void main(String[] args){

double income_after_tax,tax_amount;
 Scanner amt=new Scanner(System.in);
 
 System.out.println("Enter your annual income:");
  double income=amt.nextDouble();
 if(income>=0 || income<=100000)
 {
     System.out.println("No Tax");
 }
 else if (income>=100001 || income<=150000)
 {
     tax_amount=0.1*income;
     income_after_tax=income-tax_amount;
     System.out.println(" Your tax amount is" +tax_amount);
     System.out.println("Income after tax is" +income_after_tax);
     
 }
 else if (income>=150001  ||  income<=250000)
 {
   tax_amount=5000+0.2*income;
   income_after_tax=income-tax_amount;
   System.out.println("Your tax amount is" +tax_amount);
   System.out.println("Income after tax is" + income_after_tax);
  }
  else if(income>=250001)
  {
      tax_amount=25000+0.3*income;
      income_after_tax=income-tax_amount;
      System.out.println("Your tax amount is" +tax_amount);
      System.out.println("Income after tax is" +income_after_tax);
   }
    
    
    
}
}
