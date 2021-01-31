package 竞赛经典算法案例;

import java.util.Arrays;
import java.util.Scanner;

import javax.print.attribute.standard.MediaSize.Other;

/*
 * 1）区间完全覆盖问题
问题描述：给定一个长度为m的区间，再给出n条线段的起点和终点（注意这里是闭区间），求最少使用多少条线段可以将整个区间完全覆盖

样例：

区间长度8，可选的覆盖线段[2,6],[1,4],[3,6],[3,7],[6,8],[2,4],[3,5]

解题过程:

1将每一个区间按照左端点递增顺序排列，拍完序后为[1,4]，[2,4]，[2,6]，[3,5]，[3,6]，[3,7]，[6,8]

2设置一个变量表示已经覆盖到的区域。再剩下的线段中找出所有左端点小于等于当前已经覆盖到的区域的右端点的线段中，右端点最大的线段在加入，直到已经覆盖全部的区域

3过程:

假设第一步加入[1,4]，那么下一步能够选择的有[2,6]，[3,5]，[3,6]，[3,7]，由于7最大，所以下一步选择[3,7]，最后一步只能选择[6,8]，这个时候刚好达到了8退出，所选区间为3

4贪心证明:

需要最少的线段进行覆盖，那么选取的线段必然要尽量长，而已经覆盖到的区域之前的地方已经无所谓了，（可以理解成所有的可以覆盖的左端点都是已经覆盖到的地方），那么真正能够使得线段更成的是右端点，左端点没有太大的意义，所以选择右端点来覆盖
 * */
public class case19贪心算法区间覆盖问题 {
/*
 * 题意：有n头牛，它们都有一个工作时间的区间s至e，给定一个总的工作时间t，问最少需要多少头牛才能覆盖从1到t的工作时间
 * */
	
	private static class Job implements Comparable<Job>{
		int s;
		int t;
		public Job(int s,int t) {
			this.s=s;
			this.t=t;
		}
		
		@Override
		public int compareTo(Job other) {
			int x=this.s-other.s;
			if(x==0)
				return this.t-other.t;
			else
				return x;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		int T=sc.nextInt();
		Job[] jobs=new Job[N];
		for(int i=0;i<N;i++) {
			jobs[i]=new Job(sc.nextInt(),sc.nextInt());
		}
		Arrays.sort(jobs);
		int start=1;
		int end=1;
		int ans=1;
		for(int i=0;i<N;i++) {
			int s=jobs[i].s;
			int t=jobs[i].t;
			if(i==0&&s>1)break;
			if(s<=start) {
				end=Math.max(t,end);
			}
			else {
				ans++;
				start=end+1;
				if(s<=start) {
					end=Math.max(t, end);
				}
				else {
					break;
				}
			}
			if(end>=T) {
				break;
			}
		}
		

	}

}
