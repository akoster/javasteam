package nl.javasteam.carrental.data.hibernate;

import java.io.Serializable;
import java.util.List;

import nl.javasteam.carrental.data.BaseDao;
import nl.javasteam.carrental.data.DatabaseException;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.orm.ObjectRetrievalFailureException;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

/**
 * This class serves as the Base class for all other DAOs. It holds common CRUD
 * methods that they might all use. You should only need to extend this class
 * when your require custom CRUD logic.
 * <p>
 * To register this class in your Spring context file, use the following XML.
 * 
 * <pre>
 *      &lt;bean id=&quot;fooDao&quot; class=&quot;com.foo.dao.hibernate.GenericDaoHibernate&quot;&gt;
 *          &lt;constructor-arg value=&quot;com.foo.testCore.model.Foo&quot;/&gt;
 *          &lt;property name=&quot;sessionFactory&quot; ref=&quot;sessionFactory&quot;/&gt;
 *      &lt;/bean&gt;
 * </pre>
 * 
 * @param <T>
 *            a type variable
 * @param <PK>
 *            the primary key for that type
 */
public class HibernateBaseDao<T, PK extends Serializable> extends
		HibernateDaoSupport implements BaseDao<T, PK> {

	/**
	 * Log variable for all child classes. Uses LogFactory.getLog(getClass())
	 * from Commons Logging
	 */
	protected final Log log = LogFactory.getLog(getClass());
	private final Class<T> persistentClass;

	/**
	 * Constructor that takes in a class to see which type of entity to persist
	 * 
	 * @param persistentClass
	 *            the class type you'd like to persist
	 */
	public HibernateBaseDao(final Class<T> persistentClass) {
		this.persistentClass = persistentClass;
	}

	protected T returnOne(List<T> list) {
		if (list != null) {
			if (list.size() == 0) {
				return null;
			} else if (list.size() == 1) {
				return list.get(0);
			} else {
				throw new DatabaseException(
						"found more than 1 when expecting only 0 or 1.");
			}
		}
		return null;
	}

	protected T returnSecond(List<T> list) {
		if (list != null) {
			if (list.size() == 0) {
				return null;
			} else if (list.size() == 1) {
				return null;
			} else if (list.size() == 2) {
				return list.get(1);
			} else {
				throw new DatabaseException("found more then expected.");
			}
		}
		return null;
	}

	protected double returnDouble(List<Double> result) {
		if (result == null || result.size() == 0 || result.get(0) == null) {
			return 0;
		}
		return result.get(0);
	}

	protected long returnLong(List<Long> result) {
		if (result == null || result.size() == 0 || result.get(0) == null) {
			return 0;
		}
		return result.get(0);
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public List<T> getAll() {
		return super.getHibernateTemplate().loadAll(this.persistentClass);
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public T get(PK id) {
		T entity = (T) super.getHibernateTemplate().get(this.persistentClass,
				id);

		if (entity == null) {
			log.warn("Uh oh, '" + this.persistentClass + "' object with id '"
					+ id + "' not found...");
			throw new ObjectRetrievalFailureException(this.persistentClass, id);
		}

		return entity;
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public boolean exists(PK id) {
		T entity = (T) super.getHibernateTemplate().get(this.persistentClass,
				id);
		return entity != null;
	}

	/**
	 * {@inheritDoc}
	 */
	@SuppressWarnings("unchecked")
	public T save(T object) {
		return (T) super.getHibernateTemplate().merge(object);
	}

	/**
	 * {@inheritDoc}
	 */
	public void remove(PK id) {
		super.getHibernateTemplate().delete(this.get(id));
	}
}
