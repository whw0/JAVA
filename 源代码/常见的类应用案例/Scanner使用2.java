package 常见的类应用案例;

import java.util.Random;
import java.util.Scanner;

/*
 * 需求:提示用户输入两个整数,代表一个范围，随机输出这个范围内的一个整数
 * */
public class Scanner使用2 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("请输入开始范围:");
		int a=in.nextInt();
		System.out.print("请输入结束范围:");
		int b=in.nextInt();
        System.out.println("输出随机数:"+(a+(int)(Math.random()*(b-a+1))));
        
	    
	    
	}

}
