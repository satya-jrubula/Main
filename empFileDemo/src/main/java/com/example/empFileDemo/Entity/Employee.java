package com.example.empFileDemo.Entity;
import java.io.Serializable;
public class Employee implements Comparable<Employee>,Serializable {
	
		String id;
		String name;
		String designation;
		String salery;
		public Employee(String id, String name, String designation, String salery) {
			super();
			this.id = id;
			this.name = name;
			this.designation = designation;
			this.salery = salery;
		}
		public String getId() {
			return id;
		}
		public void setId(String id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getSalery() {
			return salery;
		}
		public void setSalery(String salery) {
			this.salery = salery;
		}
		@Override
		public int compareTo(Employee e)
		{
			return this.designation.compareTo(e.getDesignation());
		}
		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", salery=" + salery + "]";
		}
		
	}



