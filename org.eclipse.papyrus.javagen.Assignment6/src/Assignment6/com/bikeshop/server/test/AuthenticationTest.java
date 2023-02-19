package Assignment6.com.bikeshop.server.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import Assignment6.com.bikeshop.server.Authentication;

class AuthenticationTest {

	@Test
	void test() {
		Authentication auth = new Authentication();
		auth.setIsAuthorized(true);
		
		System.out.println(auth);
		
		Assertions.assertTrue(auth.isAuthorized);
	}
}