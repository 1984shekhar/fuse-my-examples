Camel Router Project for Blueprint (OSGi)
=========================================


To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following commands from its shell:

 features:install jpa
 features:install jndi
 features:install camel-jpa
 osgi:install wrap:file:///<path>/mysql-connector-java-5.1.34/mysql-connector-java-5.1.34-bin.jar
 #In Fabric serp dependency
 profile-edit --bundles mvn:org.apache.servicemix.bundles/org.apache.servicemix.bundles.serp/1.14.1_1 TestProfile
 
 osgi:install -s mvn:com.mycompany/ExampleEntityManagerfactoryExport/1.1
 
