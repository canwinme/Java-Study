package unit18;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.IOException;
import java.io.FileNotFoundException;
public class ReadExample {

	public static void main(String[] args) {
		try {
			InputStream is = new FileInputStream("C:/temp/test1.db");
			while(true) {
				int data = is.read();
				if(data == -1) break;
				System.out.println(data);
			}
			is.close();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException e) {
			e.printStackTrace();
		}
	}

}
