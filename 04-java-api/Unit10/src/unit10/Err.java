package unit10;

public class Err {

	public static void main(String[] args) {
		try {
			int vvalue = Integer.parseInt("1oo");
		}catch(NumberFormatException e) {
			System.err.println("[에러 내용]");
			System.err.println(e.getMessage());
		}
	}

}
