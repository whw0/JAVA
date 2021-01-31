package 竞赛经典算法案例;
/*
 * 题目描述
素数环:从1到n这n个数摆成一个环，要求相邻的两个数的和是一个素数。如，n=8是，素数环为：

1 2 3 8 5 6 7 4

1 2 5 8 3 4 7 6

1 4 7 6 5 8 3 2

1 6 7 4 3 8 5 2

其总数为4

输入
n的值（n不大于15）

输出
打印素数环并输出数量，如果不存在素数环则输出 “no solution！”（不输出双引号）。

这个题是深搜题，给定素数环中第一个值1后，之后就可以每次从2到n开始试探着往里填了，注意在过程中排除非素数、相邻两数和为素数、不能出现重复的数基本就可以了，因为着些值组成的是环因此最后还须判断头尾之和是否为素数。


 * */
import java.util.Scanner;
public class case补dfs素数环 {
    static int cnt=0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] res = new int[n];
        res[0] = 1;//默认第一个为1
        dfs(res,n,1);
        if(cnt==0) {
            System.out.println("no solution!");
        }else {
            System.out.println(cnt);
        }
    }
    
    /**
     *
     * @param r 保存结果
     * @param n 素数的个数
     * @param k 当前个数
     */
    static void dfs(int[] r,int n,int k) {
        if(k == n && isSu(r[0]+r[k-1])) {
            printRes(r);
            cnt++;
            return;
        }
        for(int i=2;i<=n;i++) {
            if(check(r,k,i)) {
                r[k] = i;
                dfs(r,n,k+1);
                r[k] = 0;//可省略回溯
            }
        }
    }
    
    //打印素数环
    private static void printRes(int[] r) {
        for(int i=0;i<r.length;i++) {
            System.out.print(r[i]+"  ");
        }
        System.out.println();
    }
    /**
     *
     * @param r 存储数组
     * @param k 当前素数个数
     * @param i 是否可以填的值
     * @return
     */
    private static boolean check(int[] r,int k,  int i) {
        if(!isSu(r[k-1]+i))return false;//k-1是第k个素数在数组的中的位置
        for(int j=0;j<k;j++)if(i==r[j])return  false;//确保与之前的数没有重复的
        return true;
    }
    //判断是否为素数
    private static boolean isSu(int i) {
        for(int j=2;j<i;j++) {
            if(i%j == 0) return false;
        }
        return true;
    }
}