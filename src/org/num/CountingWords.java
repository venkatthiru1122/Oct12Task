package org.num;
import java.util.Scanner;
public class CountingWords {
public static void main (String [] args) {
	Scanner s =  new Scanner(System.in);
	
	int count = 0;
	
	System.out.println("Input : ");
	String s1 = s.nextLine();
	
	String[] word = s1.split("\\s");
	for(int i=0; i<word.length; i++ ) {
		
	count++;		
	}
	System.out.println("Total Words in the Sentence : "+count);
	System.out.println("Finish");
	System.out.println("100%");
}
}
