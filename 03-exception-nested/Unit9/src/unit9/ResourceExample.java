package unit9;

public class ResourceExample {

	public static void main(String[] args) {
		try (Resource res = new Resource("A")){
			String data = res.read1();
			int value = Integer.parseInt(data);
		}catch(Exception e) {
			System.out.println("에외 처리: "+e.getMessage());
		}
		System.out.println();
		
		try(Resource res = new Resource("A")){
			String data = res.read2();
			int value = Integer.parseInt(data);
		}catch(Exception e) {
			System.out.println("예외처리: " +e.getMessage());
		}
		System.out.println();
		
		Resource res1 = new Resource("A");
		Resource res2 = new Resource("B");
		try(res1; res2){
			String data1 = res1.read1();
			String data2 = res2.read1();
		}catch(Exception e) {
			System.out.println("예외처리: "+e.getMessage());
		}
	}

}
