package 常见的类应用案例;

public class Case8_读出金额 {

	public static void main(String[] args) {
		double total=89735.12;
		double start=10000;
		int a[]=new int[7];
		char b[]= {'万','千','百','十','元','角','分'};
		for(int i=0;i<7;i++) {
			System.out.println(total+"   "+start);
		    a[i]=(int)(total/start);
		    total=total%start;
		    start=start/10;
		}
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+""+b[i]);
		}
		
	    

	}

}
