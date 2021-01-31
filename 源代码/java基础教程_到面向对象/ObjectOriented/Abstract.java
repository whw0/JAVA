package ObjectOriented;

public abstract class Abstract {//抽象类不能实例化
	//抽象方法只需声明无需实现
	//继承的子类必须重写
	abstract public void show();

}

class Red extends Abstract{
	public void show(){
		System.out.println("红色");
	}
}
