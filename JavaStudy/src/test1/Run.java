package test1;

import java.io.FileWriter;
import java.io.IOException;

public class Run {
	public void output() {
		FileWriter fw;
		try {
			fw = new FileWriter("test.txt", true);
			fw.write(97);
			fw.write(65);
			
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
