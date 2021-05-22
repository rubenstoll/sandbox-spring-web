package ch.allianz.dsp.sandbox;

import ch.allianz.dsp.sandbox.user.UserController;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.notNullValue;

@SpringBootTest
class SandboxAppTests {

	@Autowired
	private UserController userController;

	@DisplayName("Single test successful")
	@Test
	void contextLoads() {
		assertThat(userController, is(notNullValue()));
	}

}
