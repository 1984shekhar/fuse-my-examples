# simple examples

Once you successfully build these project. Below commands will deploy these bundles to Fuse.

osgi:install -s wrap:file:/home/cpandey/NotBackedUp/Development/OracleDriver/ojdbc6-11.2.0.2.0.jar
features:install jpa
features:install jndi
features:install jpa-hibernate
osgi:install -s mvn:org.apache.servicemix.bundles/org.apache.servicemix.bundles.commons-dbcp/1.4_3
osgi:install -s mvn:com.mycompany/spring-datasource/1.0.0-SNAPSHOT
osgi:install -s mvn:com.mycompany/persistence-dm/1.0.0-SNAPSHOT
osgi:install -s mvn:com.mycompany/persistence-consumer/1.0.0-SNAPSHOT
