package com.atguigu.java;

import org.omg.CORBA.PUBLIC_MEMBER;

public class YangHuiTest {
	public static void main(String[] args){
	
		//二维数组初始化
		int[] arr=new int[10];
		
		//给所有数组进行赋值
		for (int i=0;i<arr.length;i++){
			arr[i]=(int)(Math.random()*30);//在[0,30)内进行取整操作。
		}
		//输出数组中存入的值
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]);
			System.out.print('\t');
		}
		//
	}

}
