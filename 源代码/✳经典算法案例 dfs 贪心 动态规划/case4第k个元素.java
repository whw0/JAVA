package 竞赛经典算法案例;
/*
 * 以尽量高的效率求出一个乱序数组中按数值顺序的第k个元素
 * 
 * 思路:1.先排序再找
 * 2.直接partition缩小范围
 * */



public class case4第k个元素 {
	public static int search(int arr[],int begin,int high,int n) {
		int mid=partition(arr,begin,high);
		if(mid==n) {
			return mid;
		}
		else if(mid>n) {
			search(arr,begin,mid-1,n);
		}
		else {
			search(arr,mid-1,begin,n);
		}
		return mid;
		
	}
	
	public static int partition(int arr[],int begin,int high) {
		int pivot=arr[begin];
		int tmp;
		
		while(high>begin) {
			while(pivot>arr[begin]&&high>begin) {
				begin++;
			}
			while(pivot<arr[high]&&high>begin) {
				high--;
			}
			if(high>begin) {
				tmp=arr[begin];
				arr[begin]=arr[high];
				arr[high]=tmp;
			}
			
		}
		return high;
	}
	

	public static void main(String[] args) {
		int arr[]= {2,4,8,5,3,6,1,7};
		System.out.println(search(arr,0,7,2));

	}

}
