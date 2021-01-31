package 算法;
/*
 * 递归
 * */
public class 递归思想recursion {
	
	public static int t1(int n){//求一的阶乘
		if(n==1) {
			return 1;
		}
		return n*t1(n-1);
	}
	
	
	public static int t2(int arr[],int begin) {//数组求和
		if(begin==arr.length-1) {
			return arr[begin];
		}
		return arr[begin]+t2(arr,begin+1);
	}
	
	
	public static String t3(String s,int length) {//字符串反转
		if(length==1) {
			return ""+s.charAt(0);
		}
		return ""+s.charAt(length-1)+t3(s,length-1);
	}
	
	//------重复中的变化，变化中的重复
	
	//斐波那契数列
	/*
	 * 1 1 2 3 5 8....
	 * 每一项都是前两项的和
	 * f(N)=f(N-1)+f(N-2)
	 * */
	public static int t4(int N) {
		if(N==1||N==2) {
			return 1;
		}
		return t4(N-1)+t4(N-2);
	}
	
	public static int t5(int m,int n) {//辗转相除法
		if(m%n==0)
			return n;
		return t5(n,m%n);
	}
	
	public static int[] t6(int arr[],int N) {//使用递归来进行插入排序
		int tmp,i;
		tmp=arr[N];
		for(i=N-1;i>=0;i--) {
			if(tmp<arr[i]) 
				arr[i+1]=arr[i];
			else break;
		}
		arr[i+1]=tmp;
		if(N==arr.length-1) {
			return arr;
		}
		return t6(arr,N+1);
		
	}
	
	/*
	 * 将N个盘子从source移动到target的路径打印
	 * N 初始的N个从小到大的盘子，N是最大编号
	 * from 原始柱子
	 * to   目标柱子
	 * help 辅助柱子
	 * */
	static void printHanoiTower(int N,String from,String to,String help) {
		if(N==1) {
			System.out.println("move"+N+"from"+from+"to"+to);
			return;
		}
		printHanoiTower(N-1,from,help,to);
		System.out.println("move"+N+"from"+from+"to"+to);
		printHanoiTower(N-1,help,to,from);
	}
	
	static int t7(int arr[],int n,int low,int high) {//折半查找
		int mid=(low+high)/2;
		
		if(low>high) {
			System.out.println("不存在该元素!");
			return 0;
		}
		
		if(arr[mid]==n) {
			return mid+1;
		}
		else if(n>arr[mid]) {
			low=mid+1;
		}
		else {
			high=mid-1;
		}
		return t7(arr,n,low,high);
		
		
	}
	
	
	public static void main(String[] args) {
//		String s="abcdefg";
//		System.out.println(t3(s,s.length()));
//		System.out.println(t5(20,16));
//		
//		int a[]= {67,5,7,9,46,54,6,7};
//		a=t6(a,1);
//		for(int x:a) {
//			System.out.print(x+" ");
//		}
//		printHanoiTower(3,"A","B","C");
		
		int b[]= {14,25,36,44,52,67,74,85};
		System.out.println(t7(b,52,0,b.length-1));
		
	}

}
