package loc.ui;

import java.awt.Color;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class CuaSoCuaToi extends JFrame {
	public CuaSoCuaToi(String tieude) {
		super(tieude);
		addControls();
	}
	public void addControls() {
//		lấy lớp chứa cửa sổ ra
		Container con = getContentPane();
//		tạo một lớp chứa controls	
		JPanel pn = new JPanel();
		pn.setBackground(Color.RED);
		
		JButton btn = new JButton("Đây là nút lệnh");
		pn.add(btn);
		
//		Đưa panel lên giao diện
		con.add(pn);
	}
	
	public void showWindow() {
		this.setSize(500, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
//		không cho kéo to thu nhỏ cửa sổ
//		this.setResizable(false);
		this.setVisible(true);

	}

}
