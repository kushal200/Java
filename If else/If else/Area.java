
/**
 * Write a description of class Area here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class Area
{
    public static void main(String [] args){
        double leng,b, side, r;
        double area;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice:");
        String text=sc.nextLine();
        if(text=="rectangle"){
            leng=sc.nextDouble();
            System.out.println("Enter the length:");
            b=sc.nextDouble();
            System.out.println("Enter the breadth:");
            area=leng*b;
            System.out.printf("The area of rectangle is %d", +area);
        }
        else if (text=="circle"){
            r=sc.nextDouble();
            System.out.println("Enter the radius of circle:");
            area=3.14*r*r;
            System.out.printf("The area of circle is %f", +area);
        }
        else if(text=="square"){
            side=sc.nextDouble();
            System.out.println("Enter the side of square:");
            area=side*side;
            System.out.printf("The area of square is %f", +area);
        }

        
    }
}
