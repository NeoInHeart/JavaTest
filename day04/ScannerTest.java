/*
����ڼ����ϻ�ȡ����ͬ�ı�����ʹ��Scanner��
���裺
1.������import java.util.Scanner;
2.Scanner���ʵ������Scanner scan = new Scanner(System.in);
3.����Scanner���ṩ����ط�������ȡ��ͬ���͵ı���
*/

//1.����
import java.util.Scanner;
class ScannerTest{
	public static void main(String args[]){
		//2.ʵ����Scanner��
		
		Scanner scan = new Scanner(System.in);
		
		//3.����Scanner���ṩ����ط�������ȡ��ͬ���͵ı���
		System.out.println("�����������С��");
		int age=scan .nextInt();
		System.out.println("���������Ϊ�� "+age);
		
		System.out.println("���������ִ�С��");
		String name=scan.next();
		System.out.println("���������Ϊ�� "+name);
		
		System.out.println("���������ش�С��");
		double weight=scan.nextDouble();
		System.out.println("���������Ϊ�� "+weight);
		
		System.out.println("�Ƿ����⣿ false or true");
		Boolean isOk=scan.nextBoolean();
		System.out.println("�ж������"+isOk);
		
		
	}
}