package sample;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		int numer1;
		int numer2;
		int numer3;
		int numer4;
		int theBigNumer;

		System.out.println("Enter numer1");
	    numer1 = sc.nextInt();
	    System.out.println("Enter numer2");
	    numer2 = sc.nextInt();
	    System.out.println("Enter numer3");
	    numer3 = sc.nextInt();
	    System.out.println("Enter numer4");
	    numer4 = sc.nextInt();
	    
	    theBigNumer = numer1;
	    if (numer2 > theBigNumer) {
	    theBigNumer = numer2;
	    }
	    if (numer3 > theBigNumer) {
	    	theBigNumer = numer3; 
	    }
	    if (numer4 > theBigNumer) {
	    	theBigNumer = numer4; 
	    }
	    System.out.println(theBigNumer);   

	}
}
