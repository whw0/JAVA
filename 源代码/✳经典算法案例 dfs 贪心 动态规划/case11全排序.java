package 竞赛经典算法案例;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
 * 将集合中的所有排序情况组合出来
 * */
public class case11全排序 {
	//这个是迭代法
	public static Set<String> test1(String s){
		String tmp;
		Set<String> set=new HashSet<>();
		set.add(s.charAt(0)+"");
		for(int i=1;i<s.length();i++) {
			Set<String> newSet=new HashSet<>();
			char c=s.charAt(i);
			for(String x:set) {
				tmp=""+c+x;
				newSet.add(tmp);
				tmp=""+x+c;
				newSet.add(tmp);
				for(int j=1;j<x.length();j++) {
					tmp=x.substring(0, j)+c+x.substring(j);
					newSet.add(tmp);
				}
			}
			set=newSet;
		}
		return set;
	}
	
	//递归法
	public static Set<String> test2(String s,int n){
		Set<String> newSet=new HashSet<>();
		if(n==0) {
			newSet.add(""+s.charAt(0));
			return newSet;
		}
		Set<String> set=test2(s,n-1);
		for(String x:set) {
			char c=s.charAt(n);
			String tmp;
			tmp=""+x+c;
			newSet.add(tmp);
			tmp=""+c+x;
			newSet.add(tmp);
			for(int j=1;j<x.length();j++) {
				tmp=x.substring(0,j)+c+x.substring(j);
				newSet.add(tmp);
			}
		}
		return newSet;
		
	}
	
	//回溯法
	static Set<String> res=new HashSet<>();
	public static Set<String> test3(String A){
		char[] arr=A.toCharArray();//
		Arrays.parallelSort(arr);
		getPermutationCore(arr,0);
		return res;
	}
	
	private static void getPermutationCore(char[] arr,int k) {
		if(k==arr.length) {
			res.add(new String(arr));
		}
		for(int i=k;i<arr.length;i++) {
			swap(arr,k,i);
			getPermutationCore(arr,k+1);
			swap(arr,k,i);
		}
	}
	
	static void swap(char arr[],int i,int j) {
		char tmp=arr[i];
		arr[i]=arr[j];
		arr[j]=tmp;
	}
	
	
	//前缀法
	final static int k=3;
	static int count=0;
	
	private static void test3(String prefix,char[] arr) {
		if(prefix.length()==arr.length) {
			count++;
			if(count==k) {
				System.out.println("-----:"+prefix);
				System.exit(0);
			}
		}
		//每次都从头扫描，只要该字符可以用，就添加到前缀后
		for(int i=0;i<arr.length;i++) {
			char ch=arr[i];
			//这个字符可用:在pre中出现次数<在字符集中出现的次数
			if(count(prefix.toCharArray(),ch)<count(arr,ch)) {
				test3(prefix+ch,arr);
			}
		}
	}
	
	private static int count(char[] arr,char ch) {
		int cnt=0;
		for(char c:arr) {
			if(c==ch)cnt++;
		}
		return cnt;
	}

	public static void main(String[] args) {
		System.out.println(test1("abc"));
		System.out.println(test2("abc",2));
		System.out.println(test3("abc"));

	}

}
