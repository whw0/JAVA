package base;

import java.util.Date;

/*
 * 字符串几种构造方法
 * String a="时间就是金钱,我的盆友";
 * 
 * String a=new String("我爱吃火锅");
 * String b=new String(a);
 * 
 * char[] charArray={'t','i','m','e'};
 * String a=new String(charArray);
 * 
 * 
 * char[] charArray={'t','i','m','e'};
 * String a=new String(charArray,1,2);  a="im"
 * 
 * 字符串得拼接 String b=a+"abc";
 * 
 * 取得字符串长度
 * int size=a.length();
 * 
 * 判断子字符串是否存在:
 * str.indexOf("b");
 * 如果返回值大于等于0则存在
 * 若为-1则为false
 * 
 * public int indexOf(String str,int fromIndex) fromIndex为起始位置
 * String str="We are the world";
 * int index=str.indexOf("e",3);
 * 
 * 
 * 获取指定得字符的方法
 * String name="Peter";
 * char ch=name.charAt(0); 得到'P'
 * 
 * 截取字符串:
 * 1.public String substring(int beginIndex) 指定开始的位置
 * 2.public String substring(int beginIndex,int endIndex) 开始位置和结束位置
 * String id="123456789";
 * System.out.println(id.substring(2, 5));
 * 
 * 去除首位空白内容
 * public String trim()
 * String str="  abc   ";
 * String shortStr=str.trim();
 * 
 * 去除字符串中所有空白内容
 * String str="a b cd   e";
 * String shortstr=str.replaceAll("\\s","");
 * 
 * 三种字符串替换方式:
 * public String replace()旧字符序列换成新字符序列
 * public String replaceAll()将旧字符串或正则表达式内容，替换成新字符串
 * public String replaceFirst() 替换一次
 * 
 * 
 * 判断字符串结尾/开头内容
 * String fileName="HelloWorld.java";
 * Boolean bool1=fileName.endsWith(".java");
 * Boolean bool2=fileName.startsWith("Hello");
 * 
 * 为什么会不相等?
 * String name=new String("tom");
 * String dbValue=new String("tom");
 * name==dbValue;  它们为false
 * 系统为它们分配了两个不同的空间
 * 如何判断字符串内容是否相等
 * public boolean equals(String anotherString)
 * String name=new String("tom");
 * String dbValue=new String("tom");
 * boolean bool=name.equals(dbValue);
 * 
 * 忽略大小写比较
 * public boolean equalslgnoreCase(String anotherString);
 * 
 * String name="tom";
 * String dbValue="tom";
 * name==dbValue; true
 * 
 * 大小写转换
 * public String toUpperCase();
 * public String toLowerCase();
 * 
 * 字符串分割
 * public String[] split(String regex);
 * public String[] split(String regex,int limit);
 * 
 * 格式化字符串
 * String.format(String format,Object...args);
 * 
 * 正则表达式
 * */

public class String_User{
	public static void main(String args[]) {
		
//	String a="8IIBI";
//	String b="sssss";
//	if(a.indexOf('B')>0) {
//		System.out.println("存在该字符");
//	}
//	else if(a.indexOf('B')==-1) {
//		System.out.println("不存在该字符");
//	}
	
//		String id="123456789";
//		System.out.println(id.substring(2, 5));
		
//		String str="馒头一文一个";
//		String replaceStr=str.replace("一", "二");
//		System.out.println(replaceStr);
		
//		String str="abc,def,ghi";
//		String[] strArray=str.split(",");
//		for(String cycle:strArray) {
//			System.out.println(cycle);
//		}
//		
//		String[] str2Array=str.split(",", 2);
//		for(String cycle:str2Array) {
//			System.out.println(cycle);
//		}

//		Date date=new Date();
//		String str=String.format("%tF",date);
//		System.out.println(date);
//		System.out.println(str);
		
		String str1=String.format("字母x大写%c:", 'X');
		System.out.println(str1);
		System.out.println(String.format("%.2f",Math.PI));
	
	}
}
