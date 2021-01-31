package 竞赛经典算法案例;

import java.util.Scanner;

/*
 * 有一个大小为N*M的园子，雨后积水，八连通的积水认为是连接到一起的
 * 请求出园子里共有多少水洼？
 * 限制条件N,M<=100
 * 
 * N=5,M=5
 * 园子如下(w表示水
 * W....
 * ...WW
 * ...WW
 * .w...
 * .....
 * 
 * 输出3
 * */

public class case14dfs水洼 {
	
	private static void dfs(char a[][],int i,int j) {
		a[i][j]='.';
		for(int k=-1;k<2;k++) {
			//-1 0 1
			for(int l=-1;l<2;l++) {
				//-1 0 1
				if(k==0&&l==0)continue;
				if(i+k>=0&&i+k<=n-1&&j+l>=0&&j+l<=m-1) {
					if(a[i+k][j+l]=='W')
						dfs(a,i+k,j+l);
				}
			}
		}
	}
	
	static int n,m;
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		m=sc.nextInt();
		char[][] a=new char[n][];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLine().toCharArray();
		}
		int cnt=0;
		for(int i=0;i<n;i++) {
			for(int j=0;j<m;j++) {
				if(a[i][j]=='W') {
					dfs(a,i,j);
					cnt++;
				}
			}
		}
	}

}
