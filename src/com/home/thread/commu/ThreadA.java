package com.home.thread.commu;

public class ThreadA {

	public static void main(String[] args) throws InterruptedException{
		ThreadB threadB = new ThreadB();
		threadB.start();
		synchronized(threadB){
			threadB.wait();
			System.out.println(threadB.total);
		}
	}
	
	

}
