Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use

    mvn install

Change input and ouput path in camel-route. From resources copy simple.xml to input folder.

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:
	features:install camel-xmljson
    osgi:install -s mvn:com.mycompany/camel-blueprint-xmljson/1.0.0-SNAPSHOT

For more help see the Apache Camel documentation

    http://camel.apache.org/
