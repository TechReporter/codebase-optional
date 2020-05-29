/**
 * 
 */
package builder;

/**
 * @author 212720190
 * @date Mar 17, 2019
 */
public class Student {
	
	public static class StudentBuilder {
	
		private int id;
		private String name;
		private String address;
		private String dept;
		private Long rollNo;
		
		public StudentBuilder id(int id) {
			this.id = id;
			return this;
		}
		
		public StudentBuilder name(String name) {
			this.name = name;
			return this;
		}
		
		public StudentBuilder address(String address) {
			this.address = address;
			return this;
		}
		
		public StudentBuilder dept(String dept) {
			this.dept = dept;
			return this;
		}
		
		public StudentBuilder rollNo(Long rollNo) {
			this.rollNo = rollNo;
			return this;
		}
		
		public Student build() {
			return new Student(this);
		}
	}

	private int id;
	private String name;
	private String address;
	private String dept;
	private Long rollNo;
	
	public Student() {
		
	}
	public Student(StudentBuilder studBuilder) {
		this.id = studBuilder.id;
		this.name = studBuilder.name;
		this.address = studBuilder.address;
		this.dept = studBuilder.dept;
		this.rollNo = studBuilder.rollNo;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getDept() {
		return dept;
	}
	public Long getRollNo() {
		return rollNo;
	}
	
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", address=" + address + ", dept=" + dept + ", rollNo=" + rollNo
				+ "]";
	}
}
