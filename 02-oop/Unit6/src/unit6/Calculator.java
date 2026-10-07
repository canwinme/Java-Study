package unit6;

public class Calculator {
	void powerOn(){
		System.out.println("전원 ON");
	}
	
	void powerOff() {
		System.out.println("전원 OFF");
	}
	
	int plus(int x, int y)
	{
		int result = x + y;
		return result;
	}
	
	double divide(int x, int y)
	{
		double result = (double)x / (double)y;
		return result;
	}
	
	double areaRectangle(double width)
	{
		return width * width;
	}
	
	double areaRectangle(double width, double height)
	{
		return width * height;
	}
}
