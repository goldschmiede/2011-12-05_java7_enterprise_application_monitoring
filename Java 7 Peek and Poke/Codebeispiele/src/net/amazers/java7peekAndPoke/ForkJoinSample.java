package net.amazers.java7peekAndPoke;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveAction;

public class ForkJoinSample 
{
	private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(ForkJoinSample.class);
	
	public static void java6()
	{
	}

	public  static void java7()
	{
		ForkJoinPool pool = new ForkJoinPool();
		pool.invoke(new RecursiveAction() {
			
			@Override
			protected void compute() {
				log.info("recursive Action called...");
			}
		}); 
	}
	
	public  static void main(String[] args)
	{
		log.info("Call java6 example ....");
		java6();
		
		log.info("Call java7 example ....");
		java7();
		
		log.info("Finished! Thank You for the fish.");
	}

}
