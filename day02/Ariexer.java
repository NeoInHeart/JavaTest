/*
���������ֵ�İٷ�λ��ʮ��λ������λ��ֵ

*/

class Ariexer{
	public static void main(String[] args){
		/*
		int num=123;
		int num100=num/100;
		int num10=(num-num100*100)/10;
		int  num1=(num-num100*100-num10*10);
		*/
		
		
		int num=123;
		int num100=num/100;
		int num10=(num%110)/10;
		int  num1=(num%10);
		
		System.out.println("�ٷ�λ��"+num100);
		System.out.println("ʮ��λ��"+num10);
		System.out.println("����λ��"+num1);
	}
	
}