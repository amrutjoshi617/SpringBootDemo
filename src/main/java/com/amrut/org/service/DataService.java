package com.amrut.org.service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.amrut.org.model.Employee;

public class DataService {
	
	List<Employee> empList;
	
	public DataService() {
		empList=loadEmployees();
	}

	private List<Employee> loadEmployees() {
		List<Employee> list=new ArrayList<>();
		Employee emp=new Employee();
		File file=new File("Employee.txt");
		try {
			ObjectInputStream ois=new ObjectInputStream(new FileInputStream(file));
			while(ois!=null){
				list.add((Employee) ois.readObject());
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}

	public Employee getEmployee(String empID) {
			// TODO 
		return null;
	}
}
