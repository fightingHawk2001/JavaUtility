package com.hawk.fighting.algorithm;

/**
 * 递归算法：将方法（函数）调用自身的过程称为递归，调用自身的方法称为递归方法，用递归方式解决问题的算法称为递归算法
 *
 * @author fightingHawk Email: <a href="mailto:fightingHawk2001@outlook.com">fightingHawk2001@outlook.com</a>
 * @version 1.0.0
 */
public class Recursion {
    /**
     * 求阶乘
     *
     * @param num 计算阶乘的数字
     * @return 阶乘值
     * @throws IllegalArgumentException 传入参数为非正整数数时抛出此异常
     */
    public static long factorial(int num) {
        if (num <= 0) {
            throw new IllegalArgumentException("num = " + num);
        } else {
            if (num == 1) {
                return 1;
            } else {
                return num * factorial(num - 1);
            }
        }
    }

    /**
     * 求num以内自然数的和
     *
     * @param num 自然数
     * @return 和
     * @throws IllegalArgumentException 传入参数为非自然数时抛出此异常
     */
    public static int natureSum(int num) {
        if (num < 0) {
            throw new IllegalArgumentException("num = " + num);
        } else {
            if (num == 0) {
                return 0;
            } else {
                return num + natureSum(num - 1);
            }
        }
    }

    /**
     * 获取斐波那契数列
     *
     * @param array  存放数列的数组
     * @param length 数组的长度
     * @return 数列中最后一个值
     */
    private static int fibonacciSequence(int[] array, int length) {
        if (array.length == 0) {
            return 0;
        } else {
            if (length == 1) {
                array[length - 1] = 1;
            } else if (length == 2) {
                array[length - 1] = 1;
                array[length - 2] = 1;
            } else {
                array[length - 1] = fibonacciSequence(array, length - 1) + fibonacciSequence(array, length - 2);
            }
            return array[length - 1];
        }
    }

    /**
     * 获取斐波那契数列
     *
     * @param length 数组长度
     * @return 存放数列的数组
     */
    public static int[] fibonacci(int length) {
        int[] array = new int[length];
        fibonacciSequence(array, length);
        return array;
    }

}
