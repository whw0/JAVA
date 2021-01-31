package 竞赛经典算法案例;

import java.util.Scanner;

/*
 * 两只青蛙在网上相识了，它们聊得很开心，于是觉得很有必要见一-面。它们很高兴地发现它们住
在同一条纬度线上，于是它们约定各自朝西跳，直到碰面为止。可是它们出发之前忘记了一件很
重要的事情，既没有问清楚对方的特征，也没有约定见面的具体位置。不过青蛙们都是很乐观
的，它们觉得只要一直朝着某个方向跳下去，总能碰到对方的。但是除非这两只青蛙在同-一时间
跳到同一点上，不然是永远都不可能碰而的。为了帮助这两只乐观的青蛙，你被要求写一个程序
来判断这两只青蛙是否能够碰面，会在什么时候碰面。
        我们把这两只青蛙分别叫做青蛙A和青蛙B，并且规定纬度线上东经0度处为原点，由东往西为正
方向，单位长度1米，这样我们就得到了一条首尾相接的数轴。设青蛙A的出发点坐标是x，青蛙
B的出发点坐标是y。青蛙A一次能跳m米，青蛙B一次能跳n米， 两只青蛙跳一次所花费的时间相
同。纬度线总长L米。现在要你求出它们跳了几次以后才会碰面。

 * */
public class case6青蛙的约会 {
	static int x,y;
	public static int gcdEx(int m,int n) {
		if(n==0) {
			x=1;
			y=0;
			return m;
		}
		int d=gcdEx(n,m%n);
		int t=x;
		x=y;
		y=t+n/m*y;
		return d;
		
	}
	
	public static void  ModalLinear(int a,int b,int n) {
		int d=gcdEx(a,n);
		if(b%d!=0) {
			System.out.println("imposible!");
			return;
		}
		x= (x*(b/d)+ n/d)%n;
		System.out.println(x+" ");
		
	}

	public static void main(String[] args) {
		// 由题目获得等式 x+mk≡y+nk (mod L)
		/* x+mk=Lt1+余数
		 * y+nk=Lt2+余数
		 * 两等式相减
		 * x-y+k(m-n)=L(t1-t2)
		 * k(m-n)+Lt=y-x
		 * ax+ny=d
		 * ax=b(mod n)
		 * 
		 * */
		 Scanner in=new Scanner(System.in);
		 int x0=in.nextInt();
		 int y0=in.nextInt();
		 int n=in.nextInt();
		 int m=in.nextInt();
		 int L=in.nextInt();
		 int a=m-n;
		 long b=L;
		 

	}

}
