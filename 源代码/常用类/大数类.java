package 常用类;

import java.math.*;


/*
 * java中基础数据类型能存储的最大二进制数就是2的63次方-1
 * 对应的十进制数是9223372036854775807,也就是说只要运算过程中会
 * 超过这个数，就会造成数据溢出，从而造成错误
 * 
 * 而java.math.*包中提供了大数类，其理论上可以存储无限位的大数，只要内存足够的话。
大数类又分为整数和浮点数.即BigInteger and BigDecimal
大数类的对象不能直接进行运算，需要调用类中相应的方法,并且方法的参数必须和调用的类相同,BigInteger不能调用BigDecimal, 不能作为其方法参数, 即整数和浮点数不能混合运算.
这里举例了一些常用的方法，不需要背会，需要用的时候查java API就行了。
 * */
public class 大数类 {

	public static void main(String[] args) {
		BigInteger a;//或者使用构造器 BigInteger a=new BigInteger("123456789101112131415");
		BigDecimal b;
		a = BigInteger.valueOf(123456789101112L); //大于int范围的要加L
		b = BigDecimal.valueOf(123456.12341235); // 超出的小数位数会自动舍弃 
        
		BigInteger c,d;
		d=BigInteger.valueOf(987654321);
		c=a.add(d);//大数的加法
		System.out.println(c);
		
		
		c=a.subtract(d);//减法
		System.out.println(c);
		
		c=a.multiply(d);
		System.out.println(c);
		
		c=a.divide(d);
		System.out.println(c);
		
		c=a.mod(d);
		System.out.println(c);
		
		c = a.gcd(d);//最大公约数
		System.out.println(d);
		
		c = a.max(d); //a,b中的最大值
		d = a.min(d); //a,b中的最小值
		
		int e;
		e=a.compareTo(d);//返回1，0 -1
		
		//进制转换 把111110变为10进制赋值给a
		BigInteger w=new BigInteger("1111110",2);
		System.out.println(a.toString(16));//把a转化为16进制的字符串输出
		
		
		b.toBigInteger(); // 把BigDecimal转为BigInteger
	    //a.toBigDecimal(); // 把BigInteger转为BigDecimal
	  
	    //舍入模式
		//divide(BigDecimal divisor, int scale, RoundingMode roundingMode) 返回一个
		//BigDecimal ，其值为 (this / divisor) ，其小数位数为scale。
	
	    //	a = a.setScale(4,BigDecimal.ROUND_HALF_UP);//四舍五入保留四位小数
	}

}
