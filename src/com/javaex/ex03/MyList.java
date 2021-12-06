package com.javaex.ex03;

public class MyList {
	
	//필드
	private Object[] oArray;
	private int crtPos;
	
	//생성자
	public MyList() {
		this.oArray = new Object[3];
		this.crtPos = 0;
	}
	
	
	//메소드 g/s
	
	//메소드 일반
	public void add(Object o) {
		oArray[crtPos] = o;
		crtPos++;
	}
	
	public Object get(int index) {
		Object result = oArray[index];
		return result;
	}
	
	public int size() {
		return crtPos;
	}
	
	

}
