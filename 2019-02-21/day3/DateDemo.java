package day3;

import java.text.*;
import java.util.*;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Date dNow = new Date();
       SimpleDateFormat ft = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
       System.out.println("当前时间为：" + ft.format(dNow));
	}

}
