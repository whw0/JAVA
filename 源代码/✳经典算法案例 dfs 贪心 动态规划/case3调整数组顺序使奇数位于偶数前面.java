package 竞赛经典算法案例;
/*
 * 输入一个整数数组，调整数组中数字的顺序，使得所有奇数位于数组的前半部分，
 * 所有偶数位于数组的后半部分。要求时间复杂度为n
 * */
public class case3调整数组顺序使奇数位于偶数前面 {

	public static void partition(int arr[],int begin,int end) {
		int tmp;
	    
		while(begin<end) {
		   while(arr[begin]%2==1&&begin<end) {
			  begin++;
		   }
		   while(arr[end]%2==0&&begin<end) {
			  end--;
		   }
		   if(begin<end) {
		      tmp=arr[begin];
		      arr[begin]=arr[end];
		      arr[end]=tmp;
		   }
		}
		
	}
	
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,6,7,8,9,9};
		partition(arr,0,9);
		for(int x:arr) {
			System.out.print(x+" ");
		}
		

	}

}
