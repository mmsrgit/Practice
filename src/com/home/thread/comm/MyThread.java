package com.home.thread.comm;

public class MyThread extends Thread{
	
	Display d;
	String name;
	
	
	
	public MyThread(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}



	public void run(){
		try {
			d.display(name);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
