package ObjectOriented;

public class DoubleClass {

	public static void main(String[] args) {
		//和byte等数字类型包装类一样有 MAX MIN SIZE TYPE
		Double num1=new Double(11.23);
		Double num2=new Double("11.23");
		
		Double num3=Double.valueOf(11);
		Double num4=Double.valueOf("11");
		System.out.println(num4+11);
		
		//intValue... toHexString...
		Number num=new Double(1200.34);
		//Number num5=new Boolean(true);
		Number num6=new Long(2222);

	}

}
