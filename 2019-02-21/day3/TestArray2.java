package day3;

public class TestArray2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double[] myList = {1.1,2.2,4.4,3.3};
      //��ӡ����Ԫ��
      for(int i = 0;i<myList.length;i++) {
    	  System.out.println(myList[i]);
      }
      //��������Ԫ�ص��ܺ�
      double total = 0;
      for(int i =0;i<myList.length;i++) {
    	  total+=myList[i];
      }
      System.out.println("�ܺ�Ϊ��"+total);
      //�������ֵ
      double max=0;
      for(int i =1;i<myList.length;i++) {
    	  if(myList[i]>max) {
    		  max=myList[i];
    	  }
      }
      System.out.println("���ֵΪ��"+ max);
	}

}
