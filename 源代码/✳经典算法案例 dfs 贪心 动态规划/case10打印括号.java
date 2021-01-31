package 竞赛经典算法案例;

import java.util.HashSet;
import java.util.Set;

/*
 * 实现一种算法，打印n对括号的全部有效组合（即左右括号正确配对）
 *  输入：3
 *  输出((())),(()()),()(()),()()()
 * */
public class case10打印括号 {
	public static Set<String> test1(int n){
		Set<String> theNew=new HashSet<>();
		if(n==1) {
			theNew.add("()");
			return theNew;
		}
		Set<String> oldNew=test1(n-1);
		for(String x:oldNew) {
			theNew.add("()"+x);
			theNew.add("("+x+")");
			theNew.add(x+"()");
		}
		return theNew;
	}

	public static void main(String[] args) {
		System.out.println(test1(3));

	}

}
