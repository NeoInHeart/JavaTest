package com.atgugui.java;
/*
 *一、匿名对象的使用
 *匿名对象只能对外时调用一次，不能重复的调用，因为只存在内存内没有参数名。
 *二、方法的使用（补充）
 *1.方法内可以调用当前类属性
 *2.方法内可以调用当前类方法
 *   特别的方法a可以调用方法a:递归方法。
 *3.方法内不能再定义方法。
 * */
public class PhoneTest {
	public static void main(String[] args){
		PhoneFactory pf=new PhoneFactory();
		Phone p1=new Phone();
		p1.name="iphone 11pro";
		p1.price=2345;
		pf.UsePhone(p1);
		
	}

}

class PhoneFactory{
	public void  UsePhone(Phone phone){
		phone.ShowMsm();
		phone.call();
		phone.SentSms();
	}
	
	
}

class Phone{
	String name;
	int price;
	
	public void call(){
		System.out.println("可以使用手机通话。");
	}
	
	public void SentSms(){
		System.out.println("可以及时发送短信。");
	}
	
	public void ShowMsm(){
		System.out.println("name: "+name+" price: "+price);
	}
	
}
