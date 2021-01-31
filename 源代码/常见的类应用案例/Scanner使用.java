package 常见的类应用案例;

import java.util.Scanner;

/* 控制台输入
 * import java.util.Scanner;
 * Scanner in=new Scanner(System.in);
 * String s=in.nextLine();
 * int i=in.nextInt();
 * double d=in.nextDouble();
 * 
 * 已知:圆面积公式为3.14159*r^2
 * 需求:提示用户输入一个元的半径(浮点数),计算出元圆的面积并输出
 * 
 * */
public class Scanner使用 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("请输入r半径:");
		double r=in.nextDouble();
		System.out.println("该圆的面积是:"+Math.pow(r, 2)*3.14159);
		

	}

}
