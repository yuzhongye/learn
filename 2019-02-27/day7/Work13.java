package day7;

import java.util.Random;

public class Work13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int num;
        Random rd = new Random();
        num = 1+rd.nextInt(Integer.MAX_VALUE);
        System.out.println("ԭ������Ϊ"+num);
        while(num!=1) {
        	System.out.println("������������"+num);
        	if(num%2==0) {
        		num = num/2;
        	}else {
        		num=num*3+1;
        	}
        }
        System.out.println(num);
	}

}
