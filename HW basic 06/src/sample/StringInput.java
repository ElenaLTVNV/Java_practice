package sample;

import java.util.Scanner;

public class StringInput {

		public void longStringInput() {
		Scanner sc = new Scanner(System.in);
			   
	    System.out.println("Please, enter your string: ");	
		String input = sc.nextLine();
		       
		String[] words = input.split(" ");
		String longestWord = "";
		       
		for(int i = 0; i < words.length; i++) {
		    if(words[i].length() > longestWord.length()) {
		    	longestWord = words[i];
		    } 	    	   
		}
		if(longestWord.length() == 0) {
		    System.out.println("Error!");
		     } else {
		       System.out.println(longestWord);
		     }  
		 }
	}

