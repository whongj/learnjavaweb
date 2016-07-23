package reflact;

public class Demo1 {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Class clazz=Class.forName("/day01/src/reflact/Demo1.java");
		System.out.println(clazz);
	}
}
