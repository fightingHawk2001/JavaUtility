package com.hawk.fighting.algorithm.greedy;

import com.hawk.fighting.util.MathUtil;

/**
 * 贪心算法：
 * <ul>
 *      <li>贪心算法是所有算法中最简单，最易实现的算法，该算法之所以“贪心”，是因为算法中的每一步都追求最优的解决方案。</li>
 *      <li>每一步都力求最大限度地解决问题，每一步都选择的是当前最优的解决方案，这种解决问题的算法就是贪心算法。</li>
 *      <li>总的来讲，贪心算法注重的是每一步选择最优的解决方案（又称“局部最优解”），并不关心整个解决方案是否最优。</li>
 * </ul>
 * <p>
 * 背包问题：在限定条件下，如何从众多物品中选出收益最高的几件物品，这样的问题就称为背包问题。
 * <p>
 * 部分背包问题：每件物品是可再分的，即允许将某件物品的一部分（例如 1/3）放入背包
 *
 * @author fightingHawk Email: <a href="mailto:fightingHawk2001@outlook.com">fightingHawk2001@outlook.com</a>
 * @version 1.0.0
 */
public class FractionalKnapsack {

    /**
     * 每件商品的价格数组
     */
    private static double[] values;
    /**
     * 每件商品的重量数组
     */
    private static double[] weights;
    /**
     * 装背包的结果数组
     */
    private static double[] results;
    /**
     * 背包总容量
     */
    private static double packWeight;

    /**
     * 依据收益率对重量以及价格进行从高到低的排序
     *     收益率 = 价格 / 重量
     */
    private static void sort() {
        int length = weights.length;
        // 创建收益率数组并赋值
        double[] valueWeights = new double[length];
        for (int i = 0; i < length; i++) {
            valueWeights[i] = values[i] / weights[i];
        }

        // 排序
        double temp;
        for (int i = 0; i < length; i++) {
            for (int j = 1; j < length - i - 1; j++) {
                if (valueWeights[j] < valueWeights[j + 1]) {
                    temp = valueWeights[j];
                    valueWeights[j] = valueWeights[j + 1];
                    valueWeights[j + 1] = temp;

                    temp = values[j];
                    values[j] = values[j + 1];
                    values[j + 1] = temp;

                    temp = weights[j];
                    weights[j] = weights[j + 1];
                    weights[j + 1] = temp;
                }
            }
        }
    }

    /**
     * 依据排序好的重量从大到小装背包
     */
    private static void pack() {
        sort();
        for (int i = 0; packWeight > 0; i++) {
            double temp = Math.min(packWeight, weights[i]);
            results[i] = temp / weights[i];
            packWeight -= temp;
        }
    }

    /**
     * 使用贪心算法解决部分背包问题
     *
     * @param values     每个商品的价格数组
     * @param weights    每个商品的重量数组
     * @param results    装背包结果的数组
     * @param packWeight 背包总容量
     */
    public static void knapsack(double[] values, double[] weights, double[] results, double packWeight) {
        // 给静态变量赋值
        FractionalKnapsack.values = values;
        FractionalKnapsack.weights = weights;
        FractionalKnapsack.results = results;
        FractionalKnapsack.packWeight = packWeight;

        pack();
        double value = 0.0; // 总价值
        for (int i = 0; i < results.length; i++) {
            if (results[i] == 1) {
                System.out.println("价格为 " + values[i] + " 元, 重量为 " + weights[i] + "kg 的商品全部装入");
                value += values[i];
            } else if (results[i] == 0) {
                System.out.println("价格为 " + values[i] + " 元, 重量为 " + weights[i] + "kg 的商品不装");
            } else {
                double per = MathUtil.round(results[i] * 100, 2);
                System.out.println("价格为 " + values[i] + " 元, 重量为 " + weights[i] + "kg 的商品装入 " + per + "%");
                value += values[i] * results[i];
            }
        }
        System.out.println("最终获得价值为 " + MathUtil.round(value, 2) + " 元的商品");
    }
}
