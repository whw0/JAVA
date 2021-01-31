package 竞赛经典算法案例;
/*
 * 小白正在上楼梯，楼梯有n阶台阶，小白一次可以上1阶，2阶或者3阶
 * 实现一个方法，计算小白有多少种走完楼梯地方式
 * */
public class case1小白上楼梯 {
	
	public static int case1(int n) {
		if(n==0) {
			return 1;
		}
		else if(n==1) {
			return 1;
		}
		else if(n==2) {
			return 2;
		}
		
		return case1(n-1)+case1(n-2)+case1(n-3);
	}
	

	public static void main(String[] args) {

	}

}
