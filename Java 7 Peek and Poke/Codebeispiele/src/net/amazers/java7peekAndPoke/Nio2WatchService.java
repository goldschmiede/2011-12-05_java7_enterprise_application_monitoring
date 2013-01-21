package net.amazers.java7peekAndPoke;

import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardWatchEventKinds;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class Nio2WatchService 
{
	private static final org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(Nio2WatchService.class);
	
	public static void java6()
	{
	}

	public  static void java7()
	{
		try
		{
			// define path to be watched
			Path path = Paths.get("c:\\temp");
			
			// create WatchService
			WatchService ws = FileSystems.getDefault().newWatchService();
			path.register(ws, StandardWatchEventKinds.ENTRY_CREATE, 
					StandardWatchEventKinds.ENTRY_MODIFY,
					StandardWatchEventKinds.ENTRY_DELETE);
			
			
			// access changes
			log.info("Waiting for events... ");
		    while(true) 
		    {
		        try 
		        {
		           WatchKey key = ws.take();
                   for (WatchEvent<?> event : key.pollEvents()) 
                        log.info(" Event ctx: " + event.context() + " what: " + event.kind());
                   key.reset();
		        } 
		        catch (Exception e) 
		        {
		        	log.info("Exception",e);
	            }

		      }			
			
		}
		catch(Exception e)
		{
			log.error("Exception during processing: " ,e);
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
