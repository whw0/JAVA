package 算法;
/*
 * 位运算的一些技巧
 * 判断奇偶数
 * num&1==0?"奇数":偶数;
 * 
 * 获取二进制位是1还是0
 * 例如查看第五位
 * ((num&(1<<4))>>4)==0?"0":"1";
 * 
 * 交换两个整数变量的值
 * int num1=10;
 * int num2=20;
 * num1=num1^num2;
 * num2=num1^num2;
 * num1=num1^num2;
 * 
 * 不用判断语句，求整数的绝对值
 * num2^(num2>>31)+(num2>>>31);
 * */
public class 位运算 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
