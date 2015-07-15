Ensure that fragment bundle is loaded at startup before the pax-logging-service ($FUSE_HOME/etc/startup.properties). Insert
 
com/mycompany/fuse/logging/mask-layout/1.0/mask-layout-1.0.jar=7
org/ops4j/pax/logging/pax-logging-api/1.7.2/pax-logging-api-1.7.2.jar=8
org/ops4j/pax/logging/pax-logging-service/1.7.2/pax-logging-service-1.7.2.jar=8


Use the new Pattern Layout Class in logging configuration($FUSE_HOME/etc/org.ops4j.pax.logging.cfg) for various appenders , such as 
      log4j.appender.sift.appender.layout=com.mycompany.fuse.logging.log4j.MyMaskedLayout