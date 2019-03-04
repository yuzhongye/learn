package day8;

public class Work19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int r =1;
        int rr =1;
        int rrr =1;
        for(int a=1;a<=12;a++) {
        	if(a<=2) {
        		r=1;
        	}else {
        		r=rr+rrr;
        		rrr=rr;
        		rr=r;
        	}
        	System.out.println(r*2);
        }
	}

}
