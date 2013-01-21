package net.amazers.java7peekAndPoke;


public class AutomaticResourceHandlingI 
{
	private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(AutomaticResourceHandlingI.class);
	
	public static class TestAutoClose implements AutoCloseable
	{
		@Override
		public void close() throws Exception {
			log.info("Autoclosable.close called");
			//throw new Exception("close exception");
			
		}
	}
	
	public static void java6()
	{
	}

	public  static void java7()
	{
		
		try(TestAutoClose tst = new TestAutoClose();)
		{
			// do something with tst
			//throw new IllegalStateException("Sample Exception");
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
