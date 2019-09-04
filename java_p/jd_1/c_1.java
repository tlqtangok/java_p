package jd_1;

import jd_0.*;

public class c_1 {

	public int x; 

	public c_1(int x_)
	{
		x = x_;
	}

	public void fun_0()
	{
		System.out.println(x); 	
	}

	public static void main(String [] args) {
		//id_c_0.x = 99; 
		c_0 id_c_0 = new c_0(888,"id_td_nm_0"); 
		c_0 id_c_1 = new c_0(999,"id_td_nm_1"); 

		id_c_0.start(); 
		id_c_1.start(); 
		try {
			id_c_0.join(); 
			id_c_1.join(); 
		} catch (InterruptedException e)
		{
			System.out.println(e.toString());
		}


		//id_c_0.fun_0(); 

		System.out.println("Hello World"); // 打印 Hello World
	}
}

