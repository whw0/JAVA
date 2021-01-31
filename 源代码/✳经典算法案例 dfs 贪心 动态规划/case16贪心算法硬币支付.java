package 竞赛经典算法案例;

import java.util.Scanner;

/*
 * 动态规划和贪心算法都是一种递推算法
 * 均用局部最优解来推导全局最优解
 * 是对遍历解空间的一种优化
 * 当问题具有最优解子结构时，可用动态规划，而贪心是动态规划的特例
 * 
 * 贪心算法
 * 遵循某种规划，不断选取当前最优策略，最终找到最优解
 * 难点：当前最优未必是整体最优
 * */

/*
 * 硬币问题
 * 有1元 5元 10元 50元 100元 500元的硬币个c1 c5 c10 c50 c100 c500
 * 现在要用这些硬币来支付A元，最少需要多少硬币
 * 输入
 * 3 2 1 3 0 2
 * 620
 * 输出6
 * */
public class case16贪心算法硬币支付 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        int a[]=new int[6];//输入硬币的数量
        for(int i=0;i<a.length;i++) {
        	a[i]=sc.nextInt();
        }
        int n=sc.nextInt();
        int coin[]= {1,5,10,50,100,500};//硬币面额
        System.out.println(Greedy(a,coin,n,a.length-1));
	}
	
	public static int Greedy(int a[],int coin[],int n,int i){
		int total=0;
		while(coin[i]<=n&&a[i]>0) {
			a[i]--;
			n-=coin[i];
			total++;
		}
		if(n==0) {
			return total;
		}
		return total+Greedy(a,coin,n,i-1);
	}

}
