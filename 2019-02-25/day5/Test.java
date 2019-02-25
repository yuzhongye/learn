package day5;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		show(new Cat());  // �� Cat ������� show ����
	      show(new Dog());  // �� Dog ������� show ����
	                
	      Animal a = new Cat();  // ����ת��  
	      a.eat();               // ���õ��� Cat �� eat
	      Cat c = (Cat)a;        // ����ת��  
	      c.work();        // ���õ��� Cat �� work
	  }  
	            
	    public static void show(Animal a)  {
	      a.eat();  
	        // �����ж�
	        if (a instanceof Cat)  {  // è�������� 
	            Cat c = (Cat)a;  
	            c.work();  
	        } else if (a instanceof Dog) { // ���������� 
	            Dog c = (Dog)a;  
	            c.work();  
	        }  
	    }  
	}
	 
	abstract class Animal {  
	    abstract void eat();  
	}  
	  
	class Cat extends Animal {  
	    public void eat() {  
	        System.out.println("����");  
	    }  
	    public void work() {  
	        System.out.println("ץ����");  
	    }  
	}  
	  
	class Dog extends Animal {  
	    public void eat() {  
	        System.out.println("�Թ�ͷ");  
	    }  
	    public void work() {  
	        System.out.println("����");  
	}

}
