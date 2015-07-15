Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

	features:install jpa
	features:install jndi
	features:install camel-jpa
	features:install jndi-hibernate
	osgi:install wrap:file:/home/cpandey/NotBackedUp/Downloads/mysql-connector-java-5.1.18-bin.jar
    osgi:install -s mvn:com.mycompany/mysql-datasource/1.0.0-SNAPSHOT

For more help see the Apache Camel documentation

    http://camel.apache.org/
