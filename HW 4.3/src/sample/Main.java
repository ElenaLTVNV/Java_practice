package sample;

 import java.util.Scanner;

  public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int w ;
	    int h ;
	    System.out.println("Input w");
	    w = sc.nextInt();

	    System.out.println("Input h");
	    h = sc.nextInt();
	    
	    for(int i = 0; i < w; i++) {
	    	for(int k = 0; k < h; k++) {
	    		if(i == 0 || k == 0 || i == w-1 || k == h-1) {
	    			System.out.print("*");
	    			
	    }else {
	    	System.out.print(" ");
	    }
	    }
	    	System.out.println();
		}
	}
}

