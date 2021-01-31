package objectoriented2;
/*
 * 每一个类都会继承Object
 * 
 * 三种常用方法
 * getClass()返回对象执行时的Class实例
 * 
 * toString()若不重写 默认返回 包路径@hash值
 * 
 * equals()比较两个对象是否相等 默认的equals()比较的是两个对象的地址
 * 
 * 向上转型与向下转型
 * */
public class ObjectClass {
	public static void main(String[] args) {
//		Object demo=new Demo();
//		System.out.println(demo.getClass());
//		Object arr[]=new Object[4];
//		arr[0]=new Object();
//		arr[1]=new String("字符串");
//		arr[2]=new Integer(10);
//		arr[3]=new Demo();
//		for(Object obj:arr) {
//			System.out.println(obj.toString());//若把toString删掉则默认使用toString
//		}
		
	    Person p1=new Person("小明","123");
	    Person p2=new Person("小明","123");
	    System.out.println(p1.equals(p2)); 
		
	}
}
