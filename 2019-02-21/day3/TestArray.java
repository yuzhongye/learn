package day3;

public class TestArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //�����С
		int size = 6;
		//��������
		double[] myList = new double[size];
		myList[0] = 765;
		myList[1] = 2.52;
		myList[2] = 3.48000154;
		myList[3] = 425;
		myList[4] = 1.;
		myList[5] = 44;
		//�ܺ�
		double total = 0;
		for (int i=0;i<size;i++) {
			total+=myList[i];
		}
		System.out.println("�ܺ�Ϊ��" + total);
	}

}
