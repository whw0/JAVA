package 常见的类应用案例;

import java.util.Scanner;

public class 十进制转十六进制 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
        int n=0;
        int a;
        
        while(true) {
            String hex="";//字符加字符串连成字符串
            System.out.print("输入十进制数字:");
            n=in.nextInt();
            if(n<0)
            	break;
        while(n!=0) {
            a=n%16;
            hex=(char)(a>9?('A'+(a-10)):('0'+a))+hex;
            n=n/16;
        }
        System.out.println(hex);
        }
        
        System.out.println("程序结束");
        

	}

}
