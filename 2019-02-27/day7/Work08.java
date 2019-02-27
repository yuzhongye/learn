package day7;

import java.util.Scanner;

public class Work08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner sc = new Scanner(System.in);
      System.out.println("输入一个整数");
      int a = sc.nextInt();
      StringBuilder b = new StringBuilder(String.valueOf(a));
      System.out.println(b.reverse());
	}

}
