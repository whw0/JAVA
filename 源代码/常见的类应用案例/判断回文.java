package 常见的类应用案例;

import java.util.Scanner;

public class 判断回文 {
	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.println("请输入字符:");
		String s=in.nextLine();
		
		int low=0,high=s.length()-1;//注意'\0'
		
		while(s.charAt(low)==s.charAt(high)&&high>=low) {
			high--;
			low++;
		}
		
		if(low>high) {
			System.out.println(s+"是回文");
		}
		else {
			System.out.println(s+"不是回文");
		}
	}

}
