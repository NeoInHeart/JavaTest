/*
2.赋值运算符的使用：= += -= *= /= %=


*/
class SetValueTest{
	
	public static void main(String[] args){
		
		int n1=10;
		int n2,n3;
		n2=n3=20;
		System.out.println(n2);
		System.out.println(n3);
		
		int m1=10;
		m1+=3;
		System.out.println(m1);
		
		System.out.println(++m1);
		
		int m=2;
		int n=3;
		n*=m++;
		System.out.println("m="+m);
		System.out.println("n="+n);
	}
}