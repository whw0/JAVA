package objectotiented3;
//匿名内部类
public class InnerClass3 {
	public OutInterface2 inf() {
		return new OutInterface2() {
			
			private int i=0;
			String s="ssssss";
			
			public int getValue() {
				System.out.println(s);
				return i;
			}
		};
	}
	

	public static void main(String[] args) {
		InnerClass3 s=new InnerClass3();
		OutInterface2 b=s.inf();
		b.getValue();

	}

}

interface OutInterface2{

	int getValue();
	
}
