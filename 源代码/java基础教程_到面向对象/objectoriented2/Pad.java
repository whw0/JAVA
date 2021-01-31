package objectoriented2;

public class Pad extends Computer{//父类
	void Use() {//方法重写
		System.out.println("触屏");
	}
	
	/*super.property
	 * super.method();
	 * 
	 * */
	
	void startUp() {
		super.startUp();
		System.out.println("平板已经启动");
	}

}
