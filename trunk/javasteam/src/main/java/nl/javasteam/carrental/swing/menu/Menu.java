package nl.javasteam.carrental.swing.menu;

import java.awt.event.KeyEvent;

import javax.swing.JMenu;

/**
 * User interface menu
 *
 */
public class Menu extends JMenu {

	private static final long serialVersionUID = 1L;
	
	public Menu() {
		setText("File");
		setMnemonic(KeyEvent.VK_F);
		add(new MenuItemClose());		
	}
}
