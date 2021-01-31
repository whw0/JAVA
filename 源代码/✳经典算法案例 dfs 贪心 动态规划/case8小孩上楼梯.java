package 竞赛经典算法案例;
/*
 * 小孩正在上楼梯，楼梯由n阶台阶，小孩一次可以上1阶，2阶，3阶
 * 请实现一个方法，计算小孩由多少种上楼的方式
 * 为了防止溢出，请将结果mod 1000000007
 * 
 * 给定一个整数int n，请返回一个数，代表上楼的方式数，
 * 保证n小于等于100000
 * */
public class case8小孩上楼梯 {
	final static int mod=1000000007;
	//这是递归法
	public static int test1(int n) {
		if(n==0||n==1) {
			return 1;
		}
		else if(n==2) {
			return 2;
		}
		else if(n<0) {
			return 0;
		}
		return (test1(n-1)+test1(n-2)+test1(n-3)%mod);
	}
	
	//迭代法
	public static int test2(int n) {
		if(n==0||n==1) {
			return 1;
		}
		else if(n==2) {
			return 2;
		}
		else if(n<0) {
			return 0;
		}
		int x1=1;
		int x2=2;
		int x3=4;
		for(int i=4;i<=n;i++) {
			int x=x1;
			x1=x2 % mod;
			x2=x3 % mod;
			x3=(x+x1+x2)%mod;
		}
		return x3;
		
	}
	
	public static void main(String[] args) {
		System.out.println(test1(10)+" "+test2(10));
	}

}
