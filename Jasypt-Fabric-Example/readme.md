## Configuration sample
```
crypt-password-set manag3r

fabric:container-create-child --jvm-opts "-server -Xms768m -XX:MaxPermSize=256m -Xmx768m"  root demo

fabric:profile-delete --force tpl-demo
fabric:profile-create tpl-demo

fabric:profile-edit --bundles mvn:sg.demo/route-info/0.0.3    tpl-demo

fabric:profile-edit --features fabric-camel      tpl-demo

fabric:profile-edit --features camel-core        tpl-demo
fabric:profile-edit --features camel-blueprint   tpl-demo
fabric:profile-edit --features camel-jasypt      tpl-demo
fabric:profile-edit --features camel-blueprint  tpl-demo
fabric:profile-edit --features camel-core       tpl-demo
fabric:profile-edit --features camel-cxf        tpl-demo
fabric:profile-edit --features camel-script     tpl-demo
fabric:profile-edit --features camel-mvel       tpl-demo
fabric:profile-edit --features camel-jackson    tpl-demo
fabric:profile-edit --features camel-groovy     tpl-demo
fabric:profile-edit --features camel-http4      tpl-demo

fabric:profile-edit --bundles mvn:org.ops4j.pax.url/pax-url-classpath/1.4.2 tpl-demo
fabric:profile-edit --bundles mvn:org.ops4j.pax.url/pax-url-commons/1.4.2 tpl-demo
fabric:profile-edit --bundles mvn:org.ops4j.pax.swissbox/pax-swissbox-property/1.6.0   tpl-demo
fabric:profile-edit --bundles mvn:org.ops4j.base/ops4j-base-util-property/1.4.0        tpl-demo

fabric:profile-edit --pid sg.demo/rest.password='${crypt:EKOv2wkzjSUOvNjO+X+2qiCO5bWApdNu}'                     tpl-demo

fabric:container-add-profile demo tpl-demo
fabric:container-connect demo

```

And in the DEMO container:

```

camel:route-info

```



