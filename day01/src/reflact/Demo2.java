package reflact;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class Demo2 {
	
	
	
	@Test
	public void test1() throws Exception{
		Class clazz=Class.forName("reflact.Person");//加载类
		Constructor c=clazz.getConstructor(null);//获取类的无参构造函数
		Person p = (Person)c.newInstance(null);//利用获取到的构造函数创建对象
		System.out.println(p.name);
	}
	
	
	
	@Test
	public void test2() throws Exception{
		Class clazz = Class.forName("reflact.Person");
		Constructor c= clazz.getConstructor(String.class);
		c.setAccessible(true);
		Person p = (Person)c.newInstance("xxxx");
		
	}
	//如果构造函数是私有的，可以采用暴力破解
	@Test
	public void test4() throws Exception{
		Class clazz =Class.forName("reflact.Person");
		Constructor c = clazz.getConstructor(List.class);
		c.setAccessible(true);//暴力反射
		Person p =(Person)c.newInstance(new ArrayList());
		System.out.println(p.name);
		
	}
	
	@Test
	public void test5() throws Exception{
		Class clazz = Class.forName("reflact.Person");
		Person p = (Person)clazz.newInstance();//构建对象的第二种方法
	}
}
