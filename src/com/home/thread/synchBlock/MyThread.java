package com.home.thread.synchBlock;

public class MyThread extends Thread{
	
	Display d;
	String name;
	public MyThread(Display d , String name){
		this.d = d;
		this.name = name;
	}
	
	public void run(){
		
		d.display(name);
	}

}
