package com.mycompany.exampleSpringDM;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.log4j.Logger;

/**
 * A bean which we use in the route
 */
public class HelloBean implements Hello {

    private String say = "Hello World";
    private Logger log = Logger.getLogger(HelloBean.class);
    public String hello() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return say + " at " + sdf.format(new Date());
    }

    public String getSay() {
        return say;
    }

    public void setSay(String say) {
        this.say = say;
    }

	@Override
	public void printMe() {
		log.info("Print : "+Name);
		
	}
}
