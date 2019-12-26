/*
编写程序：获取一个学生的成绩，存放在变量score中，根据score的值输出其对应的成绩等级：

score>=90       等级 ：A
70=<score<90    等级： B
60<=score<70    等级：C
score<60        等级：D
*/

import java.util.Scanner;
class SwitchTest3{
	public static void main(String args[]){
		//输入成绩
		Scanner scan=new Scanner(System.in);
		
		System.out.println("请输入成绩");
		int score = scan.nextInt();
		char grade;
		if (score>=90){
			grade='A';			
		}else if(score >=70){
			grade='B';
		}else if (score >=60){
			grade='c';
		}else{
			grade='d';	
		}
		
		System.out.println("学生成绩为: "+score+" 获得的等级为："+grade);
	}
}