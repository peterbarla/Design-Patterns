package lab9;

import javax.swing.JFrame;

public class MyFRame extends JFrame {

	private MyPanel panel;

	public MyFRame() {
		panel = new MyPanel();
		add(panel);
		setVisible(true);
		setBounds(100, 100, 500, 500);
	}

}
