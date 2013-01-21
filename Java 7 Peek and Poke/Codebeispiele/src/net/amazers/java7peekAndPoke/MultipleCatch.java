package net.amazers.java7peekAndPoke;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MultipleCatch 
{
	private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(MultipleCatch.class);
	
	public static void exceptionThrowingMethod() 
			throws IOException, IllegalStateException, IllegalArgumentException
	{
		
	}
	
	public static void java6()
	{
		try
		{
			exceptionThrowingMethod();
		}
		catch(IOException e) 
		{ 
			// handle
		}
		catch(IllegalStateException e) 
		{
			// handle like above
		}
		catch(IllegalArgumentException e)
		{
			//handle different
		}
	}

	public  static void java7()
	{
		try
		{
			exceptionThrowingMethod();
		}
		catch(IOException | IllegalStateException e)
		{
			// handle
		}
		catch(IllegalArgumentException e)
		{
			// handle different
		}
		
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
