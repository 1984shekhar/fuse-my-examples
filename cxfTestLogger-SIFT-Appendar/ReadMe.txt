Camel Router Spring Project
===========================
This example provides an example for SIFT appender.

To build this project use

osgi:install -s mvn:com.cxf.testLogger/cxfTestLogger/1.0.0-SNAPSHOT

SIFT configurations in org.ops4j.pax.logging.cfg


# Root logger
log4j.rootLogger=INFO, out, sift, osgi:VmLogAppender


# Sift appender
log4j.appender.sift=org.apache.log4j.sift.MDCSiftingAppender
log4j.appender.sift.key=app.name
log4j.appender.sift.default=servicemix
log4j.appender.sift.appender=org.apache.log4j.FileAppender
log4j.appender.sift.appender.layout=org.apache.log4j.PatternLayout
log4j.appender.sift.appender.layout.ConversionPattern=%d{ABSOLUTE} | %-5.5p | %-16.16t | %-32.32c{1} | %m%n
log4j.appender.sift.appender.file=${karaf.data}/log/$\\{app.name\\}.log
log4j.appender.sift.appender.append=true
