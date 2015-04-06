Camel ActiveMQ Project
======================

This project embeds Apache ActiveMQ together with Apache Camel.


To build this project use the following Maven goal

    mvn clean install

For more help see the Apache Camel documentation

    http://camel.apache.org/
    
    
Update input and output folder in camel-context.xml.
Copy message1.xml, message2.xml and message3.xml to input folder.
Deploy the bundle in osgi.
osgi:install -s mvn:com.mycompany/camel-spring-filter/1.0
