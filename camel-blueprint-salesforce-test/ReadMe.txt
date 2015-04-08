Camel Router Project for Blueprint (OSGi)
=========================================

To build this project use

    mvn install

To run the project you can execute the following Maven goal

    mvn camel:run

To deploy the project in OSGi. For example using Apache ServiceMix
or Apache Karaf. You can run the following command from its shell:

    osgi:install -s mvn:com.mycompany/camel-blueprint-salesforce-test/1.0.0-SNAPSHOT

For more help see the Apache Camel documentation

    http://camel.apache.org/
    
    Fuse environment:
    JBossFuse:karaf@root> patch:list
[name]                                   [installed] [description]
jboss-fuse-6.1.0.redhat-379-r1           true       null
jboss-fuse-6.1.0.redhat-379-r1p2         true       null
    
    Modification in pom.xml:

1)I used camel version 2.12.0.redhat-610394 and same camel-salesforce-maven-plugin version.

2)Modified fuse repository <url>http://repo.fusesource.com/nexus/content/repositories/releases</url> to <url>http://repo.fusesource.com/nexus/content/repositories/fs-releases</url>.
