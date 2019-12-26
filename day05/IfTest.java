/*
分支结构：
1.使用If-else的分支结构，完成程序的编写。
结构一
if(some condition){
	
	执行语句1；
}
结构二
if(some condition){
	
	执行语句1；
}else{
	
	执行语句2；
}
使用Scanner类方法来获取小明的考试成绩。
*/
import java.util.Scanner;
class IfTest{
	public static void main(String args[]){
		//实例化
		Scanner s =new Scanner(System.in);
		
		System.out.println("请输入小明的Java成绩：");
		int score=s.nextInt();
		System.out.println("小明的java成绩为："+score);
		
		//结构一
		/*
		int heartBeats =120;
		if (heartBeats<60 | heartBeats>=120){
			
			System.out.println("请您进行详细检查！");
			
		}else{
			
			System.out.println("您的身体健康良！");
		}
		*/
		
		
	    //结构二
		
		if (score<=60){
			
			System.out.println("啥子都没得呀！");
			
		}else if(60<score && score<=80){
			
			System.out.println("奖励一台iPhone 11");
			
		}else{
			
			System.out.println("跑车一台");
		}
	}
	
}