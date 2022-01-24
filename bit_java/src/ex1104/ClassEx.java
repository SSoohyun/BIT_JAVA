package ex1104;

public class ClassEx {

	public static void main(String[] args) {
		String str = new String("abc");
		Class clazz = str.getClass();
		System.out.println(clazz);
		System.out.println(clazz.getName());
		System.out.println(clazz.getSimpleName());
		
		try {
			clazz = Class.forName("java.lang.Object");
			System.out.println(clazz);
			System.out.println(clazz.getName());
			System.out.println(clazz.getSimpleName());
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
