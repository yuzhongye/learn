package day7;

public class Work11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      for (int x=0;x<=20;x++) {
    	  for(int y=0;y<33;y++) {
    		  if (5*x+3*y+(100-x-y)/3==100) {
    			  int z= 100-x-y;
    			  System.out.println("公鸡"+x+"只，母鸡"+y+"只，小鸡"+z+"只");
    		  }
    	  }
      }
	}

}
