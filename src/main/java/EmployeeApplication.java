import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.medplus.assetmanagementcore.dao.impl.EmployeeDaoImpl;
import com.medplus.assetmanagementcore.model.Employee;
import com.medplus.assetmanagementcore.utils.Gender;



public class EmployeeApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("com/medplus/assetmanagementcore/utils/ApplicationContext.xml");
	EmployeeDaoImpl employeeDao=context.getBean("employeeDaoImpl",EmployeeDaoImpl.class);
	Employee employee=context.getBean("employee",Employee.class);
	/*Employee emp=employeeDao.getEmployee("15");
	System.out.println(emp.getPassword());
		employee.setFirstName("kalyani");
	employee.setPassword("niha");
employee.setGender(Gender.FEMALE);
	employee.setDateOfBirth(new Date());
	employee.setDateOfJoin(new Date());
	employee.setCreatedDate(new Date());
	employee.setModifiedDate(new Date());
	employee.setEmployeeId("53");
	int rows=employeeDao.insertEmployee(employee);
	
	employee.setFirstName("kannareddy");
	employee.setGender(Gender.FEMALE);
	employee.setDateOfBirth(new Date());
	employee.setDateOfJoin(new Date());
	employee.setEmployeeId("50");
	int rows1=employeeDao.updateEmployeeInfo(employee,"13", new java.sql.Date(new Date().getTime()));
	if(rows1>0)
		System.out.println("updated");
	else
		System.out.println("not updated");
List<Employee> empl=employeeDao.getEmployees();
	for(Employee emp1:empl)
		System.out.println(emp1.getEmployeeId()+" "+emp1.getDateOfBirth());
		
	int rows2=employeeDao.addRole(40,"admin","13",new java.sql.Date(new Date().getTime()));
	if(rows2>0)
		System.out.println("added");
	else
		System.out.println("not added");
	List<Long> li=new ArrayList<Long>();
	li.add((long) 13);
	li.add((long) 15);
	employeeDao.addRoleToEmp("38", li,"13",new java.sql.Date(new Date().getTime()));
	long list=employeeDao.getRoleId("edp");
	if(list>0)
	{
	System.out.println(employeeDao.getRoleId("edp"));
}*/
	List<String> roleName=employeeDao.getRole("38");
	for(String emp2:roleName)
		System.out.println(emp2);
//int rows3=employeeDao.removeRole("37","edp","13",new java.sql.Date(new Date().getTime()));
//	if(rows3>0)
//		System.out.println("removed");
//String rows4=employeeDao.getRoleName(15);	
//System.out.println(rows4);
//}
	}
}
