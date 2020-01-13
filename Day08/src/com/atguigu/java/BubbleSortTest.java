package com.atguigu.java;

import java.util.Arrays;

public class BubbleSortTest {
	public static void main(String[] args){
		int[] arr=new int[]{22,13,21,2,4,67,88,3};
		for (int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
		//比较两个数组是否相等
		int[] arr1=new int[]{1,2,3,4};
		int[] arr2=new int[]{1,3,2,4};
		
		boolean isEquals=Arrays.equals(arr1, arr2);
		System.out.println(arr1);
		System.out.println(arr2);
		System.out.println(isEquals);
		//arrays包内的方法测试
    	//Arrays.sort()使得数列进行排序|Arrays.toString()对数列进行显示
		Arrays.sort(arr);//底层使用快速排序的方法。 
		System.out.println(Arrays.toString(arr));
		
		//二分查找
		int index=Arrays.binarySearch(arr, 67);
		System.out.println(index);
		
		
		
		
	}

}
