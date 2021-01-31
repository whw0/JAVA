package 竞赛经典算法案例;
/*
 * *从昏迷中醒来,小明发现自己被关在X星球的废矿车里。
矿车停在平直的废弃的轨道上。
他的面前是两个按钮，分别写着“F”和“B"。
小明突然记起来，这两个按钮可以控制矿车在轨道上前进和后退。
按F，会前进97米.按B会后退127米.
透过昏暗的灯光，小明看到自己前方1米远正好有个监控探头.
他必须设法使得矿车正好停在摄像头的下方，才有机会争取同伴的援助.
或许，通过多次操作F和B可以办到.
矿车.上的动力已经不太足，黄色的警示灯在默默闪烁.
每次进行F或B操作都会消耗-定的能量.
小明飞快地计算，至少要多少次操作，才能把矿车准确地停在前方1米远的地方.
 * */
public class case5一步之遥 {
	
	//得出公式97x+127y=1  //用欧几里得拓展
	static int x,y;
	
	public static void EucEx(int m,int n) {
		if(n==0) {
			x=1;
			y=0;
			return;
		}
		EucEx(n,m%n);
		int d=y;
		y=x+m/n*y;
		x=d;
	}

	public static void main(String[] args) {
		EucEx(97,127);
		System.out.println(Math.abs(x)+Math.abs(y));

	}

}
