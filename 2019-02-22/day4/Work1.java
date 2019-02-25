package day4;

import java.util.Scanner;

//对给定的四个整数从大到小的顺序排列
public class Work1 {
	//输入四个数放在数组中
    static int number = 4;
    static int[] t1 = new int [number];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Work1 fil = new Work1();
       fil.shunxu();
	}
     public void shunxu() {
    	 System.out.println("请输入四个数");
    	 Scanner in_t1 = new Scanner(System.in);
    	 for(int i =0;i<number;i++) {
    		 t1[i] = in_t1.nextInt();
    	 }
    	 for(int i =0;i<t1.length;i++) {
    		 int pos = i;
    		 for (int j =i+1;j<t1.length;j++) {
    			 if(t1[pos]>t1[j])
    				 pos=j;
    		 }
    		 if(pos !=i) {
    			 t1[i] = t1[i]+t1[pos];
    			 t1[pos] = t1[i]-t1[pos];
    			 t1[i] = t1[i]-t1[pos];
    		 }
    		 for(int k=t1.length-1;k>=0;k--) {
    			 //if(k==0)
    			 System.out.print(t1[k] + " ");
    		 }
    	 }
     }
}
