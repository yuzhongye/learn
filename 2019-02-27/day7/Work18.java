package day7;

import java.util.Random;

public class Work18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int X=0;
		int Y=0;
		int Z=0;
		//for(int j=0;j>0;j++) {
		//if((X*100+Y*10+Z)+(Y*100+Z*10+Z)==532) {
         //System.out.println("X="+X+"Y="+Y+"Z="+Z);
         //break;
        //}else {
        	//for(int i=0;i>0;i++) {
     		   //Random rd = new Random();
                 //X = rd.nextInt(10);
                 //Y = rd.nextInt(10);
                 //Z = rd.nextInt(10);
              //}
        //}
        //}
		while((X*100+Y*10+Z)+(Y*100+Z*10+Z)!=532) {
			Random rd = new Random();
            X = rd.nextInt(10);
            Y = rd.nextInt(10);
            Z = rd.nextInt(10);
		}
		System.out.println("X="+X+"Y="+Y+"Z="+Z);
	}

}
