package nl.javasteam.carrental.domain;

import java.io.Serializable;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;

import org.hibernate.HibernateException;
import org.hibernate.usertype.UserType;

/**
 * Hibernate TypeDef which maps instances of the enum DriversLicenseTypes to its
 * custom 'code' field.
 * 
 * @author Adriaan
 */
public class DriversLicenseTypeDef implements UserType {

	public static final String NAME = "driversLicense";
	
	private static final int[] SQL_TYPES = { Types.VARCHAR };

	public int[] sqlTypes() {
		return SQL_TYPES;
	}

	public Class<DriversLicenseType> returnedClass() {
		return DriversLicenseType.class;
	}

	public Object nullSafeGet(ResultSet rs, String[] names, Object owner)
			throws HibernateException, SQLException {

		String code = rs.getString(names[0]);
		if (rs.wasNull()) {
			return null;
		}
		return DriversLicenseType.valueOfCode(code);
	}

	public void nullSafeSet(PreparedStatement st, Object value, int index)
			throws HibernateException, SQLException {

		if (value == null) {
			st.setNull(index, Types.VARCHAR);
		} else {
			st.setString(index, ((DriversLicenseType) value).code());
		}
	}

	public Object deepCopy(Object value) throws HibernateException {
		return value;
	}

	public boolean isMutable() {
		return false;
	}

	public Object assemble(Serializable cached, Object owner)
			throws HibernateException {
		return cached;
	}

	public Serializable disassemble(Object value) throws HibernateException {
		return (Serializable) value;
	}

	public Object replace(Object original, Object target, Object owner)
			throws HibernateException {
		return original;
	}

	public int hashCode(Object x) throws HibernateException {
		return x.hashCode();
	}

	public boolean equals(Object x, Object y) throws HibernateException {
		if (x == y) {
			return true;
		}
		if ((null == x) || (null == y)) {
			return false;
		}
		return x.equals(y);
	}
}
