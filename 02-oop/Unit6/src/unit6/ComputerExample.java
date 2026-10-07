package unit6;

public class ComputerExample {

	public static void main(String[] args) {
		Computer myCom = new Computer();
		int result = myCom.sum(1,2,3);
		System.out.println("1.값 :"+result);
		
		int result1 = myCom.sum(1,2,3,4,5);
		System.out.println("2.값 :"+result1);
		
		int[] values = {1,2,3,4,5};
		int result2 = myCom.sum(values);
		System.out.println("3.값:" + result2);
		
		int result3 = myCom.sum(new int[] {1,2,3,4,5,6});
		System.out.println("4.값: "+ result3);
		

	}

}
