package 常用类;
/* 一个工具类
 * 功能1：大写金额
 * */
public class Tranliteration {

	public static String amountInWords(double n){	
		/*
		 * 大写金额
		 * 给定5位整数2位小数的金额，请将其转换为中文大写金额
		 * 89735.12->捌万玖仟柒佰叁拾伍圆壹角贰分
		 * */
		int total=(int) (n*100),tmp,i=0;
		int start=1000000;
		String digt="万仟佰拾圆角分";
		String s="零壹贰参肆伍陆柒捌玖拾";
		String result="";
		while(start!=0){
			tmp=total/start;
			total=total%start;
			start/=10;
			result=result+s.charAt(tmp)+digt.charAt(i++);
		}
		return result;
	}
	
	


}
