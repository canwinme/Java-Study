package unit18;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;
import java.io.FileInputStream;
public class WriteExample {

	public static void main(String[] args) {
		try {
			OutputStream os = new FileOutputStream("C:/Temp/test1.db");
			
			byte a =10;
			byte b  = 20;
			byte c = 30;
			os.write(a);
			os.write(b);
			os.write(c);
			
			os.flush();
			os.close();
		}catch (IOException e) {
			e.printStackTrace();
		}
		try {
		InputStream is = new FileInputStream("C:/Temp/test1.db");
		System.out.println(is.read());
		System.out.println(is.read());
		System.out.println(is.read());
		}catch(IOException e) {
			e.printStackTrace();
		}
;	}

}
