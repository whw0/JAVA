package math;

import java.math.BigDecimal;
import java.math.BigInteger;

/*Biginteger
 * 可以是任意精度
 * 
 * BigDecimal
 * 任意精度小数
 * 
 * */
public class BigDigital {

	public static void main(String[] args) {
		BigInteger i1=new BigInteger("99");//只能输入字符串
		BigInteger i2=BigInteger.valueOf(99999999);
		
		System.out.println("加法\t"+i2.add(new BigInteger("1")));
	//此外还有 substract multiply divide remainder求余
    //pow compareTo max min equals
		
		BigInteger a=new BigInteger("123456");
		BigInteger b=new BigInteger("5678");
		System.out.println(a+"与"+b+"最大公因数"+a.gcd(b));
		
		
		BigDecimal d=new BigDecimal("3.14");
		BigDecimal e=new BigDecimal(3.14);
		BigDecimal c=BigDecimal.valueOf(3.14);//三种赋值方式
		
	}

}
