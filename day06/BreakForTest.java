/*
���������������Լ������С��������
*/

import java.util.Scanner;

class BreakForTest{
	
	public static void main(String args[]){
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("�������һ������");
		int num1 = scan.nextInt();
		System.out.println("������ڶ�������");
		int num2 = scan.nextInt();
		
		//��ȡ�����������ֵ����Сֵ��
		int max= (num1>num2)? num1:num2;
		int min= (num1<num2)? num1:num2;
		
		//�����Լ��
		
		for( int i=min; i>=1;i--){
			if (num1%i==0&&num2%i==0){
				System.out.println("num1��num2�����Լ��Ϊ��"+i);
				break;
			}
		}
		//����С������
		for( int i=max; i<=num1*num2;i++){
			if (i%num1==0&&i%num2==0){
				System.out.println("num1��num2�����Լ��Ϊ��"+i);
				break;
			}
		}
		
		
		
	}
}