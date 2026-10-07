package unit10;

public class GetClassExample {

	public static void main(String[] args) {
		Class clazz = Car.class;
		Car car = new Car();
		Class claze = car.getClass();
		
		
		System.out.println("패키지 :" +clazz.getPackage().getName());
		System.out.println("클래스 간단 이름 " +clazz.getSimpleName());
		System.out.println("클래스 전체 이름: " + clazz.getName());
	}

}
