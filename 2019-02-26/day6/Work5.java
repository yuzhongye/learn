package day6;

import java.util.Scanner;

public class Work5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc = new Scanner(System.in);
     System.out.println("年");
     int year = sc.nextInt();
     System.out.println("月");
     int month = sc.nextInt();
     System.out.println("日");
     int day = sc.nextInt();
     int time = 0;
     switch(month) {
          case 12: time +=30;
          case 11: time +=31;
          case 10: time +=30;
          case 9: time +=31;
          case 8: time +=31;
          case 7: time +=30;
          case 6: time +=31;
          case 5: time +=30;
          case 4: time +=31;
          case 3: 
        	  if((year%4==0&&year%100!=0 || (year%400==0))) {
        		  time +=29;
        	  }else {
        		  time +=28;
        	  }
          case 2: time +=31;
          case 1: time +=day;
     }
     System.out.println("第" + time + "天");
	}

}
