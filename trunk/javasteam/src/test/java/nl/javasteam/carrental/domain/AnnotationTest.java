package nl.javasteam.carrental.domain;

import javax.persistence.Entity;

import org.junit.Test;
import org.springframework.util.Assert;

public class AnnotationTest {

	@Test
	public void test() {
		Assert.isTrue(Vehicle.class.isAnnotationPresent(Entity.class));
		Assert.isTrue(!EnumUserType.class.isAnnotationPresent(Entity.class));
	}
}
