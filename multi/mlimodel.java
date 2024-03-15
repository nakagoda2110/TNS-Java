package com.java.mohit.multi;

public class mlimodel {
	public static void main(String[] args) {
		word word=new word();
		
		word.write("Hello ");
		word.formatText(true);
		word.write("Everyone...");
		word.displayData();
		
		word.spellCheck();
		word.enableSpellCheck(true);
		System.out.println(word.isBold());
		

	}

}
