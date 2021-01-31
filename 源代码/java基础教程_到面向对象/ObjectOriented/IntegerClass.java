package ObjectOriented;
//包装类-Integer
/*
 * 数据类型->包装类->对象
 * 
 * Byte->byte       Float->float
 * Short->short     Double->double
 * Integer->Integer Boolean->boolean
 * Long->long       Character->char
 * 
 * Integer(int number)
 * Integer(String str)
 * */
public class IntegerClass {
	public static void main(String[] args) {
		System.out.println("int的最大值:"+Integer.MAX_VALUE);
		System.out.println("最小值"+Integer.MIN_VALUE);
		System.out.println("int类型的长度"+Integer.SIZE);
		System.out.println("int类型"+Integer.TYPE);
		
		System.out.println("--------------");
		
		Integer inte1=new Integer(123);
		System.out.println(inte1);
		Integer inte2=new Integer("12345");
		System.out.println(inte2);
		Integer inte3=Integer.valueOf(123);//无论是输入字符串或数字，均返回一个int数字对象
		System.out.println(inte3+1);
		Integer inte4=Integer.valueOf("123");
		System.out.println(inte4+1);
		
		System.out.println("--------------");
		
		int num1=Integer.parseInt("12345");//转为int
		System.out.println(num1+2);
		int num2=inte2.intValue();  //转为int 也有doubleValue...
		String str1=Integer.toBinaryString(11);
		System.out.println(str1);
		String str2=Integer.toHexString(11);
		System.out.println(str2);
		String str3=Integer.toOctalString(11);
		System.out.println(str3);
		String str4=Integer.toString(2);//转化成String
		System.out.println(str4+1);
		String str5=Integer.toString(11, 16);//转为16进制
		System.out.println(str5);
		
		System.out.println("--------------");
		
		Integer a=13;//
		System.out.println(a);
		
	}

}
