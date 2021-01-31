package 竞赛经典算法案例;

import java.util.Arrays;
import java.util.Scanner;

//给出n个物体，第i个物体重量为wi，请选择尽量多的物品，使物品总重量不超过c
public class case20背包问题 {
	

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();//输入物品总数
		 int b=sc.nextInt();//输入背包总重量
	     int arr[]=new int[n];
	     for(int i=0;i<n;i++) {
	    	 arr[i]=sc.nextInt();//输入每个物品的重量
	     }
	     Arrays.sort(arr);
	     
	     t1(arr,n,b);
           
	}
	
	private static int t1(int arr[],int n,int b) {
		int total=0;
		int i=0;//物品个数
		for(int x:arr) {
			if(total<=b) {
		      total+=x;
		      i++;
			}
			else {
			  break;
			}
		}
		return i;
	}
	
	/*
	 * 有n个物体,第i个物体的重量为wi，价值为vi，在总重量不超过c的情况下让总价值尽量高
	 * 每一个物体都可以只取走一部分，价值和重量按比例计算
	 * 求最大总价值
	 * 注意：每个物体可以只拿一部分，因此一定可以让总重量恰好为c
	 * 
	 * */
	
	

}
