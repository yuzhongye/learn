package day6;

import java.util.Scanner;

public class Work2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("2次方系数");
        int a = sc.nextInt();
        System.out.println("1次方系数");
        int b = sc.nextInt();
        System.out.println("常数项");
        int c = sc.nextInt();
        if((b^2-4*a*c)<0) {
        	System.out.println("方程无解");
        	return;
        }else {
        	double x1 = (-b + Math.sqrt(b^2-4*a*c))/2*a;
        	double x2 = (-b - Math.sqrt(b^2-4*a*c))/2*a;
        	System.out.println("方程的解为：\nx1" + x1 + "\nx2=" + x2);
        }
        
	}

}
