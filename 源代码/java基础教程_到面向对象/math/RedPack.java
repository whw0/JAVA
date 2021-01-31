package math;

import java.util.Random;
import java.util.Scanner;

public class RedPack {
	public static void main(String[] args){
		System.out.println("-----微信红包-----");
		Scanner sc=new Scanner(System.in);
		System.out.println("红包的总金额:");
		double total=sc.nextDouble();
		double bagCount=sc.nextInt();
		
		Random c=new Random();
		
		double min=0.01;
		for(int i=1;i<=bagCount;i++) {
			/*
			 * */
			double max=total-(bagCount-i)*min;
			double bound=max-min;
			//double safe=c.nextInt((int)(bound*100))/100;
			double safe=c.nextInt((int)(bound*100))/100;
			double money=safe+min;
			total=total-money;
			System.out.println("第"+i+"个红包"+String.format("%.2f", money)+"元");
			System.out.println("第"+bagCount+"个红包"+String.format("%.2f", total));
			sc.close();
		}
	}

}
