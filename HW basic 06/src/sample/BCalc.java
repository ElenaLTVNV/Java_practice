package sample;

import java.util.Scanner;

	public class BCalc {
	public void CalculatingB() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter your string: ");	
		String input = sc.nextLine();
		
		String a = input.toLowerCase();
		int bCount = 0;
		
		for(int i = 0; i < a.length(); i++) {
			if(a.charAt(i) == 'b') {
				bCount++;
			}
		}	
		System.out.println(bCount);	
	}
	}
