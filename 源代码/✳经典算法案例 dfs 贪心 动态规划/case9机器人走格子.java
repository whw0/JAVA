package 竞赛经典算法案例;

/*
 * 有一个x*y的网格，一个机器人只能走格点且只能向右或向下走，要从左上角走到右下角
 * 请设计一个算法，计算机器人由多少种走法
 * 给定两个正整数int x，int y请返回机器人的走法数目，保证x+y小于等于12
 * */

public class case9机器人走格子 {
	//递归法
	public static int test1(int x,int y) {
		if(x==1||y==1) {
			return 1;
		}
		return test1(x-1,y)+test1(x,y-1);
	}
	

	public static void main(String[] args) {

	}

}
