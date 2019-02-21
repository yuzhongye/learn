package day3;

public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double[] myList = {1.1,2.2,4.4,3.3};
      //打印所有元素
      for(int i = 0;i<myList.length;i++) {
    	  System.out.println(myList[i]);
      }
      //计算所有元素的总和
      double total = 0;
      for(int i =0;i<myList.length;i++) {
    	  total+=myList[i];
      }
      System.out.println("总和为："+total);
      //计算最大值
      double max=0;
      for(int i =1;i<myList.length;i++) {
    	  if(myList[i]>max) {
    		  max=myList[i];
    	  }
      }
      System.out.println("最大值为："+ max);
	}

}
