package com.xchanging.ecf.wiretap.service;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.slf4j.*;

import com.fusesource.examples.persistence.part1.model.Employee;


public class WiretappingService implements WiretappingServiceInterface {

	 @PersistenceContext
	 private EntityManager em;
	public void getAllElements() {
		// TODO Auto-generated method stub
		Query queryEmployees = em.createNativeQuery(
			    "Select * from Employee", Employee.class
			);
		List<Employee> empList = (List<Employee>)queryEmployees.getResultList();
		for(Employee emp:empList){
			System.out.println(emp.getId()+"---"+emp.getName());
		}
	}
	
	/**
	 * @param exchange
	 * @return
	 * @throws JAXBException
	 * @throws ParseException 
	 */
	
}
