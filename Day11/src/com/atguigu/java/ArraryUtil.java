package com.atguigu.java;
/*
 * 自定义的操作数组的工具类。
 * */
public class ArraryUtil {
	
	//获取int[]型数组的最大值
	public int getMax(int[] arr){
		int max=arr[0];
		for (int i =1;i<arr.length;i++){
			if (max<arr[i]){
				max=arr[i];
			}
		}
		return max;
	}
	
	//获取int[]型数组的最小值
	public int getMin(int[] arr){
		int min=arr[0];
		for (int i =1;i<arr.length;i++){
			if (min>arr[i]){
				min=arr[i];
			}
		}
		return min;
	}
	
	//获取int[]型数组的总和
	public int getSum(int[] arr){
		int sum=arr[0];
		for (int i =1;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum;
	}
	
	//获取int[]型数组的平均值	
	public int getAvg(int[] arr){
		int sum=arr[0];
		for (int i =1;i<arr.length;i++){
			sum+=arr[i];
		}
		return sum/(arr.length);
	}
	
	/**
	 * 数组内的字符匹配并返回位置。
	 * @param arr
	 * @param value
	 * @return
	 */
	
	public int getIndex(int[] arr,int value){
		for (int i =1;i<arr.length;i++){
			if (value==arr[i]){
				return i;
			}
		}
		return -1;
	}
	//排序数组
	public void sort(int arr[]){
		
		System.out.println("数组排序完成。");
	}
	//数组打印
	public void print(int arr[]){
		System.out.print("{");
		for (int i=0;i<arr.length;i++){
			if (i==arr.length-1){
				System.out.print(arr[i]);	
			}
			else{
				System.out.print(arr[i]+",");
			}
		}
		System.out.print("}");
	}
}
