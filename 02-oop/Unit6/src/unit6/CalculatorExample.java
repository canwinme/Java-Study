package unit6;

public class CalculatorExample {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("더하기 값은 : " + result1);
		
		double result2 = myCalc.divide(10, 4);
		System.out.println("나누기 값은 :" + result2);
		
		myCalc.powerOff();
		
		double result3 = myCalc.areaRectangle(10);
		System.out.println("정사각형넓이: " + result3);
		double result4 = myCalc.areaRectangle(15, 15);
		System.out.println("직사각형 넓이: " + result4);
	}

}
