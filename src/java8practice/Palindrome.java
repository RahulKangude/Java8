package java8practice;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Palindrome {
	public static void main(String[] args) {
		
	//	String s="RADAR";
		Scanner sc=new Scanner(System.in);
		System.out.println("Input your string\n");
		String s=sc.next();
		
		boolean ispalindrome=IntStream.range(0, s.length()/2).allMatch(i->s.charAt(i)==s.charAt(s.length()-i-1));
		if(ispalindrome==true)
		System.out.println("is palindrome");
		else {
			System.out.println("Not a palindrome");
		}
		
		
	}
}
