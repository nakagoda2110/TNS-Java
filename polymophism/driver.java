package com.java.mohit.polymophism;

public class driver {
	public static void main(String[] args) {
		palindrome p = new palindrome();
		System.out.println(p.isPalindrome(252));
		System.out.println(p.isPalindrome("aba"));
	}
}
