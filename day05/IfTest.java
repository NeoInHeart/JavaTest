/*
��֧�ṹ��
1.ʹ��If-else�ķ�֧�ṹ����ɳ���ı�д��
�ṹһ
if(some condition){
	
	ִ�����1��
}
�ṹ��
if(some condition){
	
	ִ�����1��
}else{
	
	ִ�����2��
}
ʹ��Scanner�෽������ȡС���Ŀ��Գɼ���
*/
import java.util.Scanner;
class IfTest{
	public static void main(String args[]){
		//ʵ����
		Scanner s =new Scanner(System.in);
		
		System.out.println("������С����Java�ɼ���");
		int score=s.nextInt();
		System.out.println("С����java�ɼ�Ϊ��"+score);
		
		//�ṹһ
		/*
		int heartBeats =120;
		if (heartBeats<60 | heartBeats>=120){
			
			System.out.println("����������ϸ��飡");
			
		}else{
			
			System.out.println("�������彡������");
		}
		*/
		
		
	    //�ṹ��
		
		if (score<=60){
			
			System.out.println("ɶ�Ӷ�û��ѽ��");
			
		}else if(60<score && score<=80){
			
			System.out.println("����һ̨iPhone 11");
			
		}else{
			
			System.out.println("�ܳ�һ̨");
		}
	}
	
}