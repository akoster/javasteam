package nl.javasteam.carrental.swing;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static final ClassPathXmlApplicationContext APP_CONTEXT = new ClassPathXmlApplicationContext(
			new String[] { "applicationContext-dao.xml" });

	public static void main(String[] args) {
		new CarRentalUserInterFace();
	}
}
