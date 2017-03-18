package com.home.thread.runnable;

public class MainInterrupt {
	
	public static void main(String[] args){
		ChildInterrupt ct = new ChildInterrupt();
		ct.start();
		System.out.println("BeforeInterrupt");
		ct.interrupt();
		System.out.println("AfterInterrupt");
	}

}
