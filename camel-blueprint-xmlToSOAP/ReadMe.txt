Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use

    mvn install

Change input and ouput path in camel-route. From resources copy simple.xml to input folder. Copy TMReq.xsl to some other folder. Provide these path in routes.

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

    osgi:install -s mvn:com.mycompany/camel-blueprint-xmlToSOAP/1.0.0-SNAPSHOT

For more help see the Apache Camel documentation

    http://camel.apache.org/
