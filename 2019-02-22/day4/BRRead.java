package day4;

import java.io.*;

public class BRRead {

	public static void main(String[] args)  throws IOException {
		// TODO Auto-generated method stub
        char c;
        //ʹ�� System.in ���� BufferedReader
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.println("�����ַ�������'q'���˳�");
        //��ȡ�ַ�
        do {
        	c=(char)br.read();
        	System.out.println(c);
        
        }while(c!='q');
	}

}
