/*
�Ƚ��������Ӧ��: == != > < <> ...
��ϵ�������Ӧ�ã� & && | || ��.....

*/

//& ��&& ֮�����������Ͷ�·��Ĺ�ϵ
// ��ζ���true���߶���ִ�з������˵����֣�����ʼʱ����flaseʱ�����ᵼ��&&����Ĳ�ִ�С�

class CompareTest{
	public static void main(String[] args){
		 boolean a1=true;
		 a1=false;
		 int num1=10;
		 if (a1 & (num1++>0)){
			 
			 System.out.println("��򣺽����д�磡");
			 
		 }
		 else {
			 
			 System.out.println("���죺�����д�磡");
		 }
		System.out.println(num1);
		
		
		boolean a2=true;
		 a2=false;
		 int num2=10;
		 if (a2 && (num2++>0)){
			 
			 System.out.println("��򣺽����д�磡");
			 
		 }
		 else {
			 
			 System.out.println("���죺�����д�磡");
		 }
		
		System.out.println(num2);
		
	}
	
}