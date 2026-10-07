package unit15;

public class Student {
	public int studentnum;
	public String name;
	
	public Student(int studentnum, String name) {
		this.studentnum = studentnum;
		this.name = name;
	}
	
	public int hashCode() {
		return studentnum;
	}
	
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student student = (Student) obj;
			return this.studentnum == student.studentnum;
		}
		return false;
	}
}
