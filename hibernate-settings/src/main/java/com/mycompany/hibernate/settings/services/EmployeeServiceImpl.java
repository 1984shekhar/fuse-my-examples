package com.mycompany.hibernate.settings.services;
import java.util.List;

import javax.persistence.*;

import com.mycompany.hibernate.settings.entity.Employee;

public class EmployeeServiceImpl implements EmployeeService {

	private EntityManager entityManager;

	public void addDummyEmpoyees() {
                for(int i=1; i<=2; i++) {
                	System.out.println("Creating Employee Object");
                     Employee emp = new Employee();
                     System.out.println("SetName");
                     //emp.setId(getTotal());
                     emp.setName("TestEmp-"+i);
                     System.out.println("TestEmp-"+i);
	  	     entityManager.persist(emp);
		     entityManager.flush();
                     System.out.println("Employee: "+emp +" Record is now stored in Database.");
                }
	}

	public void add(Employee emp) {
		entityManager.persist(emp);
		entityManager.flush();
	}

	public List<Object> getAll() {
                Query query = entityManager.createNativeQuery( "SELECT * FROM Employee", Employee.class );
                System.out.println("Query =  " + query);
                List<Object> resultList = query.getResultList();  
                System.out.println("resultList  =  " + resultList);
                int counter = 0;
                for (Object result : resultList) {  
                     Employee emp = (Employee) result;  
                        System.out.println(emp.toString());  
                 } 
                return resultList;
	}
	
	public Long getTotal(){
		 Query query = entityManager.createNativeQuery( "SELECT count(*) FROM Employee", Employee.class );
         System.out.println("Query =  " + query);
         System.out.println(query.getSingleResult());
         return Long.valueOf(String.valueOf(query.getSingleResult()));
	}
	public void deleteAll() {
		entityManager.createQuery( "delete from Employee" ).executeUpdate();
		entityManager.flush();
	}

	public EntityManager getEntityManager() {
		return entityManager;
	}

	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

}
