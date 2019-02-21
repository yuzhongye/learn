package day3;

import java.util.*;

public class DiffDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    	long start = System.currentTimeMillis();
    	System.out.println(new Date()+"\n");
    	Thread.sleep(1000*3);
    	System.out.println(new Date()+"\n");
    	long end = System.currentTimeMillis();
    	long diff = end-start;
    	System.out.println("Difference is :"+diff);
     }catch (Exception e) {
		// TODO: handle exception
	}
	}

}
