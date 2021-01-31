package 数学思想;

public class 判断质数和用算数基本定理分解质因数 {
    /*
     * 质数
              质数又称为素数，是指大于1的并且除了1和它本身外，没有其他因数的自然数。

              判断一个数是否是质数
        假设该数为n， 我们只需要判断[2,sqrt(n)]内是否有n的因子。如果有，则n为合数，否则，n为质数。
       这种方法被称为试除法， 即试着除一下所有可能的因子。
     * */
	
	public static Boolean isprime(int n){
	    if(n == 1) return false;
	    for(int i = 2; i <= n / i; i++){
	        if(n % i == 0){
	            return false;
	        }
	    }
	    return true;
	}
	/*
	 * 分解质因数
	 * 如：
12 = 2 2 ∗ 3 12 =2^2*3 
2
 ∗3
20 = 2 2 ∗ 5 20 = 2^2*5 
2
 ∗5
30 = 2 ∗ 3 ∗ 5 30 = 2*3*5

接下来我们利用这个公式分解质因数。
设一个质数为p.如果n%p == 0，那么p就是n的一个质因数，接下来就是求p的指数，我们让n = n/p, 这样就从n中剔除了一个p,接着重复上述两步，直到n%p ！= 0

代码：
	 * */
	
	
public static void prime(int n){
	    for(int i = 2; i <= n / i; i++){
	        int a = 0, b = 0;
	        while(n % i == 0){
	            a = i;
	            n /= i;
	            b++;
	        }
	        if(b > 0)
	            System.out.println(a + " " + b);
	    }
	    if(n > 1) System.out.println(n + " " + 1);
	}
	
	//埃氏筛法和欧拉筛法。
	
	//先看看一种暴力筛法
	
	  static final int N = 1000000;
	  static int[] st = new int[N];//初始化为0， 0表示质数，1表示合数
  public static void t(int n) {

	for(int i = 2; i <= n; i++){
		for(int j = 2; j <= i / j; j++){//试除法
			if(i % j == 0){
				st[i] = 1; // 合数，标记为1 
			}
		}
	}
  }
  
  /*
   * 这种方式无疑是最慢的，我们看一下如何加快，换一种思路
   * 一个质数的倍数一定是合数
   * */
  public static void E_sieve(int  n){

  	for(int i = 2; i <= n / i; i++)
  	{
  		if(st[i] == 0)
  		{
  			for(int j = i * i; j <= n; j += i)
  			    st[j] = 1; // j是i的一个倍数，j是合数，筛掉。
  		}
  	}
  	
    
  }
  
  static int[] primes = new int[N];
  
  static int cnt = 0;
  
  public static void ola(int n){
      
      for(int i = 2; i <= n; i++)
      {
          if(st[i] == 0)	
        	  primes[cnt++] = i;
          
          for(int j = 0; primes[j] <= n / i; j++)
          {
              st[primes[j]*i] = 1;
              if(i % primes[j] == 0) break;
          }
      }
  }
  





	public static void main(String[] args) {
		

	}

}
