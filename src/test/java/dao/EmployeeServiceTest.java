package dao;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.jupiter.api.Test;

import entity.model.Employee;
import util.DBUtil;

class EmployeeServiceTest {

	@Test
	void VerifyErrorHandlingForInvalidEmployeeData() throws ParseException {
		DBUtil.getConnection();
		 
		
		int employeeID = 1;
		String firstName = "John";
		String lastName = "Price";
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Date dateOfBirth=sdf.parse("2002-12-14");
		
		 String gender = "M";
		 String email="'johnprice@gmail.com'";
		 String phoneNumber="1234567890";
		 String address="SAS UK";
		String position= "Manager";
		Date joiningDate = sdf.parse("2023-02-01"); 
		 Date terminationDate=null;
		 
		Employee testemp = new Employee(employeeID,firstName, lastName , dateOfBirth ,gender, email,
				 phoneNumber,address, position, joiningDate,terminationDate );
		
		
		EmployeeService es = new EmployeeService();
		 
		Employee test2 =es.GetEmployeeById(employeeID);
		
		
		assertTrue(testemp.equals(test2));
		
	}

}
