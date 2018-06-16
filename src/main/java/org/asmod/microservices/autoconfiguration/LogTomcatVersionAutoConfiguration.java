	package org.asmod.microservices.autoconfiguration;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LogTomcatVersionAutoConfiguration {
	private static Log logger = LogFactory.getLog(LogTomcatVersionAutoConfiguration.class);
	
	public void logTomcatVersion() {
		logger.info("\n\n\nTomcat v");
	}
}
