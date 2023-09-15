package loc.ui;

import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class PhuongTrinhBac1UI extends JFrame {
	JTextField txtHeSoA, txtHeSoB;
	JButton btnGiai, btnThoat;
	JTextField txtKetQua;
	ActionListener eventGiai = new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			xuLyGiaiPhuongTrinh();
			
		}
	};
	
	public PhuongTrinhBac1UI(String title) {
		super(title);
		addControls();
		addEvents();
	}
	private void xuLyGiaiPhuongTrinh() {
		String hsa = txtHeSoA.getText(); //Lấy giá trị từ JtextField xuống
		String hsb = txtHeSoB.getText();
		double a = Double.parseDouble(hsa);
		double b = Double.parseDouble(hsb);
		if(a == 0 && b == 0) {
//			gán giá trị lên JTextField
			txtKetQua.setText("Vô số nghiệm");
		}
		else if(a == 0 && b != 0) {
			txtKetQua.setText("Vô Nghiệm");
		}
		else {
			double x = -b/a;
			txtKetQua.setText("x = " + x);
		}
		
	}
	public void addEvents() {
		
		btnThoat.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		
		btnGiai.addActionListener(eventGiai);
		
		
	}
	
	
	public void addControls() {
		Container con = getContentPane();
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		con.add(pnMain);
		
		JPanel pnTitle = new JPanel();
		JLabel lblTieuDe = new JLabel("Giải phương trình bậc 1");
		pnTitle.add(lblTieuDe);
		
		pnMain.add(pnTitle);
		lblTieuDe.setForeground(Color.BLUE);
		Font fontTieuDe = new Font("arial", Font.BOLD, 20);
		lblTieuDe.setFont(fontTieuDe);
		
		
		JPanel pnHeSoA = new JPanel();
		pnHeSoA.setLayout(new FlowLayout());
		JLabel lblHeSoA = new JLabel("Hệ số a: ");
		txtHeSoA = new JTextField(15);
		pnHeSoA.add(lblHeSoA);
		pnHeSoA.add(txtHeSoA);
		pnMain.add(pnHeSoA);
		
		
		JPanel pnHeSoB = new JPanel();
		pnHeSoB.setLayout(new FlowLayout());
		JLabel lblHeSoB = new JLabel("Hệ số b");
		txtHeSoB = new JTextField(15);
		pnHeSoB.add(lblHeSoB);
		pnHeSoB.add(txtHeSoB);
		pnMain.add(pnHeSoB);
		
		
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout());
		btnGiai = new JButton("Giải");
		btnThoat = new JButton("Thoát");
		pnButton.add(btnGiai);
		pnButton.add(btnThoat);
		pnMain.add(pnButton);
		
		
		JPanel pnKetQua = new JPanel();
		pnKetQua.setLayout(new FlowLayout());
		JLabel lblKetQua = new JLabel("Kết quả");
		txtKetQua = new JTextField(15);
		pnKetQua.add(lblKetQua);
		pnKetQua.add(txtKetQua);
		pnMain.add(pnKetQua);
		
		
		
		
		
		
		
		
		
		
	}
	
	public void showWindow() {
		this.setSize(400, 250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
	}

}
