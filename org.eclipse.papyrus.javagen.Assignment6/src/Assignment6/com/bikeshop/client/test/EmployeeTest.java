package Assignment6.com.bikeshop.client.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Assignment6.com.bikeshop.client.Employee;

public class EmployeeTest {

	@Test
	void test() {
		Employee employee = new Employee();
		employee.setEmployeeId(123789L);
		employee.setEmployeeName("Martha");
		employee.setIsManager(false);
		
		System.out.println(employee);
		
		Assertions.assertTrue(!employee.employeeName.isEmpty());
		Assertions.assertTrue(employee.employeeId > 0L);
		Assertions.assertTrue(!employee.isManager);
	}
}
