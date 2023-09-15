package Loc.modal.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import Loc.modal.NhanVien;
import Loc.modal.PhongBan;

public class QuanLyNhanVienUI extends JFrame {
	JComboBox<PhongBan>cboPhongBan;
	JList<NhanVien>listNhanVien;
	JTextField txtMa, txtTen, txtNgayVaoLam, txtNamSinh;
	JButton btnLuu, btnXoa, btnThoat;
	
	ArrayList<PhongBan> dsPhongBan;
	ArrayList<NhanVien> dsNhanVienTheoPhongBan;
	
	
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	PhongBan pbSelected = null;
	NhanVien nvSelected = null;
	
	public QuanLyNhanVienUI(String title) {
		super(title);
		addControls();
		addEvents();
		fakeData();
	}
	
	public void addControls() {
		Container con = getContentPane();
		JPanel pnMain = new JPanel();
		pnMain.setLayout(new BoxLayout(pnMain, BoxLayout.Y_AXIS));
		con.add(pnMain);
		JPanel pnPhongBan = new JPanel();
		pnPhongBan.setLayout(new FlowLayout());
		pnMain.add(pnPhongBan);
		JLabel lblPhongBan = new JLabel("Chọn phòng ban: ");
		cboPhongBan = new JComboBox<PhongBan>();
		cboPhongBan.setPreferredSize(new Dimension(200, 25));
		pnPhongBan.add(lblPhongBan);
		pnPhongBan.add(cboPhongBan);
		
		JPanel pnDanhSachVaChiTiet = new JPanel();
		pnDanhSachVaChiTiet.setLayout(new GridLayout(1, 2)); // 1 dòng và 2 cột
		pnMain.add(pnDanhSachVaChiTiet);
		JPanel pnDanhSach = new JPanel();
		pnDanhSach.setLayout(new BorderLayout());
		
		Border borderDanhSach = BorderFactory.createLineBorder(Color.BLUE);
		TitledBorder titleBorderDanhSach = new TitledBorder(borderDanhSach, "Danh Sách");
		titleBorderDanhSach.setTitleJustification(TitledBorder.CENTER);
		pnDanhSach.setBorder(titleBorderDanhSach);
		
		
		listNhanVien = new JList<NhanVien>();
		JScrollPane sc = new JScrollPane(listNhanVien, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pnDanhSach.add(sc, BorderLayout.CENTER);
		pnDanhSachVaChiTiet.add(pnDanhSach);
		
		
		JPanel pnChiTiet = new JPanel();
		pnChiTiet.setLayout(new BoxLayout(pnChiTiet, BoxLayout.Y_AXIS));
		
		
		Border borderChiTiet = BorderFactory.createLineBorder(Color.BLUE);
		TitledBorder titleBorderChiTiet = new TitledBorder(borderChiTiet, "Chi Tiết");
		titleBorderChiTiet.setTitleJustification(TitledBorder.CENTER);
		pnChiTiet.setBorder(titleBorderChiTiet);
		
		
		pnDanhSachVaChiTiet.add(pnChiTiet);
		
		JPanel pnMa = new JPanel();
		pnMa.setLayout(new FlowLayout());
		JLabel lblMa = new JLabel("Mã:");
		txtMa = new JTextField(15);
		pnMa.add(lblMa);
		pnMa.add(txtMa);
		pnChiTiet.add(pnMa);
		
		
		JPanel pnTen = new JPanel();
		pnTen.setLayout(new FlowLayout());
		JLabel lblTen = new JLabel("Tên:");
		txtTen = new JTextField(15);
		pnTen.add(lblTen);
		pnTen.add(txtTen);
		pnChiTiet.add(pnTen);
		
		
		JPanel pnNgayVao = new JPanel();
		pnNgayVao.setLayout(new FlowLayout());
		JLabel lblNgayVao = new JLabel("Ngày Vào:");
		txtNgayVaoLam = new JTextField(15);
		pnNgayVao.add(lblNgayVao);
		pnNgayVao.add(txtNgayVaoLam);
		pnChiTiet.add(pnNgayVao);
		
		JPanel pnNamSinh = new JPanel();
		pnNamSinh.setLayout(new FlowLayout());
		JLabel lblNamSinh = new JLabel("Năm Sinh:");
		txtNamSinh = new JTextField(15);
		pnNamSinh.add(lblNamSinh);
		pnNamSinh.add(txtNamSinh);
		pnChiTiet.add(pnNamSinh);
		
		JPanel pnButton = new JPanel();
		pnButton.setLayout(new FlowLayout(FlowLayout.RIGHT));
		btnLuu = new JButton("Lưu");
		btnXoa = new JButton("Xóa");
		btnThoat = new JButton("Thoát");
		
		pnButton.add(btnLuu);
		pnButton.add(btnXoa);
		pnButton.add(btnThoat);
		pnMain.add(pnButton);	
		
		lblMa.setPreferredSize(lblNamSinh.getPreferredSize());
		lblTen.setPreferredSize(lblNamSinh.getPreferredSize());
		lblNgayVao.setPreferredSize(lblNamSinh.getPreferredSize());
	}
	
	public void fakeData() {
		dsPhongBan = new ArrayList<PhongBan>();
		PhongBan phtgv = new PhongBan();// phòng hợp tác giảng viên
		phtgv.setMaPhong("p1");
		phtgv.setTenPhong("Phòng hợp tác giảng viên");
		
		PhongBan pkd = new PhongBan();
		pkd.setMaPhong("p2");
		pkd.setTenPhong("Phòng kinh doanh");
		
		PhongBan pkt = new PhongBan();
		pkt.setMaPhong("p3");
		pkt.setTenPhong("Phòng kế toán");
		
		dsPhongBan.add(phtgv);
		dsPhongBan.add(pkd);
		dsPhongBan.add(pkt);
		
		phtgv.themNhanvien(
				new NhanVien("nv1", "Nguyễn Phước Lộc", 
				new Date(2021 - 1900, 1, 1), new Date(2004 - 1900, 1, 1)));
		phtgv.themNhanvien(
				new NhanVien("nv2", "Nguyễn Đức Thịnh", 
				new Date(2020 - 1900, 1,  1), new Date(2000 - 1900, 1, 1)));
		
		pkd.themNhanvien(
				new NhanVien("nv3", "Bùi Thị Kim Ngân", 
				new Date(2020 - 1900, 1,  1), new Date(2004 - 1900, 1, 1)));
		pkd.themNhanvien(
				new NhanVien("nv4", "Trần Văn B", 
				new Date(2020 - 1900, 1,  1), new Date(2004 - 1900, 1, 1)));

		for (PhongBan pb : dsPhongBan) {
			cboPhongBan.addItem(pb);
		}
		
		
	
	}
	
	public void addEvents() {
		cboPhongBan.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				if(cboPhongBan.getSelectedIndex() == -1)return;
				pbSelected = (PhongBan) cboPhongBan.getSelectedItem();
				listNhanVien.setListData(pbSelected.getNhanViens());
			}
		});
		listNhanVien.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				if(listNhanVien.getSelectedIndex()==-1)return;
				nvSelected = listNhanVien.getSelectedValue();
				txtMa.setText(nvSelected.getMaNhanVien());
				txtTen.setText(nvSelected.getTenNhanVien());
				
				txtNamSinh.setText(sdf.format(nvSelected.getNamSinh()));
				txtNgayVaoLam.setText(sdf.format(nvSelected.getNgayVaoLamViec()));
				
			}
		});
		btnLuu.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				xuLyLuu();
			}
		});	
		btnXoa.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				xuLyXoa();
				
			}
		});
		btnThoat.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				System.exit(ABORT);
				
			}
		});
		
	}


	
	
	
	protected void xuLyXoa() {
		if(nvSelected != null) {
			pbSelected.getNhanViens().remove(nvSelected);
			nvSelected = null;
			listNhanVien.setListData(pbSelected.getNhanViens());
			
		}
		
	}

	protected void xuLyLuu() {
		try {
			NhanVien nv = new NhanVien(
					txtMa.getText(),
					txtTen.getText(),
					sdf.parse(txtNgayVaoLam.getText()),
					sdf.parse(txtNamSinh.getText()));

			if(pbSelected!= null) {
				pbSelected.themNhanvien(nv);
				listNhanVien.setListData(pbSelected.getNhanViens());
			}
		}catch(Exception ex) {
			JOptionPane.showMessageDialog(null, ex.toString());
		}
		

	}

	public void showWindows() {
		this.setSize(500, 400);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		
	}
	

}
