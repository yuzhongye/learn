package day7;

import java.util.Scanner;

public class Work07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("������ѧ���ɼ���");
	        int cj = sc.nextInt();
	        if(cj<0||cj>100) {
	        	System.out.println("�������");
	        }
	        else if(cj>=90&&cj<=100){
	            System.out.println("��ѧ���ĳɼ���"+cj+"\t�ɼ�����");
	        }
	        else if(cj>=80&&cj<90){
	            System.out.println("��ѧ���ĳɼ���"+cj+"\t�ɼ�����");
	        }
	        else if(cj>=70&&cj<80){
	            System.out.println("��ѧ���ĳɼ���"+cj+"\t�ɼ��е�");
	        }
	        else if(cj>=60&&cj<70){
	            System.out.println("��ѧ���ĳɼ���"+cj+"\t�ɼ�����");
	        }
	        else{
	            System.out.println("��ѧ���ĳɼ���"+cj+"\t�ɼ�������");
	        }
	}

}
