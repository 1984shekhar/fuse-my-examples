package com.mycompany.fuse.logging.log4j;


import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.spi.LoggingEvent;

public class MyMaskedLayout extends PatternLayout {

	private static final String MASKCARD = "XX This Was - hello - XX";
        private static final Pattern PATTERNCARD = Pattern.compile(".*hello.*");
    
	public void activateOptions() {
        	super.activateOptions();
    	}

 	@Override
 	public String format(LoggingEvent event) {
 		System.out.println("Comment this sysout later, Inside format.....");
   		if (event.getMessage() instanceof String) {
      		String message = event.getRenderedMessage();

      		Matcher matcher = PATTERNCARD.matcher(message);

      		if (matcher.find()) {
         		String maskedMessage = matcher.replaceAll(MASKCARD);

         		Throwable throwable =
             			event.getThrowableInformation() != null ?
             			event.getThrowableInformation().getThrowable() : null;

         		LoggingEvent maskedEvent = new LoggingEvent(
                 		event.fqnOfCategoryClass,
                 		Logger.getLogger(event.getLoggerName()),
                 		event.timeStamp,
                 		event.getLevel(),
                 		maskedMessage,
                 		throwable);

         		return super.format(maskedEvent);
      			}
   		}

   		return super.format(event);
 	}


    public boolean ignoresThrowable() {
        return super.ignoresThrowable();
    }
}
