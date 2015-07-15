package com.mycompany.route;

import org.apache.camel.builder.RouteBuilder;

public class Venue extends RouteBuilder {

    public void configure() {

        venues();

    }

    private void venues(){

        //@formatter:off
        from("timer://foo?fixedRate=true&period=10000")
        .id("DEMO-venue")
            .to("http4://localhost:8080/Test/printIncomingParameters.jsp?name={{rest.username}}&passwd={{rest.password}}")
            .to("log:DEMO-CAMEL?level=TRACE&showAll=true");

    }


}

