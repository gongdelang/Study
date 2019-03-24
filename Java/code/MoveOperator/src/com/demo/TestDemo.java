package com.demo;

public class TestDemo {
	private static   final int num = -10;
	private static  int forNum = num;
	
	/*主函数入口*/
	public static void main(String[] args) {
		System.out.println("-------- num的二进制  --------" );
		System.out.println(Integer.toBinaryString(num));
		
		System.out.println("-------- 带符号右移32位  --------" );
		System.out.println("十进制" + (num >> 32));
		System.out.println("二进制" + Integer.toBinaryString(num >> 32));
		
		for(int i= 0 ; i< 32; ++i) {
			forNum = forNum >> 1;
			System.out.println("二进制" + Integer.toBinaryString(forNum));
		}
		
		System.out.println("-------- for循环带符号右移32  --------" );
		System.out.println("十进制" + forNum);
		System.out.println("二进制" + Integer.toBinaryString(forNum));
		
		System.out.println("-------- 无符号右移1位  --------" );
		System.out.println("十进制" + (num >>> 1));
		System.out.println("二进制" + Integer.toBinaryString(num >>> 1));
		
		
		System.out.println("-------- num的二进制  --------" );
		System.out.println(Integer.toBinaryString(num));
		
		System.out.println("-------- 左移1位  --------" );
		System.out.println("十进制" + (num << 1));
		System.out.println("二进制" + Integer.toBinaryString(num << 1));
		
	}
}
