/*
 switch 语法练习。
 在switch-case的关系中，
 表达式的类型只能存在6中类型：int\double\byte\short\long\String（jdk7.0）\枚举类型(jdk5.0)
*/
import java.util.Scanner;
class SwitchTest{
	public static void main(String args[]){
		
		//Switch 语句练习
		Scanner scan= new Scanner(System.in);
		
		System.out.println("请输入需要验证的数字：");
		int score =scan.nextInt();
		switch(score){
			case (2):
				System.out.println("一般成绩！");
				break;
			case (5):
				System.out.println("良好成绩！");
				break;
			case (6):
				System.out.println("优秀成绩！");
				break;
			default:
				System.out.println("暂时无法判断成绩！");
		}
		System.out.println("对您的成绩评判完成。");
	
	}
	
}