package day7;

public class Work17 {
    public static boolean isshuixianhua(int num) {
    	int b = num/100;
    	int s = num%100/10;
    	int g = num%10;
    	return Math.pow(b, 3)+Math.pow(s, 3)+Math.pow(g, 3)==num?true:false;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        for(int num=100;num<1000;num++) {
        	if(isshuixianhua(num)) {
        		System.out.println(num);
        	}
        }
	}
	
}
