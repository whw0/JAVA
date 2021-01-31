package ObjectOriented;

public class ByteClass {

	public static void main(String[] args) {
		Byte a=new Byte((byte) 15);
		Byte b=new Byte("15");//这些在jdk12中已经过时
		
		Byte c=15;
		Byte d=Byte.valueOf((byte) 15);
		Byte e=Byte.valueOf("15");
		Byte f=15;//自动装箱
		
		System.out.println(Byte.MAX_VALUE);
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.TYPE);
		
		String s="100";
        Byte b6=Byte.valueOf(s).byteValue();
        Byte b7=Byte.parseByte(s);
        System.out.println(b6);
        System.out.println(b6==b7);
	}

}
