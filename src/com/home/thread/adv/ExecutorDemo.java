package com.home.thread.adv;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {

	public static void main(String[] args) {
		ExecutorService executor = Executors.newFixedThreadPool(3);
		PrintJob[] printJobList = {new PrintJob("Sam"),
				new PrintJob("Jack"),
				new PrintJob("Lynn"),
				new PrintJob("Remy"),
				new PrintJob("Joe"),
				new PrintJob("Sid")}; 
		for(PrintJob printJob: printJobList){
			executor.submit(printJob);
		}
		executor.shutdown();
	}

}
