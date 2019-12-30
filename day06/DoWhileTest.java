/*
do-while循环结构
do{
	1.
	2.
	..
}while();
*/

class DoWhileTest{
	public static void main(String[] args){
		int i=1;
		int sum=0;//记录总和
		int count=0;//记录个数
		do{
			if (i%2!=0){
				System.out.println(i);
				sum+=i;
				count++;
			}
			i++;
		}while(i<=100);
		System.out.println("总数为"+sum);
		System.out.println("个数为"+count);

		int num1= 12;
		while(num1>=10){
			System.out.println("hello while:"+num1);
			num1--;
		}
		
		int num2 =12;
		do{
			System.out.println("hello do-while");
			num2--;
		}while(num2>10);
	}
	
}