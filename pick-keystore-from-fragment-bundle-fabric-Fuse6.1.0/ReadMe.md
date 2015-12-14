1)camel-cxfrs-https-blueprint 
 
 deploy the same as osgi bundle
 osgi:install -s mvn:org.jboss.fuse.samples/camel-cxfrs-https-blueprint/1.0
 
 Note: please check whether jackson-jaxrs bundle is installed or not

  if not install the same using

  osgi:install -s mvn:org.codehaus.jackson/jackson-jaxrs/1.9.12


2) Deploy fragment bundle( contains keystore certificates)

   osgi:install -s mvn:org.jboss.fuse.samples/fragment-bundle/1.0

3) Client Module to consume cxfRS

   Build with Test Profile

 I have Tested on my end and it is working

Please let us know if you have any issues 

Note:The certificates used in this example are only for Testing puposes,don't use the same in production environments
