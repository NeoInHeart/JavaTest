/*
�Ӽ��̶��������ȷ�������������ж϶���������͸����ĸ���������Ϊ0ʱ��������
*/

import java.util.Scanner;
class ForWhileTest{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("��д�뽫���������������");
		int nums=scan.nextInt();
		int positive_num=0;
		int negative_num=0;
		while(nums>0){
			System.out.println("�������������");
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
		System.out.println("����������ĸ�����"+positive_num);
		System.out.println("����ĸ����ĸ�����"+negative_num);
	}
	
}