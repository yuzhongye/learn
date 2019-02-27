package day7;

import java.util.Random;

public class Work15 {

	public static void panduan(int num) {
		int b = num/100;
		int s = num%100/10;
		int g = num%10;
		if (num%9==0) {
			System.out.println(num + "能被9整除");
			if((b+s+g)%9==0) {
				System.out.println("同时"+num+"的各位数之和也能被9整除");
			}else {
				System.out.println("但是"+num+"的各位数之和不能被9整除");
			}
		}else {
			System.out.println(num + "不能被9整除");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Random rd = new Random();
        int shu = rd.nextInt();
        panduan(shu);
	}

}
