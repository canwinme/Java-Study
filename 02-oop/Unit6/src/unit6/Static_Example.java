package unit6;

public class Static_Example {

	public static void main(String[] args) {
		double result1 = 10 * 10 * Static.pi;
		int result2 = Static.plus(10, 5);
		int result3 = Static.minus(10,5);
		
		System.out.println("넓이\n"+ result1 + "\n더하기\n" + result2 +"\n빼기\n"+result3);

	}

}
