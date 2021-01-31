package 常见的类应用案例;

import java.util.Scanner;

/*
  * 欧几里得
  * If m%n is 0,gcd(m,n) is n.
  * Otherwise,gcd(m,n) is gcd(n,m%n)
  * */

public class 最大公约数 {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		int m,n,tmp,i,j;
		System.out.println("请输入两个数:");
		i=m=in.nextInt();
		j=n=in.nextInt();
		if(n>m) {
			tmp=m;
			m=n;
			n=tmp;
		}
		
		if(m%n==0) {
			System.out.printf("%d与%d的最大公约数为%d.\n",i,j,n);
			System.exit(0);
		}
		
		while(m%n!=0) {
			tmp=n;
			n=m%n;
			m=tmp;
		}
		System.out.printf("%d与%d的最大公约数为%d.\n",i,j,n);
		


	}

}
