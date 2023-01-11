package view;

import javax.swing.JFrame;
import javax.swing.UIManager;

public class v  extends JFrame{
	v(){
		
		setTitle("eyery");
		setVisible(true);
		setBounds(459, 200, 500,700);
		
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new v();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
