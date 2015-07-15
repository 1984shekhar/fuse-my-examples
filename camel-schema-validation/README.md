camel-schema-validation
=======================

Example Camel project which demonstrates schema validation using blueprint.

Note: This project was built and tested to run in Fuse ESB Entprise 7.1.0.fuse-047

Camel Router Project for Blueprint (OSGi)
=========================================

=========================================
Setting up the example
=========================================

The src/data file should be copied to a accessible location and the
file paths should be updated in the route to reflect this location.

The src/data/schema/schema.xsd is used to validate the /src/data/messageX.xml
files.

=========================================
Installing the example
=========================================

To deploy the example in OSGi. For example using Apache ServiceMix
or Apache Karaf. You will run the following command from its shell:

    osgi:install -s mvn:com.redhat/camel-schema-validation

For more help see the Apache Camel documentation

    http://camel.apache.org/
    
