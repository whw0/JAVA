package math;
/*
 * java.lang.Math 自动引入 提供的都是静态方法
 * */
public class MathClass {

	public static void main(String[] args) {
		System.out.println("圆周率Π"+Math.PI);
		//三角函数
		System.out.println("90度正弦"+Math.sin(Math.PI/2));
		System.out.println("0度余弦值"+Math.cos(0));
		
		//指数运算
		System.out.println("e的平方值"+Math.exp(2));
		System.out.println("以e为底的2的对数值"+Math.log(2));
		
		System.out.println("4的平方根"+Math.sqrt(4));
		System.out.println("8的立方根"+Math.cbrt(8));
		
		System.out.println("2的5次方"+Math.pow(2, 5));
		
		//比较运算
		System.out.println("4和8最大"+Math.max(4, 8));
		System.out.println("4和8较小的是"+Math.min(4, 8));
		System.out.println("绝对值"+Math.abs(-7));
		
		//四舍五入
		System.out.println(Math.floor(11.1));
		System.out.println(Math.round(11.2));
		
		

	}

}
