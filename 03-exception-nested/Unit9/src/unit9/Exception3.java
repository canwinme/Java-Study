package unit9;

public class Exception3 {

	public static void main(String[] args) {
		try {
			Class.forName("java.lang.String");
			System.out.println("클래스가 존재");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println();
		try {
			Class.forName("java.lang.String2");
			System.out.println("클래스가 존재");
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
