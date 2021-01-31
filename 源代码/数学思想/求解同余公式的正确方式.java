package 数学思想;
/*
 * 模
 * 计算除以m的余数，叫做对m取模
 * 将a，b对m取模的结果相同，记为a≡b
 * 也就是a mod m==b mod m
 * 如果a≡b(mod m) c≡d(mod m):
 * a+b=c+d(mod m)
 * a*b=c*d(mod m)
 * 
 * 模线性方程  ax≡b(mod m)

     其中a,b和m是已知的（m>0），要求解出满足上式的对模m的x值。满足同余方程的x可能有多个，也可能一个都没有，上述模线性方程也称为一次同余方程。

    例如：57x≡7（mod 11）有一个解x=9，而9x≡7（mod 6）无解。

    解：模线性方程ax≡b(mod m)的步骤如下：

（1）求 d=gcd（a,m）

（2）若d不是b的因数，则ax≡b(mod m)无解，结束；否则转（3）

（3）求x0,y0,是a*x0+m*y0=d;

（4）由于d是b的因数，将a*x0+m*y0=d改写，得a(x0*(b/d))+m*(y0*(b/d))=b, 

     于是ax+my=b的一个特解为 x=x0*(b/d),y=y0*(b/d);

（5）x0*(b/d)是ax≡（mod m）的一个特解，由此的ax≡b(mod m)的所有解

   （共d个）为：x= (x0*(b/d)+ i*(m/d) ) (mod m), i=0,1,2,3,4.……d-1
 
 * 
 * ax≡b（mod n）
 * 可以分解成 ax=n*y1+余 b=n*y2+余 
 * 将它们相减的到ax+ny=b
 * */
public class 求解同余公式的正确方式 {
	static int x,y;
	public static int gcd(int m,int n) {
		return (n==0)?m:gcd(n,m%n);
	}
	
	public static int gcdEx(int m,int n) {
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
	
	public static void ModalLinear(int a,int b,int m) {  //模线性方程 ax≡b(mod m);ax+ny=b
		int d=gcdEx(a,m),x1;//求出x0，y0
		if(b%d!=0) {
			System.out.println("该方程无解");
			return ;
		}
		System.out.println(x+" "+y+" "+d+" "+x*(b/d)%m);
		for(int i=0;i<d;i++) {
		x1= (x*(b/d)+ i*(m/d) )%m;
		System.out.println(x1+" ");
		}
		
	}
	
	public static void main(String[] args) {
		ModalLinear(777,66,6); 
	}
	
	

}
