package day6;

import java.util.Scanner;

public class Work03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //小写字母的ascll值为97-122
		//大写字母的ascll值为65-90
		//小写转换为大写ascll值-32
		System.out.println("输入一个字符：\n");
		Scanner sc = new Scanner(System.in);
		char zimu = sc.next().charAt(0);
		if(zimu>=97&&zimu<=122) {
			System.out.println("小写字母");
			zimu = (char)(zimu-32);
			System.out.println("转换之后的大写字母是：" + zimu);
		}else if(zimu>=65&&zimu<=90) {
			System.out.println("大写字母");
		}else {
			System.out.println("输入的不是字母");
		}
	}

}
