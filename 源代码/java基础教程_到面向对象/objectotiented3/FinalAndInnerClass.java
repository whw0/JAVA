package objectotiented3;
/*
 * 定义常量:final static int i=3;
 * 定义final类: final class 它们不能被继承
 * 定义final方法: 它们不能被重写
 * 
 * 内部类:
 * 成员内部类 局部内部类 静态内部类 匿名内部类
 * */
public class FinalAndInnerClass {
	innerClass in =new innerClass();
	
	
	
	class innerClass{//成员内部类
		int y=0;
		public innerClass() {
			System.out.println("构造内部方法");
		}
		
		public void inf() {
			System.out.println("内部类方法");
		}
	}
	
	public static void main(String[] args) {
		FinalAndInnerClass  d=new FinalAndInnerClass ();
		FinalAndInnerClass.innerClass in=d.new innerClass();
		d.in.inf();
	}
}

class NewClass extends FinalAndInnerClass.innerClass{
	public NewClass(FinalAndInnerClass d) {
		d.super();
	}
}
