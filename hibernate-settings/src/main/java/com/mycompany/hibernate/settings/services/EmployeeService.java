package com.mycompany.hibernate.settings.services;
import java.util.List;

import com.mycompany.hibernate.settings.entity.Employee;

public interface EmployeeService {

        public void addDummyEmpoyees();
	public void add(Employee emp);
	public List<Object> getAll();
	public void deleteAll();

}
