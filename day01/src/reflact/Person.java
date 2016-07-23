package reflact;

import java.util.List;

public class Person {
	String name;
	public Person(){
		System.out.println("person");
		name="创建成功";
	}
	private Person(String name){
		System.out.println("person name");
	}
	private Person(List list){
		System.out.println("person list");
	}
	
	/*public void aa1(){
		System.out.println("aa1");
	}
	public void aa1(String name,int password){
		System.out.println(name+":"+password);
	}
	public Class[] aa1(String name,int[] password){
		return new Class[](String.class);
		
	}
	public void aa1(){
		System.out.println("aa1");
	}
	public void aa1(){
		System.out.println("aa1");
	}
	*/
}
