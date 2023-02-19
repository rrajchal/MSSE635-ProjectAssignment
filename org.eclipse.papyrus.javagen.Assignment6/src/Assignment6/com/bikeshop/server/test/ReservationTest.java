package Assignment6.com.bikeshop.server.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Assignment6.com.bikeshop.server.Reservation;

class ReservationTest {

	@Test
	void test() {
		
		Reservation reserve = new Reservation();
		reserve.setBikeId(123654L);
		reserve.setEndDate("1 MAR 2023");
		reserve.setReservationDate("28 FEB 2023");
		reserve.setStartDate("1 MAR 2023");

		System.out.println(reserve);
		
		Assertions.assertTrue(reserve.bikeId > 0L);
		Assertions.assertTrue(!reserve.endDate.isEmpty());
		Assertions.assertTrue(!reserve.reservationDate.isEmpty());
		Assertions.assertTrue(!reserve.startDate.isEmpty());
	}

}
