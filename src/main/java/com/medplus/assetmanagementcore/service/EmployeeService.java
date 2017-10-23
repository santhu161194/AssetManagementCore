package com.medplus.assetmanagementcore.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.medplus.assetmanagementcore.model.Employee;
import com.medplus.assetmanagementcore.utils.EmployeeException;

public interface EmployeeService 
{
	public String addEmployee(Employee employee);

	public String updateEmployee(Employee employee,String updatedBy,Date updatedDate);

	public String getEmployee(String empId);
	
	public String getAllEmployees();

	public boolean authenticateEmployee(String empid,String password);
	
	public String addRoleToEmp(String empId,List<Long> roleIdList, String addedBy,Date addedDate);
	
	public String addRole(int roleId, String roleName, String createdBy, Date createdDate);
	
	public String getEmployeeRole(String empid);
	
	public Map<Integer,String> getAllRole();
	
	public String getRoleId(String roleName);
	
	public String removeEmployeeRole(String empid,String roleName,String removedBy,Date removedDate);
	
	public boolean changePasswordByUser(String empId,String oldPassword,String newPassword);
	
	public boolean changePasswordByAdmin(String empId,String changedBy,String newPassword);

	public String getRole(String empId);
	
	public String getRoleName(int roleId);
	
	public boolean isUserExisting(String empId);
}

	

