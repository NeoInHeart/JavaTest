package com.atgugui.java;
/*
 *一、匿名对象的使用
 *二、方法的使用（补充）
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
