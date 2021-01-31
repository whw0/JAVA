package 竞赛经典算法案例;

public class case15dfs回溯与剪枝n皇后 {
	/*
	 * 递归调用代表开启一个分支，如果希望这个分支返回后某些数据恢复到分支
	 * 开启前的状态以便重新开始，就要使用回溯技巧
	 * 
	 * 剪枝
	 * 深搜时，如已明确从当前状态无论如何转移都不会存在更优解，就应该中段往下的继续搜索，这种方法称为剪枝
	 * 
	 * */

	/*
	 * 请设计一种算法，解决著名的n皇后问题，这里的n皇后问题指在一个n*n的棋盘上放置n个棋子
	 * 使得每行每列对角线上都只有一个棋子，求摆放的方法数；
	 * */
	static int n;
	static int cnt;
	static int[] rec;
	
	public static void main(String[] args) {
        n=4;
        rec=new int[4];
        dfs(0);
        System.out.println(cnt);
	}
	
	private static void dfs(int row) {
		if(row==n) {
			cnt++;
			return;
		}
		//在列上放皇后
		for(int col=0;col<n;col++) {
			boolean ok=true;
			//检测
			for(int i=0;i<row;i++) {
				if(rec[i]==col||i+rec[i]==row+col||rec[i]-i==col-row) {
					ok=false;
					break;
				}
			}
			if(ok) {
				rec[row]=col;
				dfs(row+1);
			}
		}
	}

}
