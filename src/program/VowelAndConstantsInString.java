package program;

import java.util.Scanner;

//count total no. of vowel and consonant in String
public class VowelAndConstantsInString {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	int vCount = 0;
	int cCount = 0;
	for(int i = 0;i<=s.length()-1;i++) {
		if(s.charAt(i)=='A' || s.charAt(i)=='a' ||s.charAt(i)=='E' || s.charAt(i)=='e' || s.charAt(i)=='I' || s.charAt(i)=='i' || s.charAt(i)=='O' || s.charAt(i)=='o'|| s.charAt(i)=='U' || s.charAt(i)=='u') {
			vCount++;
		}
		else if((s.charAt(i)>='A' && s.charAt(i)<='Z') || (s.charAt(i)>='a' && s.charAt(i)<='z')) {
			cCount++;
		}
	}
	System.out.println("No. of vowels is :"+vCount);
	System.out.println("No. of consonant is :"+cCount);
}
}
