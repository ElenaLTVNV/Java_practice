package sample;

import java.util.Scanner;

 public class Main {

   public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.print("Enter number n (4 < n < 16)");
        n = sc.nextInt();
        
        if (n> 4 ^ n < 16) {
            System.out.println("The number should be beetwen 4 to 16.");
        } else {
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
            System.out.println(" Factorial = " + factorial);
        }
	      }
	    }
	  
	    
	


