package com.hawk.fighting.util;

/**
 * 数学工具类
 *
 * @author fightingHawk Email: <a href="mailto:fightingHawk2001@outlook.com">fightingHawk2001@outlook.com</a>
 * @version 1.0.0
 */
public class MathUtil {
    /**
     * 实现指定精度的四舍五入
     *
     * @exception IllegalArgumentException 精度越界时抛出此异常
     * @param num       需要四舍五入的数
     * @param precision 保留精度 [0 ~ 14]
     * @return 四舍五入之后的数
     */
    public static double round(double num, int precision) {
        if (precision >= 15 || precision <= -1) {
            throw new IllegalArgumentException("precision = " + precision + " ∉ [0 ~ 14]");
        }
        long power = (long) Math.pow(10, precision + 1);
        long temp = (long) (num * power);
        double res;
        if (temp % 10 >= 5) {
            temp += 10;
        }
        res = (double) (temp / 10) / Math.pow(10, precision);
        return res;
    }

    /**
     * 实现指定精度的舍去
     *
     * @exception IllegalArgumentException 精度越界时抛出此异常
     * @param num       需要舍去的数
     * @param precision 保留精度 [0 ~ 14]
     * @return 舍去之后的数
     */
    public static double ceil(double num, int precision) {
        if (precision >= 15 || precision <= -1) {
            throw new IllegalArgumentException("precision = " + precision + " ∉ [0 ~ 14]");
        }
        long power = (long) Math.pow(10, precision + 1);
        long temp = (long) (num * power);
        return (double) ((temp + 10) / 10) / Math.pow(10, precision);
    }

    /**
     * 实现指定精度的进一
     *
     * @exception IllegalArgumentException 精度越界时抛出此异常
     * @param num       需要进一的数
     * @param precision 保留精度 [0 ~ 14]
     * @return 进一之后的数
     */
    public static double floor(double num, int precision) {
        if (precision >= 15 || precision <= -1) {
            throw new IllegalArgumentException("precision = " + precision + " ∉ [0 ~ 14]");
        }
        long power = (long) Math.pow(10, precision + 1);
        long temp = (long) (num * power);
        return (double) (temp / 10) / Math.pow(10, precision);
    }

    /**
     * 计算三角形的面积
     *
     * @exception IllegalArgumentException 三条边不能构成三角形时抛出此异常
     * @param a 三角形的边
     * @param b 三角形的边
     * @param c 三角形的边
     * @return 三角形的面积
     */
    public static double areaOfTriangle(double a, double b, double c) {
        if (a + b <= c) {
            throw new IllegalArgumentException(a + " + " + b + " = " + (a + b) + " ≤ " + c + ")");
        } else if (a + c <= b) {
            throw new IllegalArgumentException(a + " + " + c + " = " + (a + c) + " ≤ " + b + ")");
        } else if (b + c <= a) {
            throw new IllegalArgumentException(b + " + " + c + " = " + (b + c) + " ≤ " + a + ")");
        } else {
            double p = (a + b + c) / 2;
            return Math.sqrt(p * (p - a) * (p - b) * (p - c));
        }
    }

    /**
     * 通过循环方式实现获取斐波那契数列
     *
     * @param length 数列长度
     * @return 斐波那契数列数组
     */
    public static int[] fibonacci(int length) {
        int a, b = 0, c = 1;
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            array[i] = c;
            a = b;
            b = c;
            c = a + b;
        }
        return array;
    }
}
