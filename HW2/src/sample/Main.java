package sample;

import java.util.Scanner;

public class Main {

public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double sideA = 0.3;
		double sideB = 0.4;
		double sideC = 0.5;
		double halfP = ((sideA+sideB+sideC)/2);
		double result = Math.sqrt(halfP * (halfP - sideA) * (halfP - sideB) * (halfP - sideC));
		System.out.println(result);		
	} 
}
