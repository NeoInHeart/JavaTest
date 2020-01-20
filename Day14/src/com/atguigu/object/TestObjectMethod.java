/**
 * 
 */
package com.atguigu.object;

/**
 * @author liang  qiang
 * @version 2020年1月19日 下午3:04:15
 */
/*
 * object的方法：
 * (1) class getClass() ,返回次Object的运行时类
 * (2)
 * Class：类型
 * String toString()方法//  建议子类对此类方法进行重写。
 * 
 * 自行生成equals()方法，那么可以自己重写，自己重写方法时要遵循几个原则。
 * (1)自反性： x.equals(x)自己与自己一定是相同的。
 * (2)对称性：x.equals(y)是true ,那么y.equals(x)也应该是true
 * (3)传递性：x.equals(y)是true,y.equals(z)是true
 * (4)一致性：如果参与的equals比较的属性值没有修改，那么前后两次的调用的应该是相同的 x.equals(y)是true
 * (5)对于任何非空值引用值x. x.equals(null)应该返回的是false;
 * 
 * 在开发中需要重写的其他方法还有哪些？
 */
public class TestObjectMethod {
	public static void main(String[] args) {
			Object obj="String";
			System.out.println(obj.getClass());
			
			TestObjectMethod t=new TestObjectMethod();
			
			System.out.println(t);
			System.out.println(t.toString());//两者的打印的方式是相同的。
	}
} 

class Person{
	private String name;
	private int age;
	private int score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Person(String name, int age, int score) {
		super();
		this.name = name;
		this.age = age;
		this.score = score;
	}
	
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + age;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + score;
		return result;
	}
	@Override//重构的方法把equals方法进行重写，IDE编译器自行生成的。
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (age != other.age)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (score != other.score)
			return false;
		return true;
	}
}
