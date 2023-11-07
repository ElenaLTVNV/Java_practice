package sample;

import java.util.Scanner;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Choose own size of array");
		
		int size =  sc.nextInt();
		int[]array = new int[size];
		
		for (int i = 0; i < size; i++) {
		System.out.println("Put your element");	
		array[i] = sc.nextInt();
		System.out.println(Arrays.toString(array));
    }
		System.out.println("Result: " + Arrays.toString(array));
	}
}
