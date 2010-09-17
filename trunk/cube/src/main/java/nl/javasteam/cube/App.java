package nl.javasteam.cube;

import nl.javasteam.cube.data.CubeDao;
import nl.javasteam.cube.domain.Color;
import nl.javasteam.cube.domain.Cube;
import nl.javasteam.cube.domain.Side;
import nl.javasteam.cube.domain.SideRotation;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	private CubeDao cubeDao;

	public void setCubeDao(CubeDao cubeDao) {
		this.cubeDao = cubeDao;
	}

	private void run() {

		Cube cube = new Cube();
		cube.setBottom(new Side(Color.BLUE));
		cube.setFront(new Side(Color.GREEN));
		cube.setLeft(new Side(Color.ORANGE));
		cube.setRear(new Side(Color.RED));
		cube.setRight(new Side(Color.WHITE));
		cube.setTop(new Side(Color.YELLOW));

		cube.getFront().rotate(SideRotation.CLOCKWISE);
		cube.getTop().rotate(SideRotation.CLOCKWISE);

		cubeDao.save(cube);
	}

	public static void main(String[] args) {

		System.out.println("Hello World!");
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				new String[] { "applicationContext-dao.xml" });
		App app = (App) ctx.getBean("app");
		app.run();
	}
}
