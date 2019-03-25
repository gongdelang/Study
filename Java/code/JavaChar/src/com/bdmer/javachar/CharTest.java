package com.bdmer.javachar;

public class CharTest {
	private static final String str0 = "😏";
	private static final String str1 = "hello";
	
	/*主函数入口*/
	public static void main(String args[]) {
		
		System.out.println("------str0=“😏”  ------ ");
		System.out.println(str0.charAt(0));
		System.out.println(Integer.toHexString(str0.codePointAt(1)));
		System.out.println(str0);
		System.out.println("------str1=“hello”  ------ ");
		System.out.println(Integer.toHexString(str1.charAt(0)));
		System.out.println(str1.codePointAt(0));
		System.out.println(str1);
		
		int[] str0CodePoints = str0.codePoints().toArray();
		System.out.println(str0CodePoints);
		
		int[] str1CodePoints = str1.codePoints().toArray();
		System.out.println(str1CodePoints);
		
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append(str0);
		strBuilder.append(str1);
		System.out.println(strBuilder);
		
	}
}
