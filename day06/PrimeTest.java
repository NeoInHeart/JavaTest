/*

���10000���ڵ���������
*/

class PrimeTest{
	public static void main(String[] args){
		long start_time=System.currentTimeMillis();
		int count=0;//��¼�����ĸ���
		for (int i=2;i<=10000;i++){
			
			boolean isFlag=true;
			for (int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					isFlag=false;
					break;		
				}
			}
			if (isFlag){
				System.out.println(i);
				count++;		
			}
		}
		long end_time=System.currentTimeMillis();
		System.out.println("�����ĸ���Ϊ��"+count);
		System.out.println("���е�ʱ��Ϊ��"+(end_time-start_time));
		
		
		long start_time1=System.currentTimeMillis();
		int count1=0;//��¼�����ĸ���
		label:for (int i=2;i<=10000;i++){
			
			boolean isFlag=true;
			for (int j=2;j<=Math.sqrt(i);j++){
				if(i%j==0){
					continue label;		
				}
			}
				count1++;		
		}
		long end_time1=System.currentTimeMillis();
		System.out.println("�����ĸ���Ϊ��"+count1);
		System.out.println("�·��������е�ʱ��Ϊ��"+(end_time1-start_time1));
	}
	
}