package unit9;

public class E {
	void useF() {
		class F{
			int field1 = 1;
			
			static int field2 = 2;
			
			F(){
				System.out.println("F생성자");
			}
			
			void method1() {
				System.out.println("method1실행");
			}
			
			static void method2() {
				System.out.println("method2실행");
			}
		}
		F f = new F();
		System.out.println(f.field1);
		f.method1();
		
		System.out.println(F.field2);
		F.method2();
	}
}
