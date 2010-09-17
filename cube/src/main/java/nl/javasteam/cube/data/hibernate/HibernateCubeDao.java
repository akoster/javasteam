package nl.javasteam.cube.data.hibernate;

import nl.javasteam.cube.data.CubeDao;
import nl.javasteam.cube.domain.Cube;

public class HibernateCubeDao extends HibernateBaseDao<Cube, Long> implements
		CubeDao {

	public HibernateCubeDao() {
		super(Cube.class);
	}

}
