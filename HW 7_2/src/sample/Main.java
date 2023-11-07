package sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	    System.out.println("Input h");
	int h = sc.nextInt();
    System.out.println("Input w");
int w = sc.nextInt();
	main(h, w);
	}
	
	public static void main(int h, int w) {
		
		for(int j = 1; j <= h; j++) {
			for(int i = 1; i <= w; i++) {
				System.out.print("* ");
			}
			System.out.println();
			}
	}

}
