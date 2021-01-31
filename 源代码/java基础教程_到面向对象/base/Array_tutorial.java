package base;

import java.lang.reflect.Array;
import java.util.Arrays;

/*创造并初始化数组的几种方式
 * int a[]=new int[3];
 * int b[]=new int[]{3,4,5};
 * int c[]={1,2,3};
 * 
 * 数组的length
 * a.length
 * 
 * 二维数组
 * int arr[][]=new int[3][4];
 * int arr[][]={{1,2,3},{5,9,10}};
 * int arr[][]=new int[][]{{1,2,3},{4,5,6}};
 * 遍历数组
 * foreach的语句格式： 
   for(元素类型t 元素变量x : 遍历对象obj){ 
   } 
   
 * 填充和批量替换数组元素
 * Arrays.fill(arr,int value);
 * Arrays,fill(arr,int fromIndex,int toIndex,int value);包括 
 * 
 * 数组排序
 * int arr[]=new int[]{23,42,12,8};
 * Arrays.sort(arr);
 * 
 * 复制数组
 * Arrays.copyOf(arr,newlength); 数组  复制后新数组的长度
 * 
 * Arrays.copyOfRang(arr,formIndex,toIndex) 开始(包括) 结束(不包括)
 * */

public class Array_tutorial {

	public static void main(String[] args) {
//		int al[][]= new int[3][4];
//		al[0]=new int[]{1,2,3,4};
//		al[1][2]=0;
        
//		char arr[][]=new char[2][];
//		arr[0]=new char[] {'春','眠','不','觉','晓'};
//		arr[1]=new char[] {'处','处','闻','啼','鸟'};
//		
//		for(char a[]:arr) {
//			for(char b:a) {
//				System.out.print(b);
//			}
//			System.out.println("");
//		}
		
//		int arr[]=new int[]{23,42,12,8};
//		Arrays.sort(arr);
//		for(int x:arr) {
//			System.out.print(x+" ");
//		}
		
		int a[]= {1,2,3,4};
		int b[]=Arrays.copyOf(a, 3);
		for(int x:b) {
			System.out.print(x+" ");
		}
		
	}

}
