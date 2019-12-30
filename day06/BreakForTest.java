/*
计算两个数的最大公约数和最小公倍数。
*/

import java.util.Scanner;

class BreakForTest{
	
	public static void main(String args[]){
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("请输入第一组数：");
		int num1 = scan.nextInt();
		System.out.println("请输入第二组数：");
		int num2 = scan.nextInt();
		
		//获取两整数的最大值和最小值；
		int max= (num1>num2)? num1:num2;
		int min= (num1<num2)? num1:num2;
		
		//求最大公约数
		
		for( int i=min; i>=1;i--){
			if (num1%i==0&&num2%i==0){
				System.out.println("num1和num2的最大公约数为："+i);
				break;
			}
		}
		//求最小公倍数
		for( int i=max; i<=num1*num2;i++){
			if (i%num1==0&&i%num2==0){
				System.out.println("num1和num2的最大公约数为："+i);
				break;
			}
		}
		
		
		
	}
}