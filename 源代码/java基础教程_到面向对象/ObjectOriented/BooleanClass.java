package ObjectOriented;
/*
 * Boolean类
 * Boolean(boolean value)
 * Boolean(String str)
 * 
 * */
public class BooleanClass {
	public static void main(String[] args) {
		System.out.println(Boolean.TRUE);
		System.out.println(Boolean.FALSE);
		System.out.println("-----------------");
		Boolean b1=new Boolean(true);
		Boolean b2=new Boolean(" ");//默认为false
		
		Boolean b3=Boolean.valueOf(false);
		Boolean b4=Boolean.valueOf("true");//若为true则为true 其他字符串均为false
		
		boolean boo1=Boolean.parseBoolean("ok");
		System.out.println(boo1);
	}

}
