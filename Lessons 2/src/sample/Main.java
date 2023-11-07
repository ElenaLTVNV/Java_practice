package sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input coffe cost (UAH) and press Enter");
		
		
int coffeCost = sc.nextInt();

System.out.println("Input cups and press Enter");

int cups=sc.nextInt();

int totalSum;
totalSum= coffeCost * cups;
	
	System.out.println(totalSum +"UAH");
	
	}

}
