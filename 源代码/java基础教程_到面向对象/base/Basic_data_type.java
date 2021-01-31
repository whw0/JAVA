package base;
/*基本数据类型
 * 整数类型:
 * byte--1字节
 * short--2字节
 * int--4字节
 * long--8字节 声明时后面需要加L long a=123L; long c=123L+34L;
 * 默认的数据是int
 * 
 * 十进制
 * int a=33;
 * 八进制
 * int b=033;
 * 十六进制
 * int c=0x33;
 * 
 * 浮点数的两种声明类型
 * float--4字节  float a=1.1f;
 * double--8字节
 * 默认类型是double
 * 近似值并不精准
 * 
 * 4.35*100=434.99999
 * 需要使用Math.round方法四舍五入
 * 
 * double a=0.1;
   double b=2.0-1.9;
 * 使用取绝对值方法Math.abs()与最小数1e-6做比较
 * 
 * char类型
 * char采用unicode编码 0-65536
 * 两种相同的方法char a='a'; char b='汉'; char c='2';
 * char a=97;  char b=277721; char c=50;
 * 如何给char变量赋值单引号
 * 转义字符
 * \'
 * \"
 * \\
 * \t
 * \r 回车
 * \n 换行
 *\f 换页
 * 
 * 
 * 布尔类型
 * boolean a=true,b=false;
 * 
 * */


public class Basic_data_type {
	public static void main(String[] args) {
//		double a=4.35*100;
//		System.out.println(a);
//		System.out.println(Math.round(a));
		
		double a=0.1;
		double b=2.0-1.9;
		System.out.println(a);
		System.out.println(b);
		System.out.println(a==b);
		System.out.println(Math.abs(a-b)<1e-6);
		
//		System.out.println("[\\]");
//		System.out.println("[\']");
//		System.out.println("[\"]");
//		System.out.println("[\101]");
//		System.out.println("[\t]");
	}

}
