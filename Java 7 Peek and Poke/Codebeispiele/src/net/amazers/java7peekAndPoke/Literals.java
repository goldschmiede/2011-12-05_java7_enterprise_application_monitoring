package net.amazers.java7peekAndPoke;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Literals 
{
	private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(Literals.class);
	
	public static void java6()
	{
		int valThousand = 1000;
		int valMillion  = 1000000;
		// int valBinary = NOT POSSIBLE 
	}

	public  static void java7()
	{
		int valThousand = 1_000;
		int valMillion  = 1_000_000;
		int valBinary = 0b1000_0011;
		
		log.info("bin val: " + valBinary);
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
