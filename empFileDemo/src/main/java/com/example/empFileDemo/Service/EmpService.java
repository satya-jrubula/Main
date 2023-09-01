package com.example.empFileDemo.Service;
import java.io.BufferedReader;
//import java.io.BufferedWriter;
import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import com.example.empFileDemo.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmpService {
	
		
		List<Employee> empList= new ArrayList<Employee>(50);
		
		public List<Employee>getEmpFromFile(String filepaths)
		{
			
			try
			{
				BufferedReader br=new BufferedReader(new FileReader(filepaths));  
				String line;
				while((line=br.readLine())!=null)
				{
					String parts[]=line.split(",");
					Employee e= new Employee(parts[0],parts[1],parts[2],parts[3]);
					empList.add(e);
				}
				br.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
			Collections.sort(empList);
			System.out.println("After sorting");
			System.out.println(empList);
			return empList;
			
		}
		
		
		
	}




