package unit3_1;

public class operator_1 {

	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		x++; //x=11
		++x; //x=12
		
		System.out.println("x: "+ x);
		System.out.println("----------");
		
		y--; //y=9
		--y; //y=8
		System.out.println("y:" + y);
		System.out.println("----------");
		z = x++; //후위 증감자 증감나중 계산(대입)먼저
		System.out.println("z: " +z); //x = 13
		System.out.println("x: " +x); //x = 13
		System.out.println("----------");
		

	}

}
