package nl.javasteam.carrental.domain;

import org.hibernate.annotations.TypeDef;

/**
 * DriversLicenseTypes
 * 
 * @author mlapre
 */
public enum DriversLicenseType {

	A("DLA"),

	B("DLB"),

	C("DLC"),

	D("DLD"),

	E("DLE");

	private String code;

	private DriversLicenseType(String code) {
		this.code = code;
	}

	public String code() {
		return code;
	}

	public static DriversLicenseType valueOfCode(String code) {
		for (DriversLicenseType type : values()) {
			if (type.code().equals(code)) {
				return type;
			}
		}
		throw new IllegalArgumentException("No enum value matches code " + code);
	}
}
