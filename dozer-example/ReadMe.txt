#Features.xml
<features xmlns="http://karaf.apache.org/xmlns/features/v1.0.0">
    <feature name="foo">
        <bundle dependency='true'>mvn:net.sf.dozer/dozer-osgi/5.5.1</bundle>
        <feature>camel-core</feature>
        <feature>camel-blueprint</feature>
        <bundle>mvn:org.apache.camel/camel-dozer/2.12.0.redhat-610379</bundle>
        <bundle>mvn:org.apache.commons/commons-lang3/3.1</bundle>
        <bundle>mvn:org.apache.camel/camel-jetty/2.12.0.redhat-610379</bundle>
    </feature>
</features>


osgi:install -s mvn:com.mycompany/dozer-simple-example/1.0.0-SNAPSHOT