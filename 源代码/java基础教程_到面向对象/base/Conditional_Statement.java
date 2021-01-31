package base;
/*
 * if条件语句
 * if 
 * if else
 * if 
 * else if
 * 
 * switch语句
 * switch(用于判断的参数){ 可以是整数 枚举 字符串
 * case 常量表达式1:语句1；[break;]
 * case 常量表达式2:语句2；[break;]
 * case 常量表达式n:语句n；[break;]
 * [default]:语句n+1;[break;]
 * }
 * 
 * 循环语句
 * while(布尔表达式){
 * 语句
 * }
 * 
 * do{
 * }while(布尔表达式)
 * 
 * for(初始化表达式1;布尔表达式;表达式){}
 * 
 * 循环控制
 * continue;
 * break;
 * */
public class Conditional_Statement {
	public static void main(String arg[]) {
		int grade=10;
		switch(grade) {
		case 10:
		case 9:System.out.println("成绩为优秀");break;
		case 8:System.out.println("成绩为良");break;
		case 7:
		case 6:System.out.println("成绩为中");break;
		case 5:
		case 4:
		case 3:
		case 2:
		case 1:System.out.println("成绩为差");break;
		default:System.out.println("成绩为无效");break;
		}
	
}

}
