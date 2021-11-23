
/**
 * Write a description of class Purchase here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Purchase
{
    public static void main (String[] args){
        double purchase_amt, dis_amt,net_amt;
        char type;

        Scanner sc= new Scanner(System.in);
        
        
        System.out.println("Enter L for laptop and D for deskop:");
        System.out.println("Enter the amount:");
        purchase_amt= sc.nextDouble();
        
        type=sc.nextChar();
        if(type=='L'){

        if(purchase_amt<=25000){
            net_amt=purchase_amt;
            System.out.println("There is no discount and the net amount is " +net_amt);
        }
        else if (purchase_amt>25000  && purchase_amt<=57000){
            dis_amt=0.05*purchase_amt;
            net_amt=purchase_amt-dis_amt;
            System.out.printf("There is 5% discount and net amount is ", +net_amt);
        }
        else if (purchase_amt>57000 && purchase_amt<=100000){
            dis_amt=0.075*purchase_amt;
            net_amt=purchase_amt-dis_amt;
            System.out.printf("There is 7.5% discount  and  net amount is " +net_amt);
        }
        else if (purchase_amt>100000){
            dis_amt=0.1*purchase_amt;
            net_amt=purchase_amt-dis_amt;
            System.out.printf("There is 10% discount, and the net ammount is " +net_amt);
        }
        
        
    }

    }

    
    
   
}

