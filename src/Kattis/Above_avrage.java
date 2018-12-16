package Kattis;

import java.util.Locale;
import java.util.Scanner;

public class Above_avrage {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int cases = sc.nextInt();
		
		double[] results = new double[cases];
		
		for (int i = 0; i < cases; i++) {
			
			int students = sc.nextInt();
			
			int gradetot = 0;
			
			int[]grade = new int[students];
					
			for (int j = 0; j < students; j++) {
				
				int temp = sc.nextInt();
				gradetot += temp;
				grade[j] = temp;
				
			}
			
			double average = (double) gradetot / students;
			
			int above = 0;
			
			for (int j = 0; j < students; j++) {
				if (grade[j] > average) {
					above++;
				}
			}
			
			results[i] = ((double) above / students) * 100;
			
		}
		
		for (int i = 0; i < results.length; i++) {
			System.out.printf(Locale.ROOT,"%.3f%%\n",results[i]);
			
		}
		
		
	}
}
