/*
 switch �﷨��ϰ��
 ��switch-case�Ĺ�ϵ�У�
 ���ʽ������ֻ�ܴ���6�����ͣ�int\double\byte\short\long\String��jdk7.0��\ö������(jdk5.0)
*/
import java.util.Scanner;
class SwitchTest{
	public static void main(String args[]){
		
		//Switch �����ϰ
		Scanner scan= new Scanner(System.in);
		
		System.out.println("��������Ҫ��֤�����֣�");
		int score =scan.nextInt();
		switch(score){
			case (2):
				System.out.println("һ��ɼ���");
				break;
			case (5):
				System.out.println("���óɼ���");
				break;
			case (6):
				System.out.println("����ɼ���");
				break;
			default:
				System.out.println("��ʱ�޷��жϳɼ���");
		}
		System.out.println("�����ĳɼ�������ɡ�");
	
	}
	
}