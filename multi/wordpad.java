package com.java.mohit.multi;

public class wordpad extends notepad {
	private boolean isBold;
	
	public wordpad()
	{
		super();
		this.isBold=false;
	}
	
	public void formatText(boolean bold)
	{
		if(bold)
		{
			content="<b>"	+ content+"</b>";
		}
		isBold=bold;
	}
	public boolean isBold()
	{
		return isBold;
	}
	

}
