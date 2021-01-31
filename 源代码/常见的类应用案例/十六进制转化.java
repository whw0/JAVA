package 常见的类应用案例;

import java.util.Scanner;

/*
 * 提示用户输入0-15中的一个数，用程序将其转换为十六进制表示法的单个字符并输出
 * 限制:用户只能输入0-15个数 不能用Integer.toHex一系列方法
 * */
public class 十六进制转化 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("请输入一个0-15的数字:");
		int n=in.nextInt();
		char Hex=(char) (n>9?('A'+(n-10)):('0'+n));
		System.out.println(n+"的十六进制:"+Hex);
	}

}
