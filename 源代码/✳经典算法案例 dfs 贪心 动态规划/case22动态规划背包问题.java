package 竞赛经典算法案例;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 动态规划方法代表了这一类问题(最优子结构or子问题最优性)
 * 的一般解法，是设计方法或者策略，不是具体算法
 * 本质是递推，核心是找到状态转移的方式，写出dp方程
 * 形式:
 *   -记忆型递归
 *   -递推
 * */

/*
 * 有n个物体,第i个物体的重量为wi，价值为vi，在总重量不超过c的情况下,求出最大的总价值
 * */
public class case22动态规划背包问题 {
	static int[] w= {2,1,3,2};
	static int[] v= {3,2,4,2};
	static int n=4;//物品数量
	static int W=5;//背包极限承重
	static int rec[][];
	
	public static void main(String[] args) {
		int ww=W;
		//使用动态规划改进
		rec=new int [n][W+1];
		for(int i=0;i<n;i++) {
			Arrays.fill(rec[i], -1);//全部赋值为-1
		}
		int ans=dfs(n,ww);
		
	}
	
	static int dfs(int i,int ww) {
		if(ww<=0) return 0;
		if(i==n) return 0;
		
		int v2=dfs(i+1,ww);
		if(ww>=w[i]) {
			int v1=v[i]+dfs(i+1,ww-w[i]);
			return Math.max(v1,v2);
		}
		else {
			return v2;
		}
	}
	
	static int dp(int i,int ww) {
		if(ww<=0) return 0;
		if(i==n) return 0;
		if(rec[i][ww]>=0)
			return rec[i][ww];//计算之前先查询
		
		int v2=dfs(i+1,ww);
		int ans;
		if(ww>=w[i]) {
			int v1=v[i]+dfs(i+1,ww-w[i]);
			ans=Math.max(v1,v2);
		}
		else {
			ans=v2;
		}
		rec[i][ww]=ans;//计算之后做记录
		return ans;
	}
	
	static int dp2() {
		int dp[][]=new int[n][W+1];
		//初始化dp表中的第一行
		for(int i=0;i<W+1;i++) {
			if(i>=w[0]) {//每种容量0号物品
				dp[0][i]=v[0];
			}
			else {
				dp[0][i]=0;
			}
		}
		
		for(int i=1;i<n;i++) {
			for(int j=0;i<W+1;j++) {
				if(j>=w[i]) {
					int i1=v[i]+dp[i-1][j-w[i]];
					int i2=dp[i-1][j];
					dp[i][j]=Math.max(i1, i2);
				}
				else {
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		return dp[n-1][W];
	}
		
	

}
