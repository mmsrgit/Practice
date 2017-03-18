package com.home.thread.runnable;

public class SumCalculator extends Thread {
	
	private int number;
	private int sum;
	
	
	public SumCalculator(int number) {
		super();
		this.number = number;
	}


	public int getSum() {
		return sum;
	}


	public void setSum(int sum) {
		this.sum = sum;
	}


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public void run(){
		int sum = 0;
		for(int i=1;i<=this.number;i++){
			sum+=i;
		}
		setSum(sum);
	}

}
