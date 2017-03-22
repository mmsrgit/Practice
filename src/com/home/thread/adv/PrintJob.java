package com.home.thread.adv;

public class PrintJob implements Runnable {
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		
		
		//System.out.println("Hello ");
		
		try{
			
			Thread.sleep(1000);
			
			
		}catch(InterruptedException ex){
			
		}
		System.out.println( name+" Job completed by "+Thread.currentThread().getName());

	}

	public PrintJob(String name) {
		super();
		this.name = name;
	}

}
