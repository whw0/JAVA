package 常用类;


/*
将介绍String、StringBuilder类的常用方法。
在java中String类不可变的，创建一个String对象后不能更改它的值。
所以如果需要对原字符串进行一些改动操作，就需要用StringBuilder类或者StringBuffer类，
StringBuilder比StringBuffer更快一些，缺点是StringBuilder不是线程安全的，
但在算法竞赛中一般我们用不到多线程。
所以，主要推荐使用StringBuilder类。
 * */
public class String类 {
	public static void main(String[] args) {
		//String类的遍历
		String s="123456";
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		
		char s1[]=s.toCharArray();
		for(int i=0;i<s1.length;i++) {
			System.out.println(s1[i]);
		}
		
		//compareTo(String anotherString)//按字典顺序比较两个字符串
		//compareToIgnoreCase(String anotherString)//按字典顺序且不区分大小写比较两个字符串
		//equals(String anotherString)//判断两个字符串是否相等，相等返回true否则返回false
		//equalsIgnoreCase(String str)//同上，不区分大小写。
		
		//搜索子字符串
		//indexOf(int ch);// 返回指定字符在此字符串中第一次出现的索引
		//indexOf(int ch, int fromindex); // 同上， 从指定索引开始搜索
		//indexOf(String str);//返回子串在此字符串中第一次出现的索引
		//indexOf(String str, int fromindex);同上，从指定索引开始搜索
		String s11="12";
		int f = s.indexOf(s11); // 从索引0开始搜索
		int f1 = s.indexOf(s11, 6); // 从索引6开始搜索
		int f2 = s.lastIndexOf(s11); 
		Boolean f3 = s.startsWith("12");
		System.out.println(f); // 2
		System.out.println(f1);// -1
		System.out.println(f2);// 5
		System.out.println(f3);// true
		
		//split(String regex); // 根据正则表达式拆分
		String s2 = "ABC DEF";
		String s3[] = s2.split(" ");//根据空格拆分
		System.out.println(s3[0]);// ABC
		System.out.println(s3[1]);// DEF
		
		//substring(int beginIndex, int endIndex)；//返回从begin开始到end-1结束的子串
		//replaceAll(String s1,String s2);//用s2替换目标字符串中出现的所有s1
		//replaceFirst(String s1,String s2);//用s2替换目标字符串中出现的第一个s1
		
		//toUpperCase(); //将此字符串中的所有字母都换为大写
		//toLowerCase()//将此字符串中的所有字母都换为小写
		
		
		//将其他类型的数据转化为字符串
		int a = 10;
		String s4 = String.valueOf(a);
		System.out.print(s4); // 10
		
		
		
		
		//StringBulider
		//一个可变的字符序列
		
		StringBuilder s5=new StringBuilder("12356");
		//遍历和String类一样 用charAt即可
		
		/*
		 * append(String str);//在此字符串追加str。
           append(StringBuilder str);//在此字符串追加str。
           append(char[] str, int offset, int len);//将char的子数组追加到此字符串
           delete(int start, int end);//移除此序列从start到end-1的字符串
           deleteCharAt(int index);//移除指定索引上的char
           
           setCharAt(int index, char ch);//将指定索引处的字符替换为ch
           indexOf(String str);//返回子字符串第一次出现的索引
           indexOf(String str, int fromIndex);//同上，从指定位置查找

           lastIndexOf(String str);//返回子字符串最后一次出现的索引
           lastIndexOf(String str, int fromIndex);//同上，从指定位置查找
           
           reverse();//将此字符串反转
           substring(int start);//返回此字符串从start开始至length-1结束的String
           substring(int start, int end);//返回此字符串从start开始至end-1结束的String
           toString();//返回此序列中的String表示形式。
           (注意以上方法的返回值都是String而不是StringBuilder)
		 * */
	}

}
