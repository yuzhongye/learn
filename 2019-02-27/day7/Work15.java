package day7;

import java.util.Random;

public class Work15 {

	public static void panduan(int num) {
		int b = num/100;
		int s = num%100/10;
		int g = num%10;
		if (num%9==0) {
			System.out.println(num + "�ܱ�9����");
			if((b+s+g)%9==0) {
				System.out.println("ͬʱ"+num+"�ĸ�λ��֮��Ҳ�ܱ�9����");
			}else {
				System.out.println("����"+num+"�ĸ�λ��֮�Ͳ��ܱ�9����");
			}
		}else {
			System.out.println(num + "���ܱ�9����");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random rd = new Random();
        int shu = rd.nextInt();
        panduan(shu);
	}

}
