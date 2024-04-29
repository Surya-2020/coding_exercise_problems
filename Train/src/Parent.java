public class Parent implements Comparable<Parent>{
	
	String name;
	String age;
	
	
	
	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	
	public Parent(String name, String age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public String toString() {
		return "Parent [name=" + name + ", age=" + age + "]";
	}

	Parent(){
		name="uuu";
		age="33";
		return;
	}

	public void run() {
		System.out.println("Im a parent and Im running..");
	}





	@Override
	public int compareTo(Parent o2) {
		
		return this.getName().compareTo(o2.getName());
	}
}
