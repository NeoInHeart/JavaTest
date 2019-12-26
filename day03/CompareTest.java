/*
比较运算符的应用: == != > < <> ...
关系运算符的应用： & && | || ！.....

*/

//& 和&& 之间的区别是与和短路与的关系
// 如何都是true两者都会执行符号两端的数字，若开始时都是flase时，将会导致&&后面的不执行。

class CompareTest{
	public static void main(String[] args){
		 boolean a1=true;
		 a1=false;
		 int num1=10;
		 if (a1 & (num1++>0)){
			 
			 System.out.println("天津：今天有大风！");
			 
		 }
		 else {
			 
			 System.out.println("重庆：今天有大风！");
		 }
		System.out.println(num1);
		
		
		boolean a2=true;
		 a2=false;
		 int num2=10;
		 if (a2 && (num2++>0)){
			 
			 System.out.println("天津：今天有大风！");
			 
		 }
		 else {
			 
			 System.out.println("重庆：今天有大风！");
		 }
		
		System.out.println(num2);
		
	}
	
}