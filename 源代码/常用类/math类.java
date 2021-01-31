package 常用类;

public class math类 {

	public static void main(String[] args) {
		/*
		 * Math.min(int a, int b)
           Math.min(float a, float b)
           Math.min(double a, doubleb)
           Math.min(long a, long b)
           Math.max(int a, int b)
           Math.max(float a, float b)
           Math.max(double a, doubleb)
           Math.max(long a, long b)
		 * */
		
		Integer a=16;
		Double b=Math.sqrt(a);//求平方根
		Integer c=-16;
		Math.abs(c); //返回一个绝对值
		
		Math.pow(2,3);//求幂
		
		Double d=2.4523;
		//向上取整
		Math.ceil(d);
		//向下取整
		Math.floor(d);
		//四舍五入取整
		Math.round(d);
		
		//得到一个随机数 Math.random() 生成一个[0,1)之间的double类型的伪随机数
		int ae = (int)(Math.random()*(b - a + 1) + a);  // + 1 是因为random()最大取不到1,所以上限取整后就会少1. 
				
		//各种三角函数		
	}

}
