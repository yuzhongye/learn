package day1;

public class Dog {
    //��������
	int dogAge;
	//Ʒ��
	String dogKind;
	//��������
	public Dog(String dogName) {
		System.out.println("�������֣�"+ dogName);
	}
	public int getDogAge() {
		System.out.println("�������䣺"+ dogAge);
		return dogAge;
	}
	public void setDogAge(int dogAge) {
		this.dogAge = dogAge;
	}
	public String getDogKind() {
		System.out.println("�������ࣺ"+ dogKind);
		return dogKind;
	}
	public void setDogKind(String dogKind) {
		this.dogKind = dogKind;
	}
	public static void main(String[]args) {
		Dog mydog = new Dog("Tom");
		mydog.setDogAge(5);
		mydog.getDogAge();
		mydog.setDogKind("Ȯ");
		mydog.getDogKind();
	}
}
