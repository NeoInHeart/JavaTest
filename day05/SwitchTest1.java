/*
��д���򣺻�ȡһ��ѧ���ĳɼ�������ڱ���score�У�����score��ֵ������Ӧ�ĳɼ��ȼ���

score>=90       �ȼ� ��A
70=<score<90    �ȼ��� B
60<=score<70    �ȼ���C
score<60        �ȼ���D
*/

import java.util.Scanner;
class SwitchTest3{
	public static void main(String args[]){
		//����ɼ�
		Scanner scan=new Scanner(System.in);
		
		System.out.println("������ɼ�");
		int score = scan.nextInt();
		char grade;
		if (score>=90){
			grade='A';			
		}else if(score >=70){
			grade='B';
		}else if (score >=60){
			grade='c';
		}else{
			grade='d';	
		}
		
		System.out.println("ѧ���ɼ�Ϊ: "+score+" ��õĵȼ�Ϊ��"+grade);
	}
}