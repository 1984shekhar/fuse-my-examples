Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

features:install camel-sql
features:install camel-jpa
features:info jpa 
features:install jndi
osgi:install -s wrap:file:///home/cpandey/NotBackedUp/Development/mysql-connector-java-5.1.34-bin.jar
install -s mvn:org.apache.servicemix.bundles/org.apache.servicemix.bundles.commons-dbcp/1.4_3
    osgi:install -s mvn:com.mycompany/camel-blueprint-jettyTest/1.0

For more help see the Apache Camel documentation

    http://camel.apache.org/
