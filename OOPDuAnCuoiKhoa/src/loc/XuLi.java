package loc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.ReadOnlyFileSystemException;
import java.util.ArrayList;

public class XuLi {

	public XuLi() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		CongTy cty = new CongTy();
		cty.taoDuLieu();
//		cty.xuatNS();
//		cty.xuatDSPhongBan();
//		cty.xuatDSTask();
		cty.phanBoNhanVien();
		cty.xuatNS();
	
	}
}

