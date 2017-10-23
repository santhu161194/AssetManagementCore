package com.medplus.assetmanagementcore.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Service;

import com.medplus.assetmanagementcore.dao.impl.EmployeeDaoImpl;
import com.medplus.assetmanagementcore.model.Asset;
import com.medplus.assetmanagementcore.model.Employee;
import com.medplus.assetmanagementcore.service.EmployeeService;
import com.medplus.assetmanagementcore.utils.EmployeeException;
import com.medplus.assetmanagementcore.utils.Queries;
@Service
@Scope("prototype")
public class EmployeeServiceImpl implements EmployeeService{
@Autowired

EmployeeDaoImpl employeeDaoImpl;
	
	public boolean isUserExisting(String empId) {
		Employee emp = employeeDaoImpl.getEmployee(empId);
		if(emp==null)
			return false;
		else
			return true;
	}
	
	@Override
	public String addEmployee(Employee employee){
		String msg=null;
		if(employee==null){
			EmployeeException iae= new EmployeeException("Employee Exception");
			try {
				throw iae;
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try{
		int rows = employeeDaoImpl.insertEmployee(employee);

		if(rows > 0)
			 msg="SUCCESS";
	else if(rows==0)
			msg="FAILURE";
		}
		catch(DataIntegrityViolationException e)
		{
			msg="FAILURE";
		}
		catch (Exception e) {
			// TODO: handle exception
			msg="FAILURE";
		}
			
	return msg;
		
		
	}

	@Override
	public String updateEmployee(Employee employee, String updatedBy, Date updatedDate) {
		
			//employee=employeeDaoImpl.getEmployee(employee.getEmployeeId());
		/*String msg=null;
		try {
			int rows = employeeDaoImpl.updateEmployeeInfo(employee, updatedBy, updatedDate);
			
			if(rows > 0)
				 msg="SUCCESS";
			else
				msg="FAILURE";
		} catch (Exception e) {
			System.out.println("sql exception raised");
		}
		
		return msg;*/
		String msg=null;
		if(employee==null || updatedBy==null || updatedDate==null){
			EmployeeException iae= new EmployeeException("Employee Exception");
			try {
				throw iae;
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try{
			int rows = employeeDaoImpl.updateEmployeeInfo(employee, updatedBy, updatedDate);

		if(rows > 0)
			 msg="SUCCESS";
	else if(rows==0)
			msg="FAILURE";
		}
		catch(NullPointerException e)
		{
			msg="FAILURE";
		}
			
	return msg;
		
	}

	/*@Override
	public String getEmployee(String empId) {
		
		Employee emp = employeeDaoImpl.getEmployee(empId);
		
		System.out.println(emp.getEmployeeId() + " " + emp.getGender());
		String msg="SUCCESS";
		return msg;

	}*/
	public String getEmployee(String empId) {
		/*Employee emp = employeeDaoImpl.getEmployee(empId);

		System.out.println(emp.getEmployeeId() + " " + emp.getGender());
		return emp;*/
		String msg=null;
		if(empId.isEmpty()){  //change and validate using validate class
			EmployeeException iae= new EmployeeException("Employee ID Not Found Exception");
			try {
				throw iae;
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try{
		Employee emp = employeeDaoImpl.getEmployee(empId);

		System.out.println(emp.getEmployeeId() + " " + emp.getGender());
		if(emp.equals(0))
			msg="FAILURE";
		else
			msg="SUCCESS";
		}
		catch(NullPointerException e)
		{
			msg="FAILURE";
		}
		return msg;

	}

	@Override
	public String getAllEmployees() {
		
		/*String msg=null;
		
		List<Employee> rows = employeeDaoImpl.getEmployees();
		System.out.println(rows.size());
		if(rows.size()==0)
		{
		EmployeeException iae= new EmployeeException("No Employee Found");
			try {
				throw iae;
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		else 
			
		
		return rows;
		return rows;*/
		String msg=null;
		
		try{
			List<Employee> rows = employeeDaoImpl.getEmployees();
		
		if(!rows.isEmpty())
			msg="SUCCESS";
		else
			msg="FAILURE";
		}
		catch(Exception e)
		{
			msg="FAILURE";
		}
		return msg;
	}
		
	
	
	
	@Override
	public String removeEmployeeRole(String empId,String roleName, String removedBy, Date removedDate) {
		
		String msg=null;
		if(removedBy.equals("15")) {
		try {
			int rows = employeeDaoImpl.removeRole(empId, roleName, removedBy, removedDate);
			
			if(rows > 0)
				 msg="REMOVED";
			else
			msg="NOT REMOVED";
		} catch (Exception e) {
			System.out.println("sql exception raised");
		}
		}
		else 
			return "NO AUTHORITY";
		
		return msg;
		
	}
	
	@Override
	public String addRoleToEmp(String empId, List<Long> roleIdList, String addedBy,Date addedDate) {
		
		String msg=null;
		try {
			
			int rows = employeeDaoImpl.addRoleToEmp(empId, roleIdList, addedBy, addedDate);
			if(rows > 0)
				 msg="SUCCESS";
			else
			msg="FAILURE";
		} catch (Exception e) {
			msg="FAILURE";
		}
		
		return msg;
	}

	@Override
	public String addRole(int roleId, String roleName, String addedBy, Date addedDate) {
		
		/*String msg=null;
		
			int rows = employeeDaoImpl.addRole(roleId, roleName, addedBy, addedDate);
			
			if(rows > 0)
				 msg="SUCCESS";
			else
			{
				EmployeeException iae= new EmployeeException("No Employee Found");
				try {
					throw iae;
				} catch (EmployeeException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}	
			}
			
		return msg;*/
		String msg=null;
		if(roleId==0 || roleName==null || addedBy==null || addedDate==null){
			EmployeeException iae= new EmployeeException("Employee Exception");
			try {
				throw iae;
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try{
		int rows = employeeDaoImpl.addRole(roleId, roleName, addedBy, addedDate);

		if(rows > 0)
			 msg="SUCCESS";
	else if(rows==0)
			msg="FAILURE";
		}
		catch(DuplicateKeyException e)
		{
			msg="FAILURE";
		}
			
	return msg;
			
	}

	@Override
	public boolean authenticateEmployee(String empid, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	
	

	@Override
	public String getEmployeeRole(String empId) {
		/*List<String> list=employeeDaoImpl.getRole(empId);
		if(list.size()==0)
		{
		EmployeeException iae= new EmployeeException("No Employee Found");
			try {
				throw iae;
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		return list;*/
		String msg=null;
		if(empId.isEmpty()){  //change and validate using validate class
			EmployeeException iae= new EmployeeException("Employee ID Not Found Exception");
			try {
				throw iae;
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try{
			List<String> list=employeeDaoImpl.getRole(empId);

		System.out.println(list);
		if(!list.isEmpty())
			msg="SUCCESS";
		else
			msg="FAILURE";
		}
		catch(Exception e)
		{
			msg="FAILURE";
		}
		return msg;

	}

	@Override
	public Map<Integer, String> getAllRole() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getRoleId(String roleName) {
		
		String msg=null;
		/*
		long rows = employeeDaoImpl.getRoleId(roleName);
		
		if(rows > 0)
			 msg="SUCCESS";
		else
		{
			EmployeeException iae= new EmployeeException("No Employee Found");
			try {
				throw iae;
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		
	return msg;*/
		try{
			long rows = employeeDaoImpl.getRoleId(roleName);
			if(rows > 0)
				 msg="SUCCESS";
		else if(rows==0)
				msg="FAILURE";
			}
			catch(Exception e)
			{
				msg="FAILURE";
			}
				
		return msg;
	}

	
	@Override
	public boolean changePasswordByUser(String empId, String oldPassword, String newPassword) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean changePasswordByAdmin(String empId, String changedBy, String newPassword) {
		// TODO Auto-generated method stub
		return false;
	}
//repeated
	@Override
	public String getRole(String empId) {
		/*String msg = null;
		List<String> list=employeeDaoImpl.getRole(empId);
		if(list.size()==0)	{
			msg = "FAILURE";
			EmployeeException iae= new EmployeeException("No Employee Found");
			try {
				throw iae;
			} catch (EmployeeException,Excep e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		}
		return msg;*/
		String msg=null;
		if(empId.isEmpty()){  //change and validate using validate class
			EmployeeException iae= new EmployeeException("Employee ID Not Found Exception");
			try {
				throw iae;
			} catch (EmployeeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		try{
			List<String> list=employeeDaoImpl.getRole(empId);

		System.out.println(list);
		if(!list.isEmpty())
			msg="SUCCESS";
		else
			msg="FAILURE";
		}
		catch(Exception e)
		{
			msg="FAILURE";
		}
		return msg;
	}
	@Override
	public String getRoleName(int roleId) {
		String msg=null;
		/*
		String rows = employeeDaoImpl.getRoleName(roleId);
		
		
			 msg="SUCCESS";
		
	return msg;
		*/
		try{
			String rows = employeeDaoImpl.getRoleName(roleId);

		if(!rows.isEmpty())
			msg="SUCCESS";
		else
			msg="FAILURE";
		}
		catch(Exception e)
		{
			msg="FAILURE";
		}
		return msg;
	}
}
