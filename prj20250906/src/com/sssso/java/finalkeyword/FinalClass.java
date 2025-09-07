package com.sssso.java.finalkeyword;

public class FinalClass {
	
	private int someVar;
	
	public FinalClass() {
		this.someVar = 10;
	}

	public int getSomeVar() {
		return someVar;
	}

	public void setSomeVar(int someVar) {
		this.someVar = someVar;
	}
	
	public final void showData() {
		System.out.println("This is the data");
	}

}
