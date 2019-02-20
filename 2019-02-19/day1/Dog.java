package day1;

public class Dog {
    //狗的年龄
	int dogAge;
	//品种
	String dogKind;
	//狗的名字
	public Dog(String dogName) {
		System.out.println("狗的名字："+ dogName);
	}
	public int getDogAge() {
		System.out.println("狗的年龄："+ dogAge);
		return dogAge;
	}
	public void setDogAge(int dogAge) {
		this.dogAge = dogAge;
	}
	public String getDogKind() {
		System.out.println("狗的种类："+ dogKind);
		return dogKind;
	}
	public void setDogKind(String dogKind) {
		this.dogKind = dogKind;
	}
	public static void main(String[]args) {
		Dog mydog = new Dog("Tom");
		mydog.setDogAge(5);
		mydog.getDogAge();
		mydog.setDogKind("犬");
		mydog.getDogKind();
	}
}
