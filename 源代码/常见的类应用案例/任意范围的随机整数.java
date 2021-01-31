package 常见的类应用案例;

/*
 * Math.random()随机返回[0,1)之间的一个double数
 * 有办法得到任意范围内的随机整数和随机浮点数吗
 * 
 * (int)(Math.random()*10)
 * 50+(int)(Math.random()*50)
 * a+Math.random()*b
 * */
public class 任意范围的随机整数 {

	public static void main(String[] args) {
		//产生[a,b]随机整数
		//a+random()*(b-a-1)
		int a=1;
		int b=100;
		int r=a+(int)(Math.random()*(b-a+1));
		System.out.println(r);

	}

}
