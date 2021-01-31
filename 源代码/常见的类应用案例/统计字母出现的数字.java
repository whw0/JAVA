package 常见的类应用案例;


import java.util.Arrays;
import java.util.Scanner;

public class 统计字母出现的数字 {
    public static void main(String[] args) {
    	int total[]=new int[26];//用来统计每个字母出现的次数
    	//Arrays.fill(total, 0);//数组初始化后可以自动填0，不需要该函数
    	Scanner in=new Scanner(System.in);
    	System.out.println("请输入字符串:");
    	String s=in.nextLine();
    	char a='A';
    	
    	for(int i=0;i<=s.length()-1;i++) {
    		if(s.charAt(i)>='A'&&s.charAt(i)<='Z') {
    			total[s.charAt(i)-'A']++;
    		}
    		else if(s.charAt(i)>='a'&&s.charAt(i)<='z') {
    			total[s.charAt(i)-'a']++;
    		}
    	}
    	
    	for(int x:total) {
    		System.out.println("字母"+(a++)+"的次数是"+x);
    	}
    }
}
