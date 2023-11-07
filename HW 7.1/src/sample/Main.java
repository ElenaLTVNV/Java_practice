package sample;

public class Main {

	public static void main (String [] args) {
		
		int[] array = new int [] { 7 , 9, -7, -9, -23, 23, 8};
		
		int maximum = detectMax(array);
		System.out.println(maximum);
		}
		
		
		public static int detectMax(int[] array) {
			int bigMax = array [0];		
		for (int i = 0; i < array.length; i++) {
			if (array [i] > bigMax) {
				bigMax = array [i];
		}
		}
		return bigMax;
			}
			}
