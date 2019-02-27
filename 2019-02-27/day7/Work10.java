package day7;

public class Work10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a = 200;
      while (a<=500) {
    	  boolean b = true;
    	  for(int c=2;c<a;c++) {
    		  if(a%c==0) {
    			  b = false;
    			  break;
    		  }
    	  }
    	  if(b) {
    		  System.out.println(a);
    	  }
    	  a++;
      }
	}

}
