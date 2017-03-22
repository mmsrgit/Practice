package com.home.thread.adv;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableDemo{


	public static void main(String[] args) throws InterruptedException, ExecutionException{

		/*ExecutorService service = Executors.newCachedThreadPool();

		service.submit(new Runnable(){

			@Override
			public void run() {
				System.out.println("Starting ...");

				try{
					Thread.sleep(1000);
				}catch(InterruptedException ex){
					ex.printStackTrace();
				}
				
				System.out.println("Ending ...");

			}

		});
		
		service.shutdown();*/
		
		ExecutorService service = Executors.newCachedThreadPool();

		Future<Integer> future = service.submit(new Callable<Integer>(){

			@Override
			public Integer call() throws Exception {
				System.out.println("Starting ...");

				try{
					Thread.sleep(1000);
				}catch(InterruptedException ex){
					ex.printStackTrace();
				}
				Random random = new Random();
				int randomInt	 = random.nextInt(4000);
				
				System.out.println("Returning .. "+randomInt);
				return randomInt;
			}
			
		});
		
		service.shutdown();
		System.out.println(future.get());
	}

}
