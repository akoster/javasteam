package nl.javasteam.carrental;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

@ContextConfiguration("/applicationContext-dao.xml")
@RunWith(SpringJUnit4ClassRunner.class)
@TransactionConfiguration
@Transactional
public abstract class BaseTest extends
		AbstractTransactionalJUnit4SpringContextTests {

}