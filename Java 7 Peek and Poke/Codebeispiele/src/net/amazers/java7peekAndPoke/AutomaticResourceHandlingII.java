package net.amazers.java7peekAndPoke;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class AutomaticResourceHandlingII 
{
	private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(AutomaticResourceHandlingII.class);
	
	public static void java6()
	{
		InputStream is;
		OutputStream os;
		
		try
		{
			is = new FileInputStream("test.txt");
		}
		catch(Exception e)
		{
			log.error("Could not find text.txt");
			return;
		}
		
		try
		{
			os = new FileOutputStream("file2.txt");
		}
		catch(Exception e)
		{
			log.error("Could not write file2.txt");
			try{is.close();}catch(Exception e2){}
			return;
		}
		
		try
		{
			// do read is, write os
		}
		catch(Exception e)
		{
			log.error("some error happened",e);
		}
		finally
		{
			try{os.close();}catch(Exception e){ }
			try{is.close();}catch(Exception e) { }
		}
	}

	public  static void java7()
	{
		try(InputStream is = new FileInputStream("test.txt"); 
				OutputStream os = new FileOutputStream("file2.txt"))
		{
			// do read is, write os
		}
		catch(Exception e)
		{
			log.error("Error during process: ",e);
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
