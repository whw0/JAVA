package 竞赛经典算法案例;

public class case25动态规划数字三角形 {
	
	public static int dfs(int triangle[][],int i,int j) {
		int rowIndex=triangle.length;
		if(i==rowIndex-1) {
			return triangle[i][j];
		}
		else {
			return triangle[i][j]+Math.max(dfs(triangle,i+1,j), dfs(triangle,i+1,j+1));
		}
	}
	
	public static int dp(int [][]triangle,int i,int j) {
		int rowCount=triangle.length;
		int columnCount=triangle[rowCount-1].length;//最后一行列数
		int [][]dp=new int[rowCount][columnCount];
		for(int k=0;k<columnCount;k++) {
			dp[rowCount-1][k]=triangle[rowCount-1][k];
		}
		
		for(int k=rowCount-2;k>=0;k--) {
			for(int l=0;l<=k;l++) {
				dp[k][l]=triangle[k][l]+Math.max(dp[k+1][l],dp[k+1][l+1] );
			}
		}
		return dp[0][0];
	}
	

	public static void main(String[] args) {
		// TODO 自动生成的方法存根

	}

}
