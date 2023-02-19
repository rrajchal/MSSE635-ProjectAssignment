package Assignment6.com.bikeshop.server.test;

import Assignment6.com.bikeshop.client.test.*;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;

@Suite
@SelectClasses({ CustomerTest.class, EmployeeTest.class, AddTest.class, AuthenticationTest.class, BikeTest.class, CustomerDbTest.class, EmployeeDbTest.class,
		OverwriteTest.class, ReservationTest.class })
public class AllTests {

}
