package com.home.thread.commu;

public class ThreadB extends Thread{

	int total = 0;

	public  void run(){

		synchronized(this){
			for(int i=1;i<101;i++){
				total += i;
			}
			this.notify();
		}
	}

}
