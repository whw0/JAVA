package 竞赛经典算法案例;
/*
 * Serling公司购买长钢条，将其切割为短钢条出售，切割工序本身没有成本支出，公司管理层希望知道最佳切割方案
 * 假定我们知道Serling公司出售一段长为i英寸的钢条的价格为pi(i=1,2..单位为美元)
 * 钢条的长度为整英寸
 * 长度  1  2  3  4  5  6  7  8  9  10
 * 价格  1  5  8  16 10 17 17 20 24 30 
 * */

public class case24动态规划钢条切割 {
	static int n=10;
	static int[] p= {1,5,8,16,10,17,17,20,24,30};
	static int rec[];
	static int dfs(int x) {
		if(x==0)
			return 0;
		int ans=0;
		for(int i=1;i<=x;i++) {
			if(rec[x-i]==-1)
				rec[x-i]=dfs(x-i);
			int v=p[i-1]+rec[x-i];
			ans=Math.max(v,ans);
		}
		rec[x]=ans;
		return ans;
	}
	
	static int dp() {
		rec[0]=0;
		for(int i=1;i<=n;i++) { //拥有的钢条长度
			for(int j=1;j<=i;j++) {//保留j为整段
				rec[i]=Math.max(p[j-1]+rec[i-j],rec[i]);
			}
		}
		return rec[n];
	}

	public static void main(String[] args) {
	}

}
