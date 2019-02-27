package day7;

import java.util.Scanner;

public class Work07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
	        System.out.println("请输入学生成绩：");
	        int cj = sc.nextInt();
	        if(cj<0||cj>100) {
	        	System.out.println("输入错误");
	        }
	        else if(cj>=90&&cj<=100){
	            System.out.println("该学生的成绩是"+cj+"\t成绩优秀");
	        }
	        else if(cj>=80&&cj<90){
	            System.out.println("该学生的成绩是"+cj+"\t成绩良好");
	        }
	        else if(cj>=70&&cj<80){
	            System.out.println("该学生的成绩是"+cj+"\t成绩中等");
	        }
	        else if(cj>=60&&cj<70){
	            System.out.println("该学生的成绩是"+cj+"\t成绩及格");
	        }
	        else{
	            System.out.println("该学生的成绩是"+cj+"\t成绩不及格");
	        }
	}

}
