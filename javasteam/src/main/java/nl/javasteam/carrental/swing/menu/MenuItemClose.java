package nl.javasteam.carrental.swing.menu;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JMenuItem;

/**
 * User interface close menu item
 * 
 */
public class MenuItemClose extends JMenuItem {

	private static final long serialVersionUID = 1L;

	public MenuItemClose() {
		setText("Exit");
		setMnemonic(KeyEvent.VK_X);
		addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		setSize(100, 20);
	}
}
