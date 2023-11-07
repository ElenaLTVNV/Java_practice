package sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.println("Enter side a");
		a = sc.nextInt();
		System.out.println("Enter side b");
		b = sc.nextInt();
		System.out.println("Enter side c");
		c= sc.nextInt();
		
		if (a + b > c && b + c > a && a + c > b) {
			System.out.println("it is triangle");}
			else {  
		
			System.out.println(" It is not a triangle");}
		}}




