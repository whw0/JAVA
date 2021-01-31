package 竞赛经典算法案例;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;

/*
 * 给定整数序列a1 a2...an判断是否可以从中选出若干数，使它们的和恰好为k
 * 1<=n<=20
 * 
 * 样例:
 * 输入
 *    n=4
 *    a={1,2,4,7}
 *    k=13
 * 输出:
 *    yes{13=2+4+7}
 * */


public class case13dfs部分和 {
	private static void dfs(int []a,int k,int cur,ArrayList<Integer> ints) {
		if(k==0) {
			System.out.print("yes{"+kk+"=");
			for(int i=0;i<ints.size();i++) {
				System.out.print(ints.get(i)+(i==ints.size()-1?"":"+"));
			}
			System.out.print("}");
			System.exit(0);
		}
		if(k<0||cur==a.length)return;
		ints.add(a[cur]);
		dfs(a,k-a[cur],cur+1,ints);
		int index=ints.size()-1;
		ints.remove(index);//回溯
		dfs(a,k,cur+1,ints);
	}
	
	static int kk;

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int k=sc.nextInt();
        kk=k;
		dfs(a,k,0,new ArrayList<Integer>());//传入实例不能用Set

	}

}
