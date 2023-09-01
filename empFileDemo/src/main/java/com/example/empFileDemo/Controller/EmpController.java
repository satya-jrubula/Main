package com.example.empFileDemo.Controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.empFileDemo.Entity.Employee;
import com.example.empFileDemo.Service.EmpService;

@RestController
public class EmpController {
	

	@Autowired
		private EmpService hs;
		@GetMapping("/")
		public String index() {
			return "Greetings from Spring Boot!";
		}
		
		@GetMapping("/employees")
		public List<Employee>getEmpFromFile()
		{
			
			return hs.getEmpFromFile("E:\\Eclipse software\\Eclipse workspace\\empFileDemo\\src\\main\\resources\\static\\Employee.txt");
			
		}
		//@GetMapping("/sortedEmployees")
		//public List<Employee>sortedEmployees()
		//{
		 //return hs.writeEmpDataToFile();
		//}
		

	}


