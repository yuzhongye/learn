package day6;

import java.util.Scanner;

public class Work03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //Сд��ĸ��ascllֵΪ97-122
		//��д��ĸ��ascllֵΪ65-90
		//Сдת��Ϊ��дascllֵ-32
		System.out.println("����һ���ַ���\n");
		Scanner sc = new Scanner(System.in);
		char zimu = sc.next().charAt(0);
		if(zimu>=97&&zimu<=122) {
			System.out.println("Сд��ĸ");
			zimu = (char)(zimu-32);
			System.out.println("ת��֮��Ĵ�д��ĸ�ǣ�" + zimu);
		}else if(zimu>=65&&zimu<=90) {
			System.out.println("��д��ĸ");
		}else {
			System.out.println("����Ĳ�����ĸ");
		}
	}

}
