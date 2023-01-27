package program;

import java.util.Scanner;

//replaces white spaces with some specific characters
public class ReplaceSpace {
	public static void main(String[] args) {
		
		String s="oh ho";
		String s1 ="";
		for(int i = 0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				s1=s1+s.charAt(i);
			}
			else
				s1=s1+"@";
		}
		System.out.println(s1);
	}

}
