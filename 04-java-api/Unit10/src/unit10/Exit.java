package unit10;

public class Exit {

	public static void main(String[] args) {
		for(int i =0; i<10; i++) {
			System.out.println(i);
			if (i == 5) {
				System.out.println("프로스세 강제 종료");
				System.exit(0);
			}
		}
	}

}
