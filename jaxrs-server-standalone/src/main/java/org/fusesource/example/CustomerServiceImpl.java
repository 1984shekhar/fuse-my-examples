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
package org.fusesource.example;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.core.Response;

public class CustomerServiceImpl implements CustomerService {
    long currentId = 123;
    Map<Long, Customer> customers = new HashMap<Long, Customer>();

    public CustomerServiceImpl() {
        init();
    }

    public Customer getCustomer(String id) {
        System.out.println("----invoking getCustomer, Customer id=" + id);
        long idNumber = Long.parseLong(id);
        Customer c = customers.get(idNumber);
        return c;
    }

    public Response updateCustomer(Customer customer) {
        System.out.println("----invoking updateCustomer, Customer id=" + customer.getId() + " Customer name=" + customer.getName());
        Customer c = customers.get(customer.getId());
        Response r;
        if (c != null) {
            customers.put(customer.getId(), customer);
            r = Response.status(Response.Status.OK).location(URI.create("/customerservice/customers/" + customer.getId())).build();
        } else {
            r = Response.status(Response.Status.NOT_FOUND).build();
        }

        return r;
    }

    public Response addCustomer(Customer customer) {
        System.out.println("----invoking updateCustomer, Customer id=" + customer.getId() + " Customer name=" + customer.getName());
        customer.setId(++currentId);

        customers.put(customer.getId(), customer);
        return Response.status(Response.Status.OK).location(URI.create("/customerservice/customers/" + customer.getId())).build();
    }

    public Response deleteCustomer(String id) {
        System.out.println("----invoking deleteCustomer, Customer id=" + id);
        long idNumber = Long.parseLong(id);
        Customer c = customers.get(idNumber);

        Response r;
        if (c != null) {
            r = Response.status(Response.Status.OK).location(URI.create("/customerservice/customers/" + c.getId())).build();
            customers.remove(idNumber);
        } else {
            r = Response.status(Response.Status.NOT_FOUND).build();
        }

        return r;
    }

    final void init() {
        Customer c = new Customer();
        c.setName("John");
        c.setId(123);
        customers.put(c.getId(), c);
    }

}
