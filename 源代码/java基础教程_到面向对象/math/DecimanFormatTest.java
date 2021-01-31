package math;

import java.text.DecimalFormat;

/*十进制数字格式化类
 * 
 * DecimalFormat df=new DecimalFormat('###');
 * 
 * DecimalFormat df=new DecimalFormat();
 * df.applyPattern("###");
 * 0 数字占位符，如果没有则显示0
 * # 数字占位符，如果没有则不显示
 * .小数点分隔符
 * ,分组分隔符
 * '转义字符
 * %将书数字乘100显示为百分数
 *\u2030将数字乘以1000显示为千分数
 * 
 * */

public class DecimanFormatTest {
	
	static void format(String pattern,double values) {
		DecimalFormat df=new DecimalFormat(pattern);
		System.out.println(values);
		System.out.println(pattern);
		System.out.println(df.format(values));
		System.out.println("------------------------------");
	}

	public static void main(String[] args) {
		format("000",123);
		format("###,###.###$",123456.234);
		format("0.0\u2030",0.0344);
		

	}

}
