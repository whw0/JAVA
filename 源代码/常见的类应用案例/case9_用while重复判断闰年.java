package 常见的类应用案例;

import java.util.Scanner;

/*
 * 普通闰年：公历年份是4的倍数的，且不是100的倍数，为普通闰年（如2004年、2020年就是闰年）。
 * 世纪闰年：公历年份是整百数的，必须是400的倍数才是世纪闰年（如1900年不是世纪闰年，2000年是世纪闰年）。
 * (year%4==0&&year%100!=0)||year%400==0
 * 
 * 让用户可以同时测试多个年份，用户输入"-1"时,中止程序
 * 
 * */
public class case9_用while重复判断闰年 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int year=1;
		while(year!=-1) {
			System.out.print("请输入年份(输入-1退出):");
			year=in.nextInt();
			if((year%4==0&&year%100!=0)||year%400==0) 
				System.out.println("是闰年!");
			else if(year!=-1) {
				System.out.println("不是闰年");
			}
		System.out.println("程序运行结束");
		
		}
	}
}


