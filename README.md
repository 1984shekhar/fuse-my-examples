# simple examples

A) mysql-hibernate-blueprint example:
This is very simple and straight-forward example for mysql-hibernate-blueprint example. This repo is having three modules.
Order of installations should also be same:
1)mysql-datasource: it expose mysql-datasource as service.
2)hibernate-setting: it expose services to insert/delete data in mysql table. Hibernate persistence is used
3)hibernate-client: Client to access service exposed by hibernate-settings and execute methods.


Beginner can also find a cxf-blueprint-bundle where a soap-based endpoint is exposed and simultaneously the incoming request to soap-endpoint is consumed and a sample response is sent back to client using camel route.


B) cxf-rest-blueprint example: 
Here there are three maven projects to look for
1)jaxrs-server-standalone: This is a standalone REST service. To run follow README.md file of this project.
2)jaxrs-client-blueprint: This is a client which use camel-route and act as a client to REST service.
3)jaxrs-server-blueprint: This is a project which can be deployed in Fuse. This exposes a REST service similar to jaxrs-server-standalone but with only one operation i.e. getCustomer. 

