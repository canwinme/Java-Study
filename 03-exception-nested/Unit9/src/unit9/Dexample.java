package unit9;

public class Dexample {

	public static void main(String[] args) {
		D.B d = new D.B();
		
		System.out.println("b.field1");
		d.method1();
		
		System.out.println(D.B.field2);
		D.B.method2();
		
		
	}

}
