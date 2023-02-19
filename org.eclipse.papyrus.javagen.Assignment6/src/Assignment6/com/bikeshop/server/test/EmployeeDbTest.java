package Assignment6.com.bikeshop.server.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Assignment6.com.bikeshop.client.Employee;
import Assignment6.com.bikeshop.server.Bike;
import Assignment6.com.bikeshop.server.EmployeeDb;

class EmployeeDbTest {

	@Test
	void test() {
		EmployeeDb employeeDb = new EmployeeDb();
		Employee employee = new Employee();
		Bike bike = new Bike();
		employeeDb.setBike(bike);
		employeeDb.setEmployee(employee);
		
		System.out.println(employeeDb);
		
		Assertions.assertTrue(employeeDb.bike.equals(bike));
		Assertions.assertTrue(employeeDb.employee.equals(employee));
	}
}