package program;

import java.util.Scanner;

//program to count the number of words in the string
public class CountNumberOfWords {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int count = 0;
	for(int i = 0; i<=s.length()-1;i++) {
		;
		if((i==0 && s.charAt(i)!=' ')|| s.charAt(i)!=' ' && s.charAt(i-1)==' ') {
			count++;	
		}
		
	}
	System.out.println("Number of word is: "+count);
}
}
