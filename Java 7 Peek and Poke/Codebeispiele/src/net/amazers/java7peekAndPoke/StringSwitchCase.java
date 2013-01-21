package net.amazers.java7peekAndPoke;


public class StringSwitchCase 
{
	private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(StringSwitchCase.class);
	
	public static void java6()
	{
		String cmd = "Hello"; 
		
		if("Hello".equals("Hello"))
		{
			log.info("Hi");
		}
		else if(cmd.equals("World"))
		{
			log.info("Yeah");
		}
		else
		{
			log.error("unknown cmd: " + cmd);
		}
		
	}

	public  static void java7()
	{
		// check if it works also with built string literals
		String cmd = "H";
		cmd += "ello";
		
		final String test = "Hello";

		switch(cmd)
		{
		case test: 
			log.info("Hi");
			break;
			
		case "World":
			log.info("Yeah");
			break;
		
		default:
			log.error("unknown cmd: " + cmd);
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
