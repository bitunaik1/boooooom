package program;

import java.util.Scanner;

//program to count the number of characters in String
public class CountNumberOfChar {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	String s = sc.nextLine();
	//String s = "123 4567 89 ";
	int count = 0;
	for(int i = 0;i<=s.length()-1;i++) {
	if(s.charAt(i)!=' ') {
		count++;
	}
	}
	System.out.println("The number of character in this sentence(without space) is :"+count);
}
}
