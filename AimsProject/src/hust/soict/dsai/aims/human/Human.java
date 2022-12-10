package hust.soict.dsai.aims.human;

public abstract class Human {
	private String name;
	private int age;
	public Human(String name2, int age2) {
		this.name = name2;
		this.age = age2;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
