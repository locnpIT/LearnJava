package loc.ui;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class HocComboBoxJListUI extends JFrame {
	JComboBox cboSo;
	JList listSo;
	JButton btnOK;
	public HocComboBoxJListUI(String title) {
		super(title);
		addControl();
		addEvents();
	}
	
	
	
	public void addControl() {
		Container con = getContentPane();
		JPanel pnCombo = new JPanel();
		pnCombo.setLayout(new FlowLayout());
		JLabel lblChonSo = new JLabel("Chọn số");
		pnCombo.add(lblChonSo);
		cboSo = new JComboBox<Object>();
		Random rd = new Random();
		for(int i = 0; i < 100 ; i++) {
			int x = rd.nextInt(500);
			cboSo.addItem(x + "");
		}
		pnCombo.add(cboSo);
		con.add(pnCombo);
		
		
		JPanel pnList = new JPanel();
		pnList.setLayout(new FlowLayout());
		JLabel lblChonSo2 = new JLabel("Chọn số:");
		listSo = new JList();
		Vector<Integer> vec = new Vector();
		
		for(int i = 0; i < 100; i++) {
			int x = rd.nextInt(500);
			vec.add(x);
		}
		listSo.setListData(vec);
		pnList.add(lblChonSo2);
		
		JScrollPane scList = new JScrollPane(listSo, 
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, 
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		
		
		pnList.add(scList);
		con.add(pnList);
		
		
		JPanel pnOK = new JPanel();
		pnOK.setLayout(new FlowLayout());
		btnOK = new JButton("OK");
		pnOK.add(btnOK);
		con.add(btnOK);
		
		
		
		
		
	}
	
	public void addEvents() {
		cboSo.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int vt = cboSo.getSelectedIndex();
				if(vt != -1) {
					JOptionPane.showMessageDialog(null, "Vị trí chọn bằng " + vt + " Giá trị = "
							+ cboSo.getSelectedItem());
				}
				
			}
		});
		
		btnOK.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				xyLyXemGiaTriCuaList();
				
			}

			
		});
	}
	protected void xyLyXemGiaTriCuaList() {
		Object obj = listSo.getSelectedValue();
		int vt = listSo.getSelectedIndex();
		JOptionPane.showMessageDialog(null, "List: vị trí chọn = " + vt + ";"
				+ "giá trị = " + obj);
		
		
	}
	
	public void showWindows() {
		this.setSize(400, 250);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setVisible(true);
		
		
		
	}
	

}
