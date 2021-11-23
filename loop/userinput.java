
/**
 * Write a description of class hellow here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */



import java.util.Scanner;
public class userinput {
	public static void main(String[] args) {
		int num, sum=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number:");
		 num = input.nextInt();
		for (int i=1; i<=num; i++) {
			System.out.println(i);
			sum=sum+i;
		}
		System.out.println("the sum of natural number is:" +sum);
}
}