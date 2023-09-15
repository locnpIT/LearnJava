package loc.ui;

import java.awt.Button;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

public class HocBorderVaJtextAreaCheckBoxRadioUI extends JFrame {
	JTextField txtTen;
	JTextArea txtDiaChi;
	Button btnOK;
	
	JCheckBox chkDiBoi, chkDiXemPhim;
	JRadioButton rdNam, rdNu;
	ButtonGroup groupGioiTinh;
	
	public HocBorderVaJtextAreaCheckBoxRadioUI(String title) {
		super(title);
		addControls();
		addEvents();
	}
	
	public void addControls() {
		Container con = getContentPane();
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		con.add(pnMain);
		
		JPanel pnThongTin = new JPanel();
		pnThongTin.setLayout(new BoxLayout(pnThongTin, BoxLayout.Y_AXIS));
		JPanel pnTen = new JPanel();
		pnTen.setLayout(new FlowLayout());
		JLabel lblTen = new JLabel("Nhập tên:");
		txtTen = new JTextField(20);
		pnTen.add(lblTen);
		pnTen.add(txtTen);
		pnThongTin.add(pnTen);
		pnMain.add(pnThongTin);
		

		JPanel pnDiaChi = new JPanel();
		pnDiaChi.setLayout(new FlowLayout());
		JLabel lblDiaChi = new JLabel("Địa chỉ");
		txtDiaChi = new JTextArea(5, 20);    // 5 dòng và 15 cột
		txtDiaChi.setWrapStyleWord(true);
		txtDiaChi.setLineWrap(true);
		
		JScrollPane sc = new JScrollPane(txtDiaChi, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS
				, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnDiaChi.add(lblDiaChi);
		pnDiaChi.add(sc);
		pnThongTin.add(pnDiaChi);
	
		
		
		Border borderThongTin = BorderFactory.createLineBorder(Color.BLUE);
		TitledBorder borderTitleThongTin = new TitledBorder(borderThongTin, "Thông tin:");
		pnThongTin.setBorder(borderTitleThongTin);
		borderTitleThongTin.setTitleColor(Color.RED);
		borderTitleThongTin.setTitleJustification(TitledBorder.RIGHT);
		
		
		JPanel pnSoThichVaGioiTinh = new JPanel();
//		pnSoThichVaGioiTinh.setLayout(new BoxLayout(pnSoThichVaGioiTinh, BoxLayout.X_AXIS));
		pnSoThichVaGioiTinh.setLayout(new GridLayout(1, 2));  // 1 dòng 2 cột
		JPanel pnSoThich = new JPanel();
		Border borderSoThich = BorderFactory.createLineBorder(Color.RED);
		TitledBorder titleBorderSoThich = new TitledBorder(borderSoThich, "Sở Thích");
		pnSoThich.setBorder(titleBorderSoThich);
		
		
		pnSoThich.setLayout(new BoxLayout(pnSoThich, BoxLayout.Y_AXIS));
		chkDiBoi = new JCheckBox("Đi bơi");
		chkDiXemPhim = new JCheckBox("Đi xem phim");
		pnSoThich.add(chkDiBoi);
		pnSoThich.add(chkDiXemPhim);
		pnSoThichVaGioiTinh.add(pnSoThich);
		
		JPanel pnGioiTinh = new JPanel();
		Border borderGioiTinh = BorderFactory.createLineBorder(Color.RED);
		TitledBorder titleBorderGioiTinh = new TitledBorder(borderGioiTinh, "Giới Tính");
		pnGioiTinh.setBorder(titleBorderGioiTinh);
		
		pnGioiTinh.setLayout(new BoxLayout(pnGioiTinh, BoxLayout.Y_AXIS));
		rdNam = new JRadioButton("Nam");
		rdNu = new JRadioButton("Nữ");
		groupGioiTinh = new ButtonGroup();
		groupGioiTinh.add(rdNam);
		groupGioiTinh.add(rdNu);
		pnGioiTinh.add(rdNam);
		pnGioiTinh.add(rdNu);
		pnSoThichVaGioiTinh.add(pnGioiTinh);
		
		pnMain.add(pnSoThichVaGioiTinh);
		
		
		
		
		
		JPanel pnOK = new JPanel();
		pnOK.setLayout(new FlowLayout(FlowLayout.RIGHT));
		btnOK = new Button("OK");
		
		pnOK.add(btnOK);
		pnMain.add(pnOK);
		
		
		
		
		lblDiaChi.setPreferredSize(lblTen.getPreferredSize());
		
	}
	public void addEvents() {
		btnOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				xuLyLayThongTin();
				
			}
		});
	}
	protected void xuLyLayThongTin() {
		String msg = txtTen.getText() + "\n";
		msg += txtDiaChi.getText() + "\n";
		
		String soThich = "";
		if(chkDiBoi.isSelected()) {
			soThich += chkDiBoi.getText() + "\n";
		}
		if(chkDiXemPhim.isSelected()) {
			soThich+= chkDiXemPhim.getText();
		}
		msg += soThich + "\n";
		
		String gioiTinh = "";
		if(rdNam.isSelected()) {
			gioiTinh = rdNam.getText();
		}
		else {
			gioiTinh = rdNu.getText();
		}
		msg += gioiTinh;
		JOptionPane.showMessageDialog(null, msg);
		
		
		
	}
	
	
	public void showWindow() {
		this.setSize(400, 300);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	
	

}