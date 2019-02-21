package day3;

import java.util.Date;

public class SleepDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     try {
    	for(int i=1;i>0;i++) {
    		System.out.println(new Date() + "\n");
    		Thread.sleep(1000);
    	}
     }catch(Exception e) {
    	 System.out.println("Got an rxception");
     }
	}

}
