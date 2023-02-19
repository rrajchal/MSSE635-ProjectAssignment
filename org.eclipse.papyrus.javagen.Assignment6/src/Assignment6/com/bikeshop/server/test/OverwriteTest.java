package Assignment6.com.bikeshop.server.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Assignment6.com.bikeshop.server.Bike;
import Assignment6.com.bikeshop.server.Overwrite;

class OverwriteTest {

	@Test
	void test() {
		Overwrite overwrite = new Overwrite();
		Bike bike = new Bike();
		overwrite.setBike(bike);
		
		System.out.println(overwrite);
		
		Assertions.assertTrue(overwrite.bike.equals(bike));
	}
}