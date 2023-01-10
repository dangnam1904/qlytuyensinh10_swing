package Test;

import javax.swing.UIManager;


import view.TruongC2View;

public class Test {
	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new TruongC2View();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

