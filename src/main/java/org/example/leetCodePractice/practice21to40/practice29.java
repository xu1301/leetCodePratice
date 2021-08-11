package org.example.leetCodePractice.practice21to40;

/**
 * @Author xuxinyao
 * @Description: TODO
 * @Date 2021/7/4/11:56
 */
public class practice29 {
    //给定两个整数，被除数 dividend 和除数 divisor。将两数相除，要求不使用乘法、除法和 mod 运算符。
    //
    //返回被除数 dividend 除以除数 divisor 得到的商。
    //
    //整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8 以及 truncate(-2.7335) = -2
    //
    // 
    //
    //示例 1:
    //
    //输入: dividend = 10, divisor = 3
    //输出: 3
    //解释: 10/3 = truncate(3.33333..) = truncate(3) = 3
    //示例 2:
    //
    //输入: dividend = 7, divisor = -3
    //输出: -2
    //解释: 7/-3 = truncate(-2.33333..) = -2
    public static void main(String[] args) {
        divide(2147483647
                ,2);
    }

    /**
     *  对除数位运算，等于 *2^n，等到大于被除数，再减去m个除数至 <= 被除数
     *  商即为 n-m
     *  考虑越界情况，每次进行位运算之后，判断是否 <=  (MAX>>2)，若大于，则加m个除数
     *
     *  todo 未通过 超时
     */
    public static int divide(int dividend, int divisor) {
        if (divisor == 0) {
            return 0;
        }
        if (dividend == Integer.MIN_VALUE) {
            if (divisor == -1) {
                return Integer.MAX_VALUE;
            }
        }
        int temp = Math.abs(divisor);
        int n = 0;
        int m = 0;
        int border = Integer.MAX_VALUE >> 1;
        boolean isPos = (dividend > 0) == (divisor > 0);
        boolean reduce = true;
        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);
        while (divisor < dividend) {
            divisor = divisor << 1;
            n++;
            if (divisor >= border) {
                reduce = false;
                break;
            }
        }

        if (reduce) {
            while (divisor > dividend) {
                divisor -= temp;
                m++;
            }
        } else {
            while (divisor < dividend) {
                divisor += temp;
                m++;
            }
            if (divisor > dividend) {
                m--;
            }
        }
        int result = 1 << n;
        if (reduce) {
            result = result - m;
        }else {
            result = result + m;
        }
        return isPos ? result : -result;
    }
}
