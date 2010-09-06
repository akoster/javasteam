package nl.javasteam.carrental.swing.menu;

import javax.swing.JMenuBar;

/**
 * User interface menu
 *
 */
public class MenuBar extends JMenuBar {

	private static final long serialVersionUID = 1L;
	
	public MenuBar() {
		add(new Menu());
	}
}
