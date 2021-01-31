package 常见的类应用案例;

import java.util.Scanner;
/*
 * 已知字符范围是0000-FFFF
 * 需求
 *   用户给定一个长度
 *   程序生成该长度的字符串，每个字符都是随机的
 *   输出该字符串
 * */
public class 输出随机字符串 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
	    char a;
	    String s="";
		for(int i=0;i<=n;i++) {
		s=s+(char)(Math.random()*0xFFFF+1);
		}
		System.out.println("随机字符串是:"+s);

	}

}
