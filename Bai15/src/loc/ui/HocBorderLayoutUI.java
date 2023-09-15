package loc.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class HocBorderLayoutUI extends JFrame {
	public HocBorderLayoutUI(String tieude) {
		this.setTitle(tieude);
		setControls();
	}
	public void setControls() {
		Container con = getContentPane();
		JPanel pnBorderLayout = new JPanel();
		pnBorderLayout.setLayout(new BorderLayout());
		
		
		JPanel pnNorth = new JPanel();
		pnNorth.setBackground(Color.BLUE);
		pnBorderLayout.add(pnNorth, BorderLayout.NORTH);
		
		pnNorth.setPreferredSize(new Dimension(0, 100));
		
		
		JPanel pnSouth = new JPanel();
		pnSouth.setBackground(Color.pink);
		pnBorderLayout.add(pnSouth, BorderLayout.SOUTH);
		
		JPanel pnWest = new JPanel();
		pnSouth.setBackground(Color.YELLOW);
		pnBorderLayout.add(pnWest, BorderLayout.WEST);
		
		JPanel pnEast = new JPanel();
		pnEast.setBackground(Color.CYAN);
		pnBorderLayout.add(pnEast, BorderLayout.EAST);
		
		JPanel pnCenter = new JPanel();
		pnCenter.setBackground(Color.GREEN);
		pnBorderLayout.add(pnCenter, BorderLayout.CENTER);
		
		con.add(pnBorderLayout);
		
		
	}
	

	public void showWindow() {
		this.setSize(600, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}
	

}
