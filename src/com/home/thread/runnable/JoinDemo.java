package com.home.thread.runnable;

public class JoinDemo {
	
	public static void main(String[] args) throws InterruptedException{
		/*SumCalculator calc = new SumCalculator(5);
		calc.start();
		try {
			calc.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		printSum(calc);*/
		
		OtherThread t = new OtherThread();
		t.setMainThread(Thread.currentThread());
		t.start();
		for(int i=0;i<10;i++){
			Thread.sleep(1000);
			System.out.println(i);
		}
	}

	private static void printSum(SumCalculator calc) {
		System.out.println(calc.getSum());
		
	}

}
