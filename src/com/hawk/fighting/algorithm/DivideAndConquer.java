package com.hawk.fighting.algorithm;

/**
 * 分治算法：分治算法中，“分治”即“分而治之”的意思。
 * <p>
 * 分治算法解决问题的思路：
 * <ul style="list-style: none">
 *     <li>1. 将整个问题拆分成多个相互独立且数据量更少的小问题</li>
 *     <li>2. 逐一解决这些简单的小问题</li>
 *     <li>3. 最终合并找到解决整个问题的方案</li>
 * </ul>
 *
 * @author fightingHawk Email: <a href="mailto:fightingHawk2001@outlook.com">fightingHawk2001@outlook.com</a>
 * @version 1.0.0
 */
public class DivideAndConquer {

    /**
     * 记录汉诺塔移动次数
     */
    private static int hanoiCount = 1;

    /**
     * 通过分治算法实现查找数组中的最大值
     *
     * @param array 数组
     * @return 最大值
     */
    public static int max(int[] array) {
        if (array.length == 0) {
            throw new NegativeArraySizeException("length = " + array.length);
        } else {
            return max(array, 0, array.length - 1);
        }
    }

    /**
     * 通过分治算法实现查找数组中的最大值
     *
     * @param array 数组
     * @param left  左边界
     * @param right 右边界
     * @return 最大值
     */
    private static int max(int[] array, int left, int right) {
        if (right - left <= 1) {
            return Math.max(array[left], array[right]);
        } else {
            int middle = (right - left) / 2 + left;
            int leftMax = max(array, left, middle);
            int rightMax = max(array, middle + 1, right);
            return Math.max(leftMax, rightMax);
        }
    }

    /**
     * 通过分治算法实现查找数组中的最小值
     *
     * @param array 数组
     * @return 最小值
     */
    public static int min(int[] array) {
        if (array.length == 0) {
            throw new NegativeArraySizeException("length = " + array.length);
        } else {
            return min(array, 0, array.length - 1);
        }
    }

    /**
     * 通过分治算法实现查找数组中的最小值
     *
     * @param array 数组
     * @param left  左边界
     * @param right 右边界
     * @return 最小值
     */
    private static int min(int[] array, int left, int right) {
        if (right - left <= 1) {
            return Math.min(array[left], array[right]);
        } else {
            int middle = (right - left) / 2 + left;
            int leftMin = min(array, left, middle);
            int rightMin = min(array, middle + 1, right);
            return Math.min(leftMin, rightMin);
        }
    }

    /**
     * 汉诺塔问题
     *
     * @param num       圆盘数量
     * @param source    起始柱
     * @param target    目标柱
     * @param auxiliary 辅助柱
     */
    private static void hanoiSolve(int num, String source, String target, String auxiliary) {
        if (num == 1) {
            // 如果只有一个圆盘，则直接从起始柱移动到目标柱
            System.out.println("第" + hanoiCount++ + "步，从" + source + "移动到" + target);
        } else {
            // 1. 将起始柱上的 n - 1 个圆盘移动到辅助柱上
            hanoiSolve(num - 1, source, auxiliary, target);
            // 2. 将起始柱上的   1   个圆盘移动到目标柱上
            System.out.println("第" + hanoiCount++ + "步，从" + source + "移动到" + target);
            // 3. 将辅助柱上的 n - 1 个圆盘移动到目标柱上
            hanoiSolve(num - 1, auxiliary, target, source);
        }
    }

    /**
     * 汉诺塔问题：采用分治算法解决方案：
     * <ul style="list-style: none">
     *     <li>1. 将起始柱上的 n - 1 个圆盘移动到辅助柱上</li>
     *     <li>2. 将起始柱上的   1   个圆盘移动到目标柱上</li>
     *     <li>3. 将辅助柱上的 n - 1 个圆盘移动到目标柱上</li>
     * </ul>
     *
     * @param num       圆盘数量
     * @param source    起始柱
     * @param target    目标柱
     * @param auxiliary 辅助柱
     */
    public static void hanoi(int num, String source, String target, String auxiliary) {
        if (num <= 0) {
            throw new IllegalArgumentException("num = " + num);
        } else {
            // 重置移动次数
            hanoiCount = 1;
            hanoiSolve(num, source, target, auxiliary);
        }
    }
}
