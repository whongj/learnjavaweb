package com.wanghongjie.day01;

import org.junit.Test;

public class enumtest {
	public static void main(String[] args){
		int a ;
		a=grade.C.haha();
		String b = grade.C.a;
		System.out.println(a+b);
	}
	@Test
	public void test2(){
		System.out.println(grade.A.name());
		System.out.println(grade.A.ordinal());
		grade.valueOf(grade.class, "B");//将字符串转换成枚举类型
		System.out.println(grade.values());
		
	}
}
enum grade{
	A("100-90"){
	public int haha(){
		return 100;
	}
	}
	,B("89-80")
	{
	public	int haha(){
		
		return 80;
	}
	}
		,C("79=70"){
		public	int haha(){
				
				return 100;
			}		}
		,D("69-0"){
		public	int haha(){
				
				return 100;
			}};
	
	
	String a;
	private grade(String a){
		this.a=a;
	}
	public abstract int haha();
	
}