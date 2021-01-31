package objectoriented2;

/*
 * 只能有一个父类
 * */

public class Demo {
	@Override
	public String toString() {
		return "我是Demo";
	}
	
	
  public static void main(String[] args) {
	  Computer cp=new Computer();
	  Pad ipad=new Pad();
	  ipad.startUp();
	  ipad.Use();
	  cp.Use();
      
  }
}
