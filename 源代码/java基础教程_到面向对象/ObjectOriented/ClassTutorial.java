package ObjectOriented;

/*
 * 面向对象编程设计的特征
 * 封装 继承 多态
 * 
 * 类： 成员变量 成员方法 局部变量
 * 
 * this关键字:
 * 参数重名时或要调用构造方法
 * 
 * 权限修饰符
 *             private protected public
 * 本类                                  可见                     可见                  可见
 * 同包其他类或子类          不可见                 可见                  可见
 * 其他包的类或子类          不可见                 不可见              可见
 * 
 * 构造方法
 * 就是创造类过程中运行的方法，也就是对象初始化方法
 * 若不定义构造方法，则编译器会自动创造一个不带参数的方法
 * 
 * 静态修饰符
 * 由static修饰的变量 常量和方法被称作静态变量，静态常量和静态方法
 * 它们都存放在内存的"静态区"中,这些变量和方法有独立的生存周期。
 * 
 * 主方法
 * 主方法是静态的，所以要直接在主方法中调用其他方法，则该方法必须也是静态的.
 * 主方法没有返回值
 * 主方法的形参为数组。其中args[0]-args[n]分别代表程序的第一个参数到第n个参数，可以使用args.length获取 参数的个数
 * 
 * 对象的特性
 * 对象的创造
 * Test test=new Test(); 类 引用=对象的实体
 * 引用只是存放一个对象的内存地址，并非存放一个对象，严格地说引用和对象是不同地，
 * 但是可以将这种区别忽略，如可以简单地说book是Book类的一个对象，而事实上应该
 * 是book包含Book对象的一个引用
 * 
 * 对象的使用
 * Test test=new Test().Start;
 * 
 * 对象的销毁
 * {
 * Examble e=new Example();
 * }
 * 超出范围自动消亡
 * 
 * {
 * Examble e=new Example();
 * e=null;
 * }
 * */

public class ClassTutorial {

	public static void main(String[] args) {
		TestClassTutorial a=new TestClassTutorial();
	    a.showName("我是风暴");
	    
	    TestClassTutorial_Static b=TestClassTutorial_Static.Start();
	    TestClassTutorial_Static c=TestClassTutorial_Static.Start();
	//静态变量
	    c.inlet();
	    c.inlet();
	    System.out.println("当前水位是"+c.water);
	    c.outlet();
	    System.out.println("当前水位是"+c.water);
	    
	    
	    TestClassTutorial_Static.staticMethod();
	    
	    
	}

}
