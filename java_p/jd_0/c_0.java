package jd_0;

import java.util.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class c_0 extends Thread {

	public int x; 
	public Thread id_td; 
	String id_td_name; 

	public void run()
	{
		System.out.println("- in thread " + id_td_name + " ...");

		fun_0(); 

		try {
			for (int i=0;i<4;i++)
			{
				System.out.println(id_td_name + " " + Integer.toString(i));
				Thread.sleep(100); 
			}	
		} catch (Exception e){

		}

	}
	public void start()
	{
		if (id_td == null) 
		{
			id_td = new Thread(this, id_td_name); 	
			id_td.start(); 
		}
	}

	public c_0(int x_, String id_td_name_)
	{
		x = x_;
		id_td_name = id_td_name_; 
	}

	public static String run_cmd(String shellString) {  

		StringBuffer sb = new StringBuffer();
		try {  
			Process process = Runtime.getRuntime().exec(shellString);  


			BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
			int exitValue = process.waitFor();

			String line;

			while((line = reader.readLine())!= null){
				//System.out.println(line);
				sb.append(line+"\n"); 
			}

			if (0 != exitValue) {  
				System.out.println("- error! call shell failed. error code is :" + exitValue);  
			}  
		} catch (Throwable e) {  
			System.out.println("call shell failed. " + e);  
		}  
		return sb.toString(); 
	}

	public void fun_0()
	{
		System.out.println(x); 	
		int[] id_int = {3,2,1};

		try {
			System.out.println("- sleep 1s"); 
			Thread.sleep(1*1000); 
		}
		catch (Exception e){
			System.out.println("- error" + e.toString()); 
		}
		print_array(id_int); 

		String fc_cmd = run_cmd(" ls -al "); 
		//String fc_cmd = run_cmd(" find . -name '*' "); 
		System.out.println(fc_cmd); 
	}

	public void print_array(int[] id_int)
	{
		for (int e_ : id_int)
		{
			System.out.println(e_);
		}
	}


	public static void main(String [] args) {
		//id_c_0.x = 99; 
		c_0 id_c_0 = new c_0(888, "id_td_nm_0"); 
		id_c_0.start(); 


		//id_c_0.fun_0(); 

		System.out.println("Hello World"); // 打印 Hello World
	}
}

