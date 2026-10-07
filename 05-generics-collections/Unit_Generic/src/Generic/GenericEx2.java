package Generic;

public class GenericEx2 {
	public static <T> Boxing<T> boxing(T t){
		Boxing<T> box = new Boxing<T>();
		box.set(t);
		return box;
	}

	public static void main(String[] args) {
		Boxing<Integer> box1 = boxing(100);
		int intValue = box1.get();
		System.out.println(intValue);
		
		Boxing<String> box2 = boxing("홍길동");
		String strValue = box2.get();
		System.out.println(strValue);
	}

}
