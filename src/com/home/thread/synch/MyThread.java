package com.home.thread.synch;

public class MyThread extends Thread{
	
	Display d;
	String name;
	int method;
	
	public MyThread(Display d , String name){
		this.d = d;
		this.name = name;
	}
	
	public void run(){
		
		d.display(name);
	}

}
