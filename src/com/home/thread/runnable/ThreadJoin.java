package com.home.thread.runnable;

public class ThreadJoin {
	
	public static void main(String[] args){
		MyThread t = new MyThread();
		t.start();
		try {
			//t.join();
			t.join(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		for(int i=0;i<10;i++){
			System.out.println("main thread");
		}
	}

}
