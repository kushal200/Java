import java.util.Scanner;
public class Positiveinteger {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int count = 0;
        System.out.println("Enter the numbers: ");
        int number = sc.nextInt();
        int numbers = number;
        
        while (number != 0) {
            //int digit = number % 10;
            number /= 10;
            count++;
        }
        
        System.out.println("The number of digits in the given number " + numbers + " is: " + count);
    }

}
