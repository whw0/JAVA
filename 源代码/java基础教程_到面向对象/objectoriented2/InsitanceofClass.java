package objectoriented2;


//子类对象 instanceof 父类名称 接口名称

class A{
	
}

class B extends A{
	
}

class C extends B{
	
}

public class InsitanceofClass {

	public static void main(String[] args) {
		C c=new C();
		
		System.out.println(c instanceof A);

	}

}
