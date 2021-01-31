package 算法;
/*
 * 希尔排序
 * 分治思想
 * 快速排序(两种扫描方法)
 * 归并排序
 * */
public class 一些排序方法_用到分治思想 {
	
	
	//希尔排序
	public static void shellSort(int arr[]) {
		//不断地缩小增量
		for(int d=arr.length/2;d>0;d=d/2) {
			for(int i=d;i<arr.length;i++) {
				int target=arr[i];
				int j=i-d;
				while(j>-1&&arr[j]>target) {
					arr[j+d]=arr[j];
					j-=d;
				}
				arr[j+d]=target;
			}
		}
	}
	
	/* 分治法
	 * 将原问题划分成若干个规模较小而结构与原问题一致的子问题；
	 * 递归的解决这些子问题，然后再合并其结果，就得到原问题得解。
	 * 容易确定运行时间，是分治算法的优点之一
	 * 分治模式在每一层递归上都有三个步骤
	 * 分解：将原问题分解成一系列子问题、
	 * 解决：递归的解决各个子问题。若子问题足够小，则直接有解
	 * 合并：将子问题的结果合并成原问题的解
	 * 
	 * */
	
	//快排之单向扫描分区法
	/*
	 * 一遍扫描法的思路是，用两个指针将数组划分为三个区间
	 * 扫描指针左边是确认小于等于主元的，
	 * 扫描指针到某个指针中间为未知的，因此我们将第二个指针
	 * 称为未知区域间末指针，末指针的右边区间为确认大于主元的元素
	 * 
	 * */
	public static void quickSort(int A[],int p,int r) {
		if(p<r) {
			//int q=partition(A,p,r);
			int q=partition2(A,p,r);
			quickSort(A,p,q-1);
			quickSort(A,q+1,r);
		}
	}
	
	public static int partition(int A[],int p,int r) {
		int pivot=A[p];//中心元素
		int sp=p+1;
		int bigger=r;
		int tmp;//哨兵
		while(sp<=bigger) {
			if(A[sp]<=pivot) {
				sp++;
			}
			else {
				tmp=A[sp];
				A[sp]=A[bigger];
				A[bigger]=tmp;
				bigger--;
			}
		}
		tmp=A[p];  //最后bigger一定指向比pivot小的最后一个元素
		A[p]=A[bigger];
		A[bigger]=tmp;
		return bigger;
	}
	
	//双向扫描法
	/*
	 * 思路:头尾指针往中间扫描，从左找到大于主元的元素，从右找到小于等于
	 * 主元的元素二者交换，继续扫描，直到左侧无大元素，右侧无小元素
	 * 
	 * */
	public static int partition2(int A[],int p,int r) {
		int pivot=A[p];
		int left=p+1,right=r;
		int tmp;//哨兵
		
	    while(right>=left){	
		   while(pivot>=A[left]&&right>=left) {
			  left++;
		 }
		   while(pivot<A[right]&&right>=left) {
			  right--;
		 } 
		   if(left<right) {
		   tmp=A[left];
		   A[left]=A[right];
		   A[right]=tmp;
		   }
	    }
	    tmp=A[right];
	    A[right]=pivot;
	    A[p]=tmp;
	    return right;
		
	}
	
	/*
	 * 快速排序优化
	 * */
	
	/*
	 * 归并排序(MergeSort)算法完全依照了分治模式
	 * 分解:将n个元素分解各个含n/2个元素的子序列
	 * 解决:对两个子序列递归地排序
	 * 合并:合并两个已排序的子序列已得到排序结果
	 * */
	public static void merge(int[] arr,int low,int mid,int high,int[] tmp){
		int i = 0;
		int j = low,k = mid+1;  //左边序列和右边序列起始索引
		while(j <= mid && k <= high){
			if(arr[j] < arr[k]){
				tmp[i++] = arr[j++];
			}else{
				tmp[i++] = arr[k++];
			}
		}
		//若左边序列还有剩余，则将其全部拷贝进tmp[]中
		while(j <= mid){    
			tmp[i++] = arr[j++];
		}
		while(k <= high){
			tmp[i++] = arr[k++];
		}	
		for(int t=0;t<i;t++){
			arr[low+t] = tmp[t];
		}
	}


   public static void mergeSort(int[] arr,int low,int high,int[] tmp){
		if(low<high){
			int mid = (low+high)/2;
			mergeSort(arr,low,mid,tmp); //对左边序列进行归并排序
			mergeSort(arr,mid+1,high,tmp);  //对右边序列进行归并排序
			merge(arr,low,mid,high,tmp);    //合并两个有序序列
		}
	}

	public static void main(String[] args) {
		int arr[]= {2,1,5,3,6,6,7,3,62,4};
		//shellSort(arr);
		int tmp[]=new int[10];
		mergeSort(arr,0,9,  tmp);
		for(int x:arr) {
			System.out.print(" "+x);
		}

	}

}
