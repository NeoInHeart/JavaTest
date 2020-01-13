package com.atguigu.java;

public class ArrayExer1 {
	public static void main(String[] args){
		int[] arr1,arr2;
		arr1=new int[]{1,2,3,4,5};
		for (int i=0;i<arr1.length;i++){
			System.out.print(arr1[i]+"\t");
		}
		System.out.println("修改后的数组值");
		arr2=arr1;
		for (int j=0;j<arr2.length;j++){
			arr2[j]=j+3;
		}
		//查看arr1和arr2两者的地址。
		System.out.println(arr1);
		System.out.println(arr2);
		for (int j=0;j<arr1.length;j++){
			System.out.print(arr1[j]+"\t");
		}
		
		
	}

}
