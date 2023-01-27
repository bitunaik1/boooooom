package program;

import java.util.Scanner;

//count the total number of punctuation characters in String
public class PunctuationCharacters {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int count =0;
	for(int i = 0;i<s.length();i++){
		if(s.charAt(i)=='"' || s.charAt(i)==',' || s.charAt(i)=='?' || s.charAt(i)==';' || s.charAt(i)==':' || s.charAt(i)=='!') {
			count++;
		}
	}
	System.out.println("No. of puntuation char in Strings is:"+count);
}
}
