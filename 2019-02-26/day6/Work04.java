package day6;

import java.util.Scanner;

public class Work04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a;
		double b;
		double c;
    System.out.println("������������");
    Scanner sc = new Scanner(System.in);
    a = sc.nextDouble();
    b = sc.nextDouble();
    c = sc.nextDouble();
    if(a<=0 || b<=0 || c<=0) {
    	System.out.println("����ı���Ϊ����");
    }else if(a+b>c && b+c>a && a+c>b) {
    	System.out.println("�ܹ���������");
    }else {
    	System.out.println("���ܹ���������");
    }
	}

}
