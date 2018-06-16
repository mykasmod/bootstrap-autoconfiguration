package org.asmod.microservices.autoconfiguration;

import javax.annotation.PostConstruct;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.web.ServerProperties.Tomcat;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnClass(Tomcat.class)
@ConditionalOnProperty(name = "log-tomcat-version", matchIfMissing = false)
public class LogTomcatVersionAutoConfiguration {
	private static Log logger = LogFactory.getLog(LogTomcatVersionAutoConfiguration.class);
	
	@PostConstruct
	public void logTomcatVersion() {
		logger.info("\n\n\nTomcat v" + Tomcat.class.getPackage().getImplementationVersion() + "\n\n");
	}
}
