package com.java.mohit.multi;

public class notepad {
	
		protected String content;

		public void Notepad() {
			
			this.content = " ";
		}
		
		public void write(String text)
		{
			content+=text;
		}
		public void displayData()

		{
			System.out.println("Notepad content "+content);
		}
	}

