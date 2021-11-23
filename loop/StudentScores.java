
import java.util.Scanner;
public class StudentScores {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		final int ROWS = 2;
		final int COLS = 4;
		int i,j;
		double[][] scores = new double[ROWS][COLS];
		System.out.println("Enter Four Scores for:");
		for(i = 0;i<ROWS;i++) {
			System.out.println("Student "+(i+1)+" :");
			for(j = 0;j<COLS;j++) {
				System.out.print("Quiz "+(j+1)+" :");
				scores[i][j] = in.nextDouble();
			}
		}
		System.out.println("\nTotal and average for each student");
		totalAverageStd(scores);
		System.out.println("\nTotal and average for each Quiz");
		totalAverageQuiz(scores);
	}
	static void totalAverageStd(double[][] scores) {
		double total1= 0,total2= 0,average1,average2;
		int COLS = 4,i;
		for(i = 0;i<COLS;i++) {
			total1 += scores[0][i];
		}
		average1 = total1/COLS;
		for(i = 0;i<COLS;i++) {
			total2 += scores[1][i];
		}
		average2 = total2/COLS;
		System.out.println("Student 1: Total scores: "+total1+"        Average: "+average1);
		System.out.println("Student 2: Total scores: "+total2+"        Average: "+average2);
	}
	static void totalAverageQuiz(double [][]scores) {
		int i,j,COLS=4;
		double[] average =  new double[COLS];
		double[] total =  new double[COLS];		
			for(j = 0;j<4;j++) {
				total[j] = scores[0][j] + scores[1][j];
			}
			for(i = 0;i<4;i++) {
				average[i] = ((scores[0][i]+scores[1][i])/2);
			}
			for(i = 0;i<4;i++) {
				System.out.println("Quiz "+(i+1)+" : Total scores :"+total[i]+"    Average : "+average[i]);
			}
	}
}