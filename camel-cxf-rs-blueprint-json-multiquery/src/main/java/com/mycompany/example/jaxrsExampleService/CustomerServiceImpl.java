/**
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements. See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership. The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.mycompany.example.jaxrsExampleService;

import java.util.HashMap;
import java.util.Map;

import org.apache.camel.Header;
import org.apache.log4j.Logger;


public class CustomerServiceImpl {
	private Logger log = Logger.getLogger(this.getClass());
    long currentId = 123;
    Map<Long, Customer> customers = new HashMap<Long, Customer>();

    public CustomerServiceImpl() {
        init();
    }

    public Customer getCustomer(@Header("transactionId") String id, @Header("enterpriseAlias") String name) {
    	log.info("----invoking getCustomer, Customer id= " + id +" Customer Name= "+name);
    	log.info("id= "+id);
        long idNumber = Long.parseLong(id+"");
        Customer c = customers.get(idNumber);
        return c;
    }
   
    final void init() {
        Customer c = new Customer();
        c.setName("John");
        c.setId(123);
        customers.put(c.getId(), c);
        Customer d = new Customer();
        d.setName("Black");
        d.setId(133);
        customers.put(d.getId(), d);
        log.info("----initialized with: "+customers.size()+"------");
    }

}
