package day6;

import java.util.Scanner;

public class Work6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("����0~99999֮��������");
    int number = sc.nextInt();
    if (number/10000>=1&&number/10000<10) {
    	System.out.println("\nΪ��λ��");
      }
    else if (number/1000>=1&&number/1000<10) {
    	System.out.println("\nΪ��λ��");
      }
    else if (number/100>=1&&number/100<10) {
    	System.out.println("\nΪ��λ��");
      }
    else if (number/10>=1&&number/10<10) {
    	System.out.println("\nΪ��λ��");
      }
    else if (number/1>=1&&number/1<10) {
    	System.out.println("\nΪһλ��");
      }
    else {
    	System.out.println("\n�������");
      }
	}

}
