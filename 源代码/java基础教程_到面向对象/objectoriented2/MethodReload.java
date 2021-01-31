package objectoriented2;
/*方法的重载
 * 1.方法名相同，参数个数不同。
 * 2.方法名相同,参数顺序不同
 * 3.方法名相同,参数类型不同
 * 
 * 多态:同一个变量和方法执行处不同结果
 * */

class Animal{
	void move() {
		
	}
}

class Fish extends Animal{
	void move() {
		System.out.println("游泳");
	}
}

class Hawk extends Animal{
	void move() {
		System.out.println("飞翔");
	}
}

public class MethodReload {
//	static int add(int a) {
//		return a;
//	}
//	
//	static int add(int a,int b) {
//		return a+b;
//	}
//	
//	static int add(int b,double a) {//参数类型不同
//		return (int)a+b;
//	}
//	
//	static int add(double b,int a) {
//		return (int)(a+b);
//	}
	
	public static void main(String[] args) {
		Animal Jack=new Fish();
		Jack.move();
	}
	

}
