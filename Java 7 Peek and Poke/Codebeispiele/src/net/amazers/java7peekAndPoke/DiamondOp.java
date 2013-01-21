package net.amazers.java7peekAndPoke;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DiamondOp 
{
	private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(DiamondOp.class);
	
	public static void java6()
	{
		Map<String, List<String>> map = new HashMap<String, List<String>>();
	}

	public  static void java7()
	{
		Map<String, List<String>> map = new HashMap<>();
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
