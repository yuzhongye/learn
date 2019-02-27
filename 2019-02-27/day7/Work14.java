package day7;

public class Work14 {

	public static boolean isyinzi(int num) {
		int sum =0;
		for(int d=num-1;d>=1;d--) {
			if(num%d==0) {
				sum+=d;
			}
		}
		return sum==num;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int a=1;a<=10000;a++) {
        	int b =a ;
        	if(isyinzi(b)) {
        		System.out.println(b);
        	}
        }
	}

}
