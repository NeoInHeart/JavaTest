/*
如何在键盘上获取到不同的变量，使用Scanner类
步骤：
1.导包：import java.util.Scanner;
2.Scanner类的实例化：Scanner scan = new Scanner(System.in);
3.调用Scanner类提供的相关方法，获取不同类型的变量
*/

//1.导包
import java.util.Scanner;
class ScannerTest{
	public static void main(String args[]){
		//2.实例化Scanner类
		
		Scanner scan = new Scanner(System.in);
		
		//3.调用Scanner类提供的相关方法，获取不同类型的变量
		System.out.println("请输入年龄大小：");
		int age=scan .nextInt();
		System.out.println("输入的年龄为： "+age);
		
		System.out.println("请输入名字大小：");
		String name=scan.next();
		System.out.println("输入的名字为： "+name);
		
		System.out.println("请输入体重大小：");
		double weight=scan.nextDouble();
		System.out.println("输入的体重为： "+weight);
		
		System.out.println("是否中意？ false or true");
		Boolean isOk=scan.nextBoolean();
		System.out.println("判定结果："+isOk);
		
		
	}
}