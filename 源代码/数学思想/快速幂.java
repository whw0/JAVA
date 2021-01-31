package 数学思想;

public class 快速幂 {
	static int mod=1000000;
	
	public static int qmi(int a, int b){ //求 a^b
		int res = 1; // res保存结果
		while(b != 0){
			if((b & 1) == 1){ //如果k的二进制数的最后一位是 1。 比如1011 & 1 = 1
				res = (res * a) % mod;//取模， 防止结果溢出。
			}
			a = a * a % mod;//得到 a^1, a^2, a^4, a^8, .....
			b = b >> 1; //将b右移一位，去掉最低位。为了开始判断下一位。
		}
		return res;
	}


	public static void main(String[] args) {
		

	}

}
