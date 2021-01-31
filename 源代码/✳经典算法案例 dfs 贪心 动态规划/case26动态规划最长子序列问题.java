package 竞赛经典算法案例;

import java.util.ArrayList;

public class case26动态规划最长子序列问题 {
	public static ArrayList<Character> dfs(String s1,String s2){
		int len1=s1.length();
		int len2=s2.length();
		ArrayList<Character>ans=new ArrayList<>();
		for(int i=0;i<len1;i++) {
			ArrayList<Character>list=new ArrayList<>();
			for(int j=0;j<len2;j++) {
				if(s1.charAt(i)==s2.charAt(j)) {//如果相同
					list.add(s1.charAt(i));
					list.addAll(dfs(s1.substring(i+1),s2.substring(j+1)));
					break;
				}
			}
			if(list.size()>ans.size()) {
				ans=list;
			}
		}
		return ans;
	}
	
	//dp法解决
	String solution(String s1,String s2) {
		int len1=s1.length();
		int len2=s2.length();
		int dp[][]=new int[len1+1][len2+1];//dp表
		int flag=0;
		//初始化
		for(int i=1;i<=len1;i++) {
			if(flag==1) {
				dp[i][1]=1;
			}
			else if(s1.charAt(i-1)==s2.charAt(0)) {
				dp[i][1]=1;
				flag=1;
			}
			else {
				dp[i][1]=0;
			}
		}
		
		flag=0;
		//初始化第一行
		for(int j=1;j<=len2;j++) {
			if(flag==1) {
				dp[1][j]=1;
			}
			else if(s2.charAt(j-1)==s1.charAt(0)) {
				dp[1][j]=1;
				flag=1;
			}
			else {
				dp[1][j]=0;
			}
		}
		for(int i=2;i<=len1;i++) {
			for(int j=2;j<=len2;j++) {
				int maxOfLeftAndUp=Math.max(dp[i-1][j], dp[i][j-1]);
			    if(s1.charAt(i-1)==s2.charAt(j-1)) {
			    	dp[i][j]=Math.max(maxOfLeftAndUp, dp[i-1][j-1]+1);
			
			    }
			    else {
			    	dp[i][j]=maxOfLeftAndUp;
			    }
			}
		}
		return parseDp(dp,s1,s2);
	}

}
