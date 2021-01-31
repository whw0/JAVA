package 算法;
/*
 * 两种基础的查找方法
 * 顺序查找
 * 折半查找
 * */
public class 两个常用的基本查找 {
	
	public static int search(int arr[],int n) {
		for(int i=0;i<arr.length;i++) {
			if(arr[i]==n) {
				return i+1;
			}
		}
		return -1;
	}
	
	public static int binarySearch(int arr[],int high,int low,int n) {//也能用迭代法
		int mid=(high+low)/2;
		if(low>high) {
			return -1;
		}
		if(arr[mid]==n) {
			return mid+1;
		}
		else if(arr[mid]>n) {
			return binarySearch(arr,mid-1,low,n);
		}
		else {
			return binarySearch(arr,low,mid+1,n);
		}
	}
	
	public static void main(String[] args) {
		int arr[]= {2,5,45,56,65};
		System.out.println(binarySearch(arr,4,0,45));
	}

}
