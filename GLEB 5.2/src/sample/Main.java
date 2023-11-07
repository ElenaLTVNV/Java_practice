package sample;

import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				Scanner sc = new Scanner(System.in);
				System.out.println("Choose the size of your array: ");
				int size = sc.nextInt();
				int[] arr = new int[size];
				
				for(int i = 0; i < size; i++) {
					System.out.println("Enter the num: ");
					arr[i] = sc.nextInt();
					System.out.println(Arrays.toString(arr));
				}
				
			}
		}
	
