package com.medplus.assetmanagement.core;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;

import com.medplus.assetmanagementcore.dao.impl.EmployeeDaoImpl;
import com.medplus.assetmanagementcore.model.Employee;
import com.medplus.assetmanagementcore.service.impl.EmployeeServiceImpl;
import com.medplus.assetmanagementcore.utils.AppConfig;
import com.medplus.assetmanagementcore.utils.EmployeeException;
import com.medplus.assetmanagementcore.utils.Gender;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = AppConfig.class, loader = AnnotationConfigContextLoader.class)
public class EmployeeTest {
	@Autowired
	
	EmployeeServiceImpl employeeServiceImpl;
@Autowired
	EmployeeDaoImpl employeeDaoImpl;
	
	/*@Test
	public void testGetRoleSuccessInRoleTable() {
		Employee emp=new Employee();

		
		assertEquals("SUCCESS", employeeServiceImpl.getRoleId("edp"));
	}
	@Test
	public void testGetEmployeesRoleFailure() throws EmployeeException {
		Employee emp=new Employee();

		
		List<String> actual = employeeServiceImpl.getRole("38");
		assertEquals(actual.size(),2);
	}
	
	
	@Test
	public void testAddRoleSuccess() {
	
		String expectedResult = "SUCCESS";
		assertEquals(expectedResult,employeeServiceImpl.addRole(39,"emp","13",new java.sql.Date(new Date().getTime())));

	}
	@Test
	public void addRoleToEmpSuccess()
	{
		
		List<Long> li=new ArrayList<Long>();
		li.add((long) 13);
		li.add((long) 15);
		System.out.println("nvbmcnbzxdm,");
		assertEquals("SUCCESS",employeeServiceImpl.addRoleToEmp("37", li,"13",new java.sql.Date(new Date().getTime())));
	}
	@Test
	public void testRemoveRoleSuccess() {
	
		String expectedResult = "REMOVED";
		assertEquals(expectedResult,employeeServiceImpl.removeEmployeeRole("37","admin","15",new java.sql.Date(new Date().getTime())));
	}

	@Test
	public void testGetRoleNameSuccessInRoleTable() {
		Employee emp=new Employee();

		
		assertEquals("SUCCESS", employeeServiceImpl.getRoleName(13));
	}
	
	
	//------------------------------------------------
	
	@Test
	public void addEmployeeSuccess()
	{
		Employee employee=new Employee();
		employee.setFirstName("kalyaniI");
		employee.setPassword("niha11");
	    employee.setGender(Gender.FEMALE);
		employee.setDateOfBirth(new Date());
		employee.setDateOfJoin(new Date());
		employee.setCreatedDate(new Date());
		employee.setModifiedDate(new Date());
		employee.setEmployeeId("56");
		assertEquals("SUCCESS",employeeServiceImpl.addEmployee(employee));
}

	
	@Test
	public void testUpdateEmployeeSuccess()
	{
		Employee employee=new Employee();
		employee.setFirstName("niha");
		employee.setGender(Gender.FEMALE);
		employee.setDateOfBirth(new Date());
		employee.setDateOfJoin(new Date());
		employee.setEmployeeId("54");
		String expectedResult = "SUCCESS";
		String msg=employeeServiceImpl.updateEmployee(employee,"13", new Date());
		assertEquals(expectedResult,msg);
	}
	@Test
	public void testUpdateEmployeeFailure()
	{
		Employee employee=new Employee();
		employee.setFirstName("niha");
		employee.setGender(Gender.FEMALE);
		employee.setDateOfBirth(new Date());
		employee.setDateOfJoin(new Date());
		employee.setEmployeeId("54");
		String expectedResult = "FAILURE";
		String msg=employeeServiceImpl.updateEmployee(employee,"13", new Date());
		assertEquals(expectedResult,msg);
	}
	@Test
	public void testGetEmployeesSuccess() {
		Employee emp=new Employee();

		
		assertEquals("SUCCESS", employeeServiceImpl.getEmployee("54"));
	}
	@Test
	public void addEmployeeFailure()
	{
		Employee employee=new Employee();
		employee.setFirstName("kalyani");
		employee.setPassword("niha");
	employee.setGender(Gender.FEMALE);
	employee.setDateOfBirth(new Date());
	employee.setDateOfJoin(new Date());
	employee.setCreatedDate(new Date());
		employee.setModifiedDate(new Date());
	employee.setEmployeeId("54");
	
	assertEquals("FAILURE",employeeServiceImpl.addEmployee(employee));
		
}
	@Test
	public void testGetEmployeesFailure() {
		Employee emp=new Employee();

		
		assertEquals("SUCCESS", employeeServiceImpl.getEmployee("100"));
	}*/
	//-----------------------------------------------------------------------------
	@Test
	public void addEmployeeSuccess()
	{
		Employee employee=new Employee();
		employee.setFirstName("kalyaniI");
		employee.setPassword("niha11");
	    employee.setGender(Gender.FEMALE);
		employee.setDateOfBirth(new Date());
		employee.setDateOfJoin(new Date());
		employee.setCreatedDate(new Date());
		employee.setModifiedDate(new Date());
		employee.setEmployeeId("59");
		assertEquals("SUCCESS",employeeServiceImpl.addEmployee(employee));
}
	@Test
	public void addEmployeeFailure1()
	{
		Employee employee=new Employee();
		employee.setFirstName("kalyani");
		employee.setPassword("niha");
	employee.setGender(Gender.FEMALE);
	employee.setDateOfBirth(new Date());
	employee.setDateOfJoin(new Date());
	employee.setCreatedDate(new Date());
		employee.setModifiedDate(new Date());
	employee.setEmployeeId("54");
	
	assertEquals("FAILURE",employeeServiceImpl.addEmployee(employee));
		
}
	@Test
	public void addEmployeeFailure2()
	{
		Employee employee=new Employee();
		employee.setFirstName("kalyanidghfdghffbnnnnnnnnnnnnnnnnnnghfffffrtyrytyfgygfuhhfhgjuykjhyuk");
		employee.setPassword("niha");
	employee.setGender(Gender.FEMALE);
	employee.setDateOfBirth(new Date());
	employee.setDateOfJoin(new Date());
	employee.setCreatedDate(new Date());
		employee.setModifiedDate(new Date());
	employee.setEmployeeId("54");
	
	assertEquals("FAILURE",employeeServiceImpl.addEmployee(employee));
		
}

	@Test
	public void testUpdateEmployeeSuccess()
	{
		Employee employee=new Employee();
		employee.setFirstName("niha");
		employee.setGender(Gender.FEMALE);
		employee.setDateOfBirth(new Date());
		employee.setDateOfJoin(new Date());
		employee.setEmployeeId("54");
		String expectedResult = "SUCCESS";
		String msg=employeeServiceImpl.updateEmployee(employee,"13", new Date());
		assertEquals(expectedResult,msg);
	}
	@Test
	public void testUpdateEmployeeFailure()
	{
		Employee employee=new Employee();
		employee.setFirstName("niha");
		employee.setGender(Gender.FEMALE);
		employee.setDateOfBirth(new Date());
		employee.setDateOfJoin(new Date());
		employee.setEmployeeId("540");
		String expectedResult = "FAILURE";
		String msg=employeeServiceImpl.updateEmployee(employee,"13", new Date());
		System.out.println(msg);
		assertEquals(expectedResult,msg);
	}
	@Test
	public void testGetEmployeesSuccess() {
		Employee emp=new Employee();

		
		assertEquals("SUCCESS", employeeServiceImpl.getEmployee("54"));
	}
@Test
public void testGetEmployeesFailure() {
	Employee emp=new Employee();

	
	assertEquals("FAILURE", employeeServiceImpl.getEmployee("100"));
}

@Test
public void testGetAllEmployeesSuccess()
{
Employee emp=new Employee();

	
	assertEquals("SUCCESS", employeeServiceImpl.getAllEmployees());
}
@Test
public void testGetAllEmployeesFailure()
{
Employee emp=new Employee();

	
	assertEquals("FAILURE", employeeServiceImpl.getAllEmployees());
}
@Test
public void addRoleToEmpSuccess()
{
	
	List<Long> li=new ArrayList<Long>();
	li.add((long) 13);
	li.add((long) 15);
	System.out.println("nvbmcnbzxdm,");
	assertEquals("SUCCESS",employeeServiceImpl.addRoleToEmp("58", li,"15",new java.sql.Date(new Date().getTime())));
}
@Test
public void addRoleToEmpFailure()
{
	
	List<Long> li=new ArrayList<Long>();
	li.add((long) 13);
	li.add((long) 15);
	System.out.println("nvbmcnbzxdm,");
	assertEquals("FAILURE",employeeServiceImpl.addRoleToEmp("56", li,"15",new java.sql.Date(new Date().getTime())));
}
@Test
public void testAddRoleSuccess() {

	String expectedResult = "SUCCESS";
	assertEquals(expectedResult,employeeServiceImpl.addRole(56,"emp","16",new java.sql.Date(new Date().getTime())));

}
@Test
public void testAddRoleFailure() {

	String expectedResult = "FAILURE";
	assertEquals(expectedResult,employeeServiceImpl.addRole(39,"emp","13",new java.sql.Date(new Date().getTime())));

}

@Test
public void testGetEmployeesRoleFailure() throws EmployeeException {
	Employee emp=new Employee();
	System.out.println(employeeServiceImpl.getEmployeeRole("37"));
	assertEquals("FAILURE",employeeServiceImpl.getEmployeeRole("37"));
}
@Test
public void testGetEmployeesRoleSuccess() throws EmployeeException {
	Employee emp=new Employee();

	
	//System.out.println(employeeServiceImpl.getEmployeeRole("54"));

	
	assertEquals("SUCCESS",employeeServiceImpl.getEmployeeRole("54"));
}
@Test
public void testGetRoleIdSuccessInRoleTable() {
	Employee emp=new Employee();

	
	assertEquals("SUCCESS", employeeServiceImpl.getRoleId("admin"));
}
@Test
public void testGetRoleIdFailureInRoleTable() {
	Employee emp=new Employee();

	
	assertEquals("FAILURE", employeeServiceImpl.getRoleId("adminn"));
}
@Test
public void testGetRoleNameSuccessInRoleTable() {
	Employee emp=new Employee();	
	assertEquals("SUCCESS", employeeServiceImpl.getRole("38"));
}
@Test
public void testGetRoleNameFailureInRoleTable() {
	Employee emp=new Employee();	
	assertEquals("FAILURE", employeeServiceImpl.getRole("300"));
}
@Test
public void testGetRoleSucces()
{
	Employee emp=new Employee();
	assertEquals("SUCCESS",employeeServiceImpl.getRoleName(13));
}
@Test
public void testGetRoleFailure()
{
	Employee emp=new Employee();
	assertEquals("FAILURE",employeeServiceImpl.getRoleName(18));
}



}