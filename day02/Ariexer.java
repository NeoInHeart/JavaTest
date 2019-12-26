/*
输出给定数值的百分位、十分位、个分位的值

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
		
		System.out.println("百分位："+num100);
		System.out.println("十分位："+num10);
		System.out.println("个分位："+num1);
	}
	
}