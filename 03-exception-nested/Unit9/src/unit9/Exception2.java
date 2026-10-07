package unit9;

public class Exception2 {
	public static void printLength(String data) {
		try {
			int result = data.length();
			System.out.println("문자수"+result);
		} catch(NullPointerException e) {
			System.out.println(e.getMessage());
			System.out.println(e.toString());
			e.printStackTrace();
		}finally {
			System.out.println("마무리 실행");
		}
	}	
	
	
	public static void main(String[] args) {
		System.out.println("시작");
		printLength(null);
		System.out.println("종료");
		}
	}
