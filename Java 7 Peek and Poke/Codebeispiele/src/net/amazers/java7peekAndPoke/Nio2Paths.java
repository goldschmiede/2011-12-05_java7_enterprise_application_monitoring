package net.amazers.java7peekAndPoke;

import java.nio.file.Path;
import java.nio.file.Paths;

public class Nio2Paths 
{
	private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(Nio2Paths.class);
	
	public static void java6()
	{
	}

	public  static void java7()
	{
		Path path = Paths.get("c:\\maz\\work");
		log.info(" file: " + path.getFileName());
		log.info(" root: " + path.getRoot());
		log.info(" parent: " + path.getParent());
		log.info(" count: " + path.getNameCount());
		for(int i=0; i< path.getNameCount(); i++)
			log.info("   "+i+": " + path.getName(i).getFileName());
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
