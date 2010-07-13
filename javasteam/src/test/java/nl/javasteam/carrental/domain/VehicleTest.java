package nl.javasteam.carrental.domain;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Before;
import org.junit.Test;

// It is not useful to test classes if they only have fields and normal 
// getters/setters, so maybe this test should be removed evenutally.
public class VehicleTest {

	private Vehicle instance;

	@Before
	public void setUp() {
		this.instance = new Vehicle();
	}

	@Test
	public void test() {

		assertNull(instance.getId());
		instance.setId(123623868L);
		assertNotNull(instance.getId());
	}

}
