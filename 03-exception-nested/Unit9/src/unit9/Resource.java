package unit9;

public class Resource implements AutoCloseable {
	private String name;
	
	public Resource(String name) {
		this.name = name;
		System.out.println("Resource("+name+")열기");
	}
	public String read1()
	{
		System.out.println("Resource("+name+")읽기");
		return "100";
	}
	public String read2()
	{
		System.out.println("Resource("+name+")읽기");
		return "abc";
	}
	
	public void close() throws Exception{
		System.out.println("Resource("+name+")닫기");
	}

}
