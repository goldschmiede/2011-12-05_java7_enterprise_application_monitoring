package net.amazers.EAM;

import org.apache.log4j.spi.Filter;
import org.apache.log4j.spi.LoggingEvent;


public class LogHubAppEnvSetterFilter extends Filter {

	@Override
	public int decide(LoggingEvent e) {
		
		// set always the app.env variable in the event
		String envName = LogHubServerBean.getEnvName();
		if(envName!=null)
			e.setProperty("app.env", envName);
		
		return ACCEPT;
	}

}
