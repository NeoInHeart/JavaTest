/*
从键盘读入个数不确定的整数，并判断读入的正数和负数的个数，输入为0时结束程序。
*/

import java.util.Scanner;
class ForWhileTest{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("请写入将输入的整数个数：");
		int nums=scan.nextInt();
		int positive_num=0;
		int negative_num=0;
		while(nums>0){
			System.out.println("请输入的整数：");
			int num=scan.nextInt();
			if (num==0){
				break;
			}else if(num>0){
				positive_num++;
			}else{
				negative_num++;	
			}
			nums--;
		}
		System.out.println("输入的正数的个数："+positive_num);
		System.out.println("输入的负数的个数："+negative_num);
	}
	
}