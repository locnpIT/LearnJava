package loc.ui;

import java.awt.Button;
import java.awt.Container;

import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class HocBoxLayoutUI extends JFrame {
	public HocBoxLayoutUI(String tieude) {
		super(tieude);
		addControls();
	}
	public void addControls() {
		Container con = getContentPane();
		JPanel pnBox = new JPanel();
		pnBox.setLayout(new BoxLayout(pnBox, BoxLayout.Y_AXIS));
		
		Button btn1 = new Button("Demo Button 1");
		Button btn2 = new Button("Demo Button 2");
		Button btn3 = new Button("Demo Button 3");
		
		pnBox.add(btn1);
		pnBox.add(btn2);
		pnBox.add(btn3);
		
		con.add(pnBox);
	}

	
	
	
	
	public void showWindow() {
		this.setSize(600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
}
