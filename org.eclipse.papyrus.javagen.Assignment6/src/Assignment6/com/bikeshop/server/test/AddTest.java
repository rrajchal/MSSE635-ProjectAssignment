package Assignment6.com.bikeshop.server.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Assignment6.com.bikeshop.server.Add;
import Assignment6.com.bikeshop.server.Bike;

class AddTest {

	@Test
	void test() {
		Add add = new Add();
		Bike bike = new Bike();		
		add.setBike(bike);
		
		System.out.println(add);
		
		Assertions.assertTrue(add.bike.equals(bike));
	}
}