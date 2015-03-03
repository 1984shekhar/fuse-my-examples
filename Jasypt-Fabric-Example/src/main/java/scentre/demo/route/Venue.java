package scentre.demo.route;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.model.dataformat.JsonLibrary;

import java.util.ArrayList;

public class Venue extends RouteBuilder {

    public void configure() {

        venues();

    }

    // --------------------------------------------------------------
    // Configures Zone Entry event sync flow
    private void venues(){

        //@formatter:off
        from("timer://foo?fixedRate=true&period=10000")
        .id("DEMO-venue")
            .to("http4://localhost:8080/Test/printIncomingParameters.jsp?name={{rest.username}}&passwd={{rest.password}}")
            .to("log:DEMO-CAMEL?level=TRACE&showAll=true");

    }


}

