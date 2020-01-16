package com.atguigu.java;
/*
 * CMUtility基础的工具类。
 * 将不同的功能封装为方法，可直接调用方法使用它的功能，而无需考虑具体的功能实现细节。
 */
import java.util.*;
public class CMUtility {
	private static Scanner scanner=new Scanner(System.in);
	/*
	 * 用于界面菜单的选择。该方法读取键盘，如果用户输入’1‘-’5‘中的任意字符，则方法返回，返回值为用户键入字符。
	 * */
	public static char readMenuSelection(){
		char c=' ';
		boolean isFlag=true;
		while(isFlag){
			String str =readKeyBoard(1,false);
			c=str.charAt(0);
			if(c!='1'&& c!='2'&& c!='3'
					&& c!='4' && c!='5'){				
				System.out.println("您的选择有误，请重新输入：");
			}
			else break;
		}
		return c;	
	}
	
	/**
	 * 键盘上读取一个字符，并将其作为方法的返回值
	 * @return
	 */
	public static char readChar(){
		String str=readKeyBoard(1,false);
		return str.charAt(0);		
	}
	
	/**
	 * 键盘上读取一个字符，并将其作为方法的返回值,
	 * 若用户不输入字符而直接回车，方法将以defaultValue 作为返回值
	 * @return
	 */
	public static char readChar(char defaultValue){
		String str=readKeyBoard(1,true);
		return (str.length()==0)? defaultValue : str.charAt(0);		
	}
	
	
	/**
	 * 键盘上读取不超过2个字符，并将其作为方法的返回值
	 * @return
	 */
	public static int readInt(){
		int n;
		while(true){
			String str=readKeyBoard(2,false);
			try{	
				n=Integer.parseInt(str);
				break;
				}catch(NumberFormatException e){
				System.out.println("数字输入错误，请重新输入：");
				}										
		}	
		return n;		
	}
	
	/**
	 * 键盘上读取一个字符，并将其作为方法的返回值,
	 * 若用户不输入字符而直接回车，方法将以defaultValue 作为返回值
	 * @return
	 */
	public static int readInt(int defaultValue){
		int n;
		String str;
		while(true){
			str=readKeyBoard(2,false);
			try{
				n=Integer.parseInt(str);
				break;
				}catch(NumberFormatException e){	
				System.out.println("数字输入错误，请重新输入：");
				}										
		}	
		return str.equals("")?defaultValue:n;			
	}
	
	/**
	 * 在键盘读入长度不超过limit的字符串，并将其最为方法的返回值。
	 * @param limit
	 * @return
	 */
	public static String readString(int limit){
		return readKeyBoard(limit,false);
	}
	
	/**
	 * 在键盘读入长度不超过limit的字符串，并将其最为方法的返回值。
	 * 用户不输入时，方法将以默认值defaultValue作为返回值。
	 * @param limit
	 * @param defaultValue
	 * @return
	 */
	public static String readString(int limit,String defaultValue){
		String str= readKeyBoard(limit,false);
		return str.equals("")?defaultValue:str;
	}
	
	
	/**
	 * 确认选择的输入，该方法的从键盘输入'Y'或者'N'，并将其作为返回值。
	 * @return
	 */
	public static char readConfirmSelection(){
		char c;
		while(true){
			String str=readKeyBoard(1,false).toUpperCase();
			c=str.charAt(0);
			if (c=='Y'||c=='N'){
				break;
			}else{
				System.out.println("选择错误，请重新输入：");
			}
		}
		return c;
	}
			
	
	/**
     * 读取键盘内输入的信息
	 * @param limit
	 * @param blankReturn
	 * @return
	 */	
	private static String readKeyBoard(int limit,boolean blankReturn){		
		String line="";
		while(scanner.hasNextLine()){
			line =scanner.nextLine();
			if (line.length()==0){
				if (blankReturn) 
					return line;
				else 
					continue;				
			}
			if(line.length()<1 || line.length() > limit){
				System.out.println("输入长度（不大于"+limit+")错误，重新输入：");
				continue;
			}
			break;
		}
		return line;
	}
}
