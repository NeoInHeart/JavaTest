package com.atguigu.java;
import java.util.Scanner;
public class ArraryTest {
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		//1.一维数组的声明与初始化
		int[] arr1 =new int[]{1,2,3};
		//2.二维数组的声明与初始化
		int[][] arr2=new int[2][3];
		
		for (int i=0;i<2;i++){
			for (int j=0;j<3;j++){
				System.out.println("请输入数值为： ");
				arr2[i][j]=scan.nextInt();
				System.out.print("显示的数值为： ");
				System.out.println(arr2[i][j]);
			}
		}
		
		for (int i=0;i<arr2.length;i++){
			for (int j=0;j<arr2[i].length;j++){
				System.out.println(arr2[i][j]);
			}
		}
		
		int[][] arr4=new int[3][];
		//外部元素：
		System.out.println(arr4[0]);
		System.out.println(arr4[1]);
		System.out.println(arr4[2]);
		//内部元素：
		System.out.println(arr4[0][0]);	
	}

}
