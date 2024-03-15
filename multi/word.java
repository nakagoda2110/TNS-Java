package com.java.mohit.multi;

public class word extends wordpad {
private boolean spellCheckEnabled;

public word() {
	super();
	this.spellCheckEnabled = true;
}

public void spellCheck()
{
	if(spellCheckEnabled)
	{
		System.out.println("Spell check is enabled");
	}else
	{
		System.out.println("Spell check is disabled");
	}
}
public void enableSpellCheck(boolean enable)
{
	spellCheckEnabled=enable;
}

}