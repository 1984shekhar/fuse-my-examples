# simple examples


This is very simple and straight-forward example for mysql-hibernate-blueprint example. This repo is having three modules.
Order of installations should also be same:
1)mysql-datasource: it expose mysql-datasource as service.
2)hibernate-setting: it expose services to insert/delete data in mysql table. Hibernate persistence is used
3)hibernate-client: Client to access service exposed by hibernate-settings and execute methods.


Beginner can also find a cxf-blueprint-bundle where a soap-based endpoint is exposed and simultaneously the incoming request to soap-endpoint is consumed and a sample response is sent back to client using camel route.
