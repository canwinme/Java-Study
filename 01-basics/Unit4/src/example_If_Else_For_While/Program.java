package example_If_Else_For_While;
import  java.util.Scanner;
public class Program {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		boolean run = true;
		int sum = 0;
		
		while(run) {
			System.out.println("---");
			System.out.println("1234선택");
			
			String menu = scanner.nextLine();
			
			if(menu.equals("1")){
				System.out.println("예금액:");
				sum += Integer.parseInt(scanner.nextLine());
			}
			if(menu.equals("2")) {
				sum -= Integer.parseInt(scanner.nextLine());
			}
			
			run = false;
		}
		

	}

}
