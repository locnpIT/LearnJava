package loc;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class DanhSachTask implements NhapXuat {

	private ArrayList<Task> dsTask;

	// getter setter
	public ArrayList<Task> getDsTask() {
		return dsTask;
	}

	public void setDsTask(ArrayList<Task> dsTask) {
		this.dsTask = dsTask;
	}

	// constructor
	public DanhSachTask() {
		this.dsTask = new ArrayList<Task>();
	}

	@Override
	public void xuat() {
		for (Task task : dsTask) {
			task.xuat();
		}

	}

	public void taoDuLieu() {
		try {
			FileReader reader = new FileReader("src/Task.txt");
			BufferedReader bufferedReader = new BufferedReader(reader);
			
			String line;
			
			while((line = bufferedReader.readLine()) != null) {
//				System.out.println(line);
				String[] listInfo = line.split(" # ");
				Task task = new Task(listInfo[0], listInfo[1], Float.parseFloat(listInfo[2]));
				
				this.dsTask.add(task);
			}
			reader.close(); //đóng tập tin
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
