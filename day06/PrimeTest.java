/*

输出10000以内的质数操作
*/

class PrimeTest{
	public static void main(String[] args){
		long start_time=System.currentTimeMillis();
		int count=0;//记录质数的个数
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
		System.out.println("质数的个数为："+count);
		System.out.println("运行的时间为："+(end_time-start_time));
		
		
		long start_time1=System.currentTimeMillis();
		int count1=0;//记录质数的个数
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
		System.out.println("质数的个数为："+count1);
		System.out.println("新方法的运行的时间为："+(end_time1-start_time1));
	}
	
}