package 常见的类应用案例;
/*
 * 已知:
 *   System.currentTimeMillis() 返回1970-1-1零点至今的毫秒数,long型
 *   
 *   输出系统当前时间,格式为 时:分:秒
 *   
 *   不能调用Date或Calendar API
 * */

public class 当前时间 {

	public static void main(String[] args) {
		long totalms=System.currentTimeMillis();//0区
		long totals=totalms/1000;
		long currents=totals%60;
		
		long totalmin=(totals-currents)/60;
		long currentmin=totalmin%60;
		
		long totalh=(totalmin-currentmin)/60;
		long currenth=totalh%24;
		System.out.println(String.format("%dH:%dM:%dS", currenth+8,currentmin,currents));//需要加8 我们在东八区

	}

}
