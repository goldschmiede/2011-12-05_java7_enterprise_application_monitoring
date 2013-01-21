package net.amazers.EAM;

import org.apache.log4j.LogManager;
import org.apache.log4j.PropertyConfigurator;
import org.apache.log4j.net.SocketReceiver;
import org.apache.log4j.xml.DOMConfigurator;
import org.springframework.stereotype.Service;

@Service
public class LogHubServerBean {
	private static final org.apache.log4j.Logger logger = org.apache.log4j.LogManager.getLogger(LogHubServerBean.class);
	
	private static String envName;
	public static String getEnvName() {return envName;}
	public void setEnvName(String name) {envName = name;}

	private int port;
	public int getPort() {return port;}
	public void setPort(int port) {this.port = port;}



	public void init()
	{
/*		logger.info("reset log4j config....");
		LogManager.resetConfiguration();
		DOMConfigurator.configure("config/log4j.xml");
		logger.info("reset log4j done.");
	*/	
	    logger.info(" start receiver port: " + port + ", env: " + envName + " ...");
	    if(port==0)
	    	throw new IllegalArgumentException("Port may not be 0");
	    SocketReceiver rec = new SocketReceiver(port,logger.getLoggerRepository());
	    rec.activateOptions();
	    logger.info("started!");
		
	}
}
