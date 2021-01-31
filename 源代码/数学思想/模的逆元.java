package 数学思想;
/*
 * 同余方程ax≡1(mod n),gcd(a,n)=1时有解.
 * 这时称求出的x为a的对模n的乘法逆元
 * 对于同余方程ax≡1(mod n),gcd(a,n)=1的求解就是求解方程
 * ax+ny=1,x,y为整数。这个可用扩展欧几里得算法求出
 * 原同余方程的唯一的解就是用拓展欧几里得算法求出的x
 * */
public class 模的逆元 {
	static int x,y;
	//欧几里得拓展
	public static int gcdEx(int m,int n) { //ax+by=d
		if(n==0) {
			x=1;
			y=0;
			return m;
		}
		int d=gcdEx(n,m%n);
		int t=x;
		x=y;
		y=t+m/n*y;
		return d;
	}
	/*
	 * 模线性方程  ax≡b(mod m)
	 * ax=tm+余数
	 * b=t2m+余数
	 * ax-b=m(t-t2)
	 * ax+my=b
	 * 
	 * */
	
	public static int ModalLinear(int a,int m,int b) {
		int d=gcdEx(a,m);
		if(b%d!=0) {
			System.out.println("不存在解!");
			System.exit(0);
		}
		x=x*b/d%m;
		return d;
	}
	
	public static int inverseElement(int a,int mo) {//逆元
		int d=ModalLinear(a,mo,1);
		x=(x%mo+mo)%mo;//保证为正数
		return d;
	}
	
	public static void main(String[] args) {
		System.out.println(inverseElement(13,5)+" "+x);
		
		
	}

}
