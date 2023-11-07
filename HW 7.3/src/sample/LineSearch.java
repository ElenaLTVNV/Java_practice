package sample;

import java.util.Scanner;

public class LineSearch {

	public static void main(String[] args) { 
		
		int[] Arr= new int[] {8 , 3 , 5 , 38 , -8 , -83};
		
		System.out.println(indexNum(Arr));
		}
		public static int indexNum(int[] array) {
			System.out.println("Input number");
			Scanner sc = new Scanner(System.in);
			int num = sc.nextInt();	
			for( int i = 0; i < array.length; i++) {
				if(num == array[i]) {
					return i;
				}
				
			}
			return -1;
}
}