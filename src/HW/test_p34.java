package HW;

import java.io.*;

public class test_p34
{

	public static void main(String[] args) throws IOException
	{
	 System.out.println("�n���L�ĴX�����B�z�O?(1~10)");
		 
	 BufferedReader br=new
		 BufferedReader(new InputStreamReader(System.in));
		 
	String str = br.readLine();
	int res = Integer.parseInt(str);
	 
	 for(int i=1;i<=10;i++)
	 {
		 if(i==res)
			 continue;
		 System.out.println("��"+i+"�����B�z");	 
	 }

	}
}

