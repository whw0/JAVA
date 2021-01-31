package 数学思想;
/*
 * 对任何整数a b和它们的最大公约数d，关于未知数x和y的
 * 线性方程：
 * ax+by=m 有整数解时当且仅当m是d的倍数
 * 裴蜀等式有解时必然有无穷多个整数解，每组解x，y称为裴蜀数
 * 可用拓展欧几里得算法求得
 * */
public class 欧几里得公式及其拓展 {
	public static int x,y;
	public static int Euclid(int m,int n) {//欧几里得算法
		return (n==0)?m:Euclid(n,m%n);
	}
	
	public static int EuclidEx(int m,int n) {//欧几里得公式拓展
		if(n==0) {
			x=1;
			y=0;
			return m;
		}
		int d=EuclidEx(n,m%n);
		int t=y;
		y=x+m/n*y;
		x=t;
		return d;
	}
	
	public static void main(String[] args) {
		System.out.println(EuclidEx(4,2)+" "+x+" "+y);
	}
	
	

}
