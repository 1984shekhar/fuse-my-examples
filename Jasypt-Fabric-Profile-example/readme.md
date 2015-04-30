## Configuration sample
```


fabric:profile-create TestProfile

fabric:profile-edit --bundles mvn:com.mycompany/fabric-route-info/1.0 TestProfile

fabric:profile-edit --features fabric-camel TestProfile

fabric:profile-edit --features camel-jasypt TestProfile
fabric:profile-edit --features camel-blueprint TestProfile
fabric:profile-edit --features camel-core TestProfile
fabric:profile-edit --features camel-http4      TestProfile
############### start only for classpath in xml#################
fabric:profile-edit --bundles mvn:org.ops4j.pax.url/pax-url-classpath/1.4.2 TestProfile
fabric:profile-edit --bundles mvn:org.ops4j.pax.url/pax-url-commons/1.4.2 TestProfile
fabric:profile-edit --bundles mvn:org.ops4j.pax.swissbox/pax-swissbox-property/1.6.0 TestProfile
fabric:profile-edit --bundles mvn:org.ops4j.base/ops4j-base-util-property/1.4.0 TestProfile
############### end only for classpath in xml#################

fabric:profile-edit --pid test.profile/rest.password=ENC(EKOv2wkzjSUOvNjO+X+2qiCO5bWApdNu) TestProfile

fabric:container-add-profile root TestProfile


camel:route-info

```



