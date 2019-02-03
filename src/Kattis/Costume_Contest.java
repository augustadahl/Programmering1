package Kattis;

//incomplete

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Costume_Contest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		String[] costume = new String[N];
		
		for (int i = 0; i < costume.length; i++) {
			costume[i] = sc.nextLine();
		}
		
		ArrayList<String> CostName = new ArrayList<String>();
		ArrayList<Integer> CostCount = new ArrayList<Integer>();
		
		boolean[] counted = new boolean[N];
		
		int CostNameIndex = -1;
		
		for (int i = 0; i < costume.length; i++) {
			if (!counted[i]) {
				CostName.add(costume[i]);
				
				CostNameIndex++;
				int ammount = 0;
				
				for (int j = 0; j < costume.length; j++) {
					if (costume[i].equals(CostName.get(CostNameIndex))) {
						ammount++;
					}
				}
				CostCount.add(ammount);
	
			}
		}
		
		int smallest = 0;
		
		for (int i = 0; i < CostCount.size(); i++) {
			if (CostCount.get(i) < smallest) {
				smallest = i;
			}
		}
		
		ArrayList<String> best = new ArrayList<String>();
		
		for (int i = 0; i < CostCount.size(); i++) {
			if (CostCount.get(i) == smallest) {
				best.add(CostName.get(i));
			}
		}
		
		String[] out = new String[best.size()];
		
		for (int i = 0; i < best.size(); i++) {
			out[i] = best.get(i);
		}
		
		Arrays.sort(out);
		
		for (int i = 0; i < out.length; i++) {
			System.out.println(out[i]);
		}
		
		
//		String[] output = Arrays.sort(best.toArray());
//		
//		Arrays.sort(best.toArray());
//		
//		for (int i = 0; i < best.size(); i++) {
//			System.out.println(best.get(i));
//		}
	}
	
}
