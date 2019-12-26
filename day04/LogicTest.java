/*
逻辑运算符测试：& && | || ！ so on

逻辑运算符只适用于boolean方法的运算方式，输出其中的结果。
*/
class logic {
	public static void main(String args[]){
		
		boolean b1 = false;
		boolean b2=true;
		
		System.out.println("b1&b2 :"+(b1&b2));
		System.out.println("b1&&b2 :"+(b1&&b2));
		System.out.println("b1|b2 :"+(b1|b2));
		System.out.println("b1||b2 :"+(b1||b2));
		System.out.println("!b2 :"+(!b2));
		System.out.println("b1^b2 :"+(b1^b2));
		
		//短路与&&的操作特点
		boolean a1 = false;
		boolean a2 = true;
		int num=1;
		if (a2 && (num++>2)){
			
			System.out.println("num is :"+num);
		}
		else{
			num--;
			System.out.println("num is :"+num);
		}
		
	}
	
	
}
