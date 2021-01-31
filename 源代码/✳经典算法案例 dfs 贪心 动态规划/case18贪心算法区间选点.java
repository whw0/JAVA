package 竞赛经典算法案例;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 输入：

n（表示n个区间）

接下来n行输入 （每行三个数）

每个区间的开始时间 结束时间  含有点的个数

输出：

最少需要多少点
　　题目的大致意思是，给定n个闭区间，并且这个闭区间上的点都是整数，现在要求你使用最少的点来覆盖这些区间并且每个区间的覆盖的点的数量满足输入的要求点覆盖区间的数量。

　　输入：

　　　　第一行输入n，代表n个区间。

　　　　接下来的n行每行的第一个数代表区间起点，第二个数代表区间终点，第三个数代表这个区间必须要选取的点的数量。
 * */

public class case18贪心算法区间选点 {

	 /*
		 *思路：(1)首先将每个任务的开始时间、结束时间、需要包含的点封装在对象中，并按照结束时间递增排序（结束时间相同，按照开始时间递增排序）
		 *    (2)依次遍历每一个区间
		 *    	      查找该区间已存在的点
		 *          如果已存在的点==其需要的点，则继续遍历下一个区间
		 *          如果已存在的点<其需要的点，则从右向左为其分配点，并更新其所需的点，直到其所需的点为0
		 *关键：判断某个点是否已存在：建立一个数组axs作为数轴，其范围1~所有任务中最晚的结束时间，如果位置i已经设点，将axs[i]=1
		 *测试数据：
	5
	3 7 3
	8 10 3
	6 8 1
	1 3 1
*/

	private static class Interval implements Comparable<Interval>{
        int s;
        int t;
        int c;

        public Interval(int s, int t, int c) {
            this.s = s;
            this.t = t;
            this.c = c;
        }

        @Override
        public int compareTo(Interval other) {
            int x = this.t - other.t;
            if(x == 0)
                return this.s - other.s;
            else
                return x;
        }
    }

    /**
     * 统计axis上s-t区间已经有多少个点被选中
     */
    private static int sum(int[] axis, int s, int t){
        int sum = 0;
        for(int i = s; i <= t; i++){
            sum += axis[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Interval[] intervals = new Interval[n];
        for(int i = 0; i < n; i++){
            intervals[i] = new Interval(in.nextInt(), in.nextInt(), in.nextInt());
        }
        Arrays.sort(intervals);    //按区间右端点排序

        int max = intervals[n-1].t;    //右端最大值
        int[] axis = new int[max+1];    //标记数轴上的点是否已经被选中
        //int[] sums = new int[max+1];
        for(int i = 0; i < n; i++){
            //1.查阅区间中有多少个点
            int s = intervals[i].s; //起点
            int t = intervals[i].t; //终点
            int cnt = sum(axis, s, t);    //找到这个区间已经选点的数量，sum[t]-sum[s-1];低效率

            //2.如果不够，从区间右端开始标记，遇标记过的就跳过
            intervals[i].c -= cnt; //需要新增的点的数量
            while(intervals[i].c > 0){
                if(axis[t] == 0){ //从区间终点开始选点
                    axis[t] = 1;
                    intervals[i].c--;    //进一步减少需要新增的数量
                    t--;
                }else{    //如果这个点已经被选过了
                    t--;
                }
            }
        }
        System.out.println(sum(axis, 0, max));
    }

}
