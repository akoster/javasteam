package nl.javasteam.carrental.domain;

import junit.framework.Assert;

import org.junit.Test;

public class DriversLicenseTypeTest {

	@Test
	public void test() {
		Assert.assertEquals(0, DriversLicenseType.A.ordinal());
		
		Assert.assertEquals("A", DriversLicenseType.A.name());
		
		Assert.assertEquals("DLA", DriversLicenseType.A.code());
		
		DriversLicenseType valueOf = Enum.valueOf(DriversLicenseType.class, "A");
		Assert.assertEquals(DriversLicenseType.A, valueOf);
	}

}
