package Assignment6.com.bikeshop.server.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import Assignment6.com.bikeshop.server.Bike;
import Assignment6.com.bikeshop.server.Reservation;

class BikeTest {

	@Test
	void test() {

		Bike bike = new Bike();
		Reservation reserve = new Reservation();
		bike.setBikeId(123567L);
		bike.setDescription("Cool new bike");
		bike.setIsAvailable(true);
		bike.setPrice(50L);
		bike.setReservation(reserve);
		bike.setUpdateBy(2024L);
		
		System.out.println(bike);
		
		Assertions.assertTrue(bike.bikeId > 0L);
		Assertions.assertTrue(!bike.description.isEmpty());
		Assertions.assertTrue(bike.isAvailable);
		Assertions.assertTrue(bike.price > 0L);
		Assertions.assertTrue(bike.reservation.equals(reserve));
		Assertions.assertTrue(bike.updateBy > 0L);
	}
	

}
