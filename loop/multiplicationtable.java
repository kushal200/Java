import java.util.Scanner;
public class multiplicationtable{

    public static void main(String [] args){
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:");
        n=sc.nextInt();
        for(int i=0;i<=10;i++){
            System.out.printf("%d * %d = %d\n",n,i,n*i);

        }

    }
}
