/*
三元运算符的使用：(条件表达式)？ 表达式1：表达式2；

说明：
1.条件表达式的结果为boolean类型
2.如果表达式为true，则执行表达式1；否则，执行表达式2；
*/
class SanYuanTest{
	public static void main(String[] args){
		
		//获取两个数的最大值
		int m=10;
		int n=5;
		double max=(m>n)? m:(n+0.0);
		System.out.println(max);
	}
	
}