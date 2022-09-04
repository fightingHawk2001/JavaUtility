package com.hawk.fighting.util;

/**
 * 数组工具类
 *
 * @author fightingHawk Email: <a href="mailto:fightingHawk2001@outlook.com">fightingHawk2001@outlook.com</a>
 * @version 1.0.0
 */
public class ArrayUtil {

    /**
     * 以指定分隔、起始、结束符将数组转换成字符串形式
     *
     * @param array     需要被转换的数组
     * @param separator 分隔符
     * @param start     字符串起始字符
     * @param end       字符串结尾字符
     * @return 转换之后的字符串
     */
    public static String toString(char[] array, String separator, String start, String end) {
        if (array == null)
            return "null";
        int iMax = array.length - 1;
        if (iMax == -1)
            return "[]";
        StringBuilder builder = new StringBuilder();
        builder.append(start == null ? "" : start);
        for (int i = 0; ; i++) {
            builder.append(array[i]);
            if (i == iMax)
                return builder.append(end == null ? "" : end).toString();
            builder.append(separator);
        }
    }

    /**
     * 以指定分隔、起始、结束符将数组转换成字符串形式
     *
     * @param array     需要被转换的数组
     * @param separator 分隔符
     * @param start     字符串起始字符
     * @param end       字符串结尾字符
     * @return 转换之后的字符串
     */
    public static String toString(boolean[] array, String separator, String start, String end) {
        if (array == null)
            return "null";
        int iMax = array.length - 1;
        if (iMax == -1)
            return "[]";
        StringBuilder builder = new StringBuilder();
        builder.append(start == null ? "" : start);
        for (int i = 0; ; i++) {
            builder.append(array[i]);
            if (i == iMax)
                return builder.append(end == null ? "" : end).toString();
            builder.append(separator);
        }
    }

    /**
     * 以指定分隔、起始、结束符将数组转换成字符串形式
     *
     * @param array     需要被转换的数组
     * @param separator 分隔符
     * @param start     字符串起始字符
     * @param end       字符串结尾字符
     * @return 转换之后的字符串
     */
    public static String toString(byte[] array, String separator, String start, String end) {
        if (array == null)
            return "null";
        int iMax = array.length - 1;
        if (iMax == -1)
            return "[]";
        StringBuilder builder = new StringBuilder();
        builder.append(start == null ? "" : start);
        for (int i = 0; ; i++) {
            builder.append(array[i]);
            if (i == iMax)
                return builder.append(end == null ? "" : end).toString();
            builder.append(separator);
        }
    }

    /**
     * 以指定分隔、起始、结束符将数组转换成字符串形式
     *
     * @param array     需要被转换的数组
     * @param separator 分隔符
     * @param start     字符串起始字符
     * @param end       字符串结尾字符
     * @return 转换之后的字符串
     */
    public static String toString(short[] array, String separator, String start, String end) {
        if (array == null)
            return "null";
        int iMax = array.length - 1;
        if (iMax == -1)
            return "[]";
        StringBuilder builder = new StringBuilder();
        builder.append(start == null ? "" : start);
        for (int i = 0; ; i++) {
            builder.append(array[i]);
            if (i == iMax)
                return builder.append(end == null ? "" : end).toString();
            builder.append(separator);
        }
    }

    /**
     * 以指定分隔、起始、结束符将数组转换成字符串形式
     *
     * @param array     需要被转换的数组
     * @param separator 分隔符
     * @param start     字符串起始字符
     * @param end       字符串结尾字符
     * @return 转换之后的字符串
     */
    public static String toString(int[] array, String separator, String start, String end) {
        if (array == null)
            return "null";
        int iMax = array.length - 1;
        if (iMax == -1)
            return "[]";
        StringBuilder builder = new StringBuilder();
        builder.append(start == null ? "" : start);
        for (int i = 0; ; i++) {
            builder.append(array[i]);
            if (i == iMax)
                return builder.append(end == null ? "" : end).toString();
            builder.append(separator);
        }
    }

    /**
     * 以指定分隔、起始、结束符将数组转换成字符串形式
     *
     * @param array     需要被转换的数组
     * @param separator 分隔符
     * @param start     字符串起始字符
     * @param end       字符串结尾字符
     * @return 转换之后的字符串
     */
    public static String toString(long[] array, String separator, String start, String end) {
        if (array == null)
            return "null";
        int iMax = array.length - 1;
        if (iMax == -1)
            return "[]";
        StringBuilder builder = new StringBuilder();
        builder.append(start == null ? "" : start);
        for (int i = 0; ; i++) {
            builder.append(array[i]);
            if (i == iMax)
                return builder.append(end == null ? "" : end).toString();
            builder.append(separator);
        }
    }

    /**
     * 以指定分隔、起始、结束符将数组转换成字符串形式
     *
     * @param array     需要被转换的数组
     * @param separator 分隔符
     * @param start     字符串起始字符
     * @param end       字符串结尾字符
     * @return 转换之后的字符串
     */
    public static String toString(float[] array, String separator, String start, String end) {
        if (array == null)
            return "null";
        int iMax = array.length - 1;
        if (iMax == -1)
            return "[]";
        StringBuilder builder = new StringBuilder();
        builder.append(start == null ? "" : start);
        for (int i = 0; ; i++) {
            builder.append(array[i]);
            if (i == iMax)
                return builder.append(end == null ? "" : end).toString();
            builder.append(separator);
        }
    }

    /**
     * 以指定分隔、起始、结束符将数组转换成字符串形式
     *
     * @param array     需要被转换的数组
     * @param separator 分隔符
     * @param start     字符串起始字符
     * @param end       字符串结尾字符
     * @return 转换之后的字符串
     */
    public static String toString(double[] array, String separator, String start, String end) {
        if (array == null)
            return "null";
        int iMax = array.length - 1;
        if (iMax == -1)
            return "[]";
        StringBuilder builder = new StringBuilder();
        builder.append(start == null ? "" : start);
        for (int i = 0; ; i++) {
            builder.append(array[i]);
            if (i == iMax)
                return builder.append(end == null ? "" : end).toString();
            builder.append(separator);
        }
    }

    /**
     * 以指定分隔、起始、结束符将数组转换成字符串形式
     *
     * @param array     需要被转换的数组
     * @param separator 分隔符
     * @param start     字符串起始字符
     * @param end       字符串结尾字符
     * @return 转换之后的字符串
     */
    public static String toString(Object[] array, String separator, String start, String end) {
        if (array == null)
            return "null";
        int iMax = array.length - 1;
        if (iMax == -1)
            return "[]";
        StringBuilder builder = new StringBuilder();
        builder.append(start == null ? "" : start);
        for (int i = 0; ; i++) {
            builder.append(array[i]);
            if (i == iMax)
                return builder.append(end == null ? "" : end).toString();
            builder.append(separator);
        }
    }

    /**
     * 求数组和
     *
     * @param array 数组
     * @return 和
     */
    public static int sum(byte[] array) {
        int sum = 0;
        for (byte i : array) {
            sum += i;
        }
        return sum;
    }

    /**
     * 求数组和
     *
     * @param array 数组
     * @return 和
     */
    public static int sum(short[] array) {
        int sum = 0;
        for (short i : array) {
            sum += i;
        }
        return sum;
    }

    /**
     * 求数组和
     *
     * @param array 数组
     * @return 和
     */
    public static int sum(int[] array) {
        int sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

    /**
     * 求数组和
     *
     * @param array 数组
     * @return 和
     */
    public static long sum(long[] array) {
        long sum = 0;
        for (long i : array) {
            sum += i;
        }
        return sum;
    }

    /**
     * 求数组和
     *
     * @param array 数组
     * @return 和
     */
    public static float sum(float[] array) {
        float sum = 0.0f;
        for (float i : array) {
            sum += i;
        }
        return sum;
    }

    /**
     * 求数组和
     *
     * @param array 数组
     * @return 和
     */
    public static double sum(double[] array) {
        double sum = 0.0;
        for (double i : array) {
            sum += i;
        }
        return sum;
    }

    /**
     * 求数组平均值
     *
     * @param array 数组
     * @return 平均值
     */
    public static double average(byte[] array) {
        double sum = 0.0;
        for (byte i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    /**
     * 求数组平均值
     *
     * @param array 数组
     * @return 平均值
     */
    public static double average(short[] array) {
        double sum = 0.0;
        for (short i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    /**
     * 求数组平均值
     *
     * @param array 数组
     * @return 平均值
     */
    public static double average(int[] array) {
        double sum = 0.0;
        for (int i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    /**
     * 求数组平均值
     *
     * @param array 数组
     * @return 平均值
     */
    public static double average(long[] array) {
        double sum = 0.0;
        for (long i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    /**
     * 求数组平均值
     *
     * @param array 数组
     * @return 平均值
     */
    public static float average(float[] array) {
        float sum = 0.0f;
        for (float i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    /**
     * 求数组平均值
     *
     * @param array 数组
     * @return 平均值
     */
    public static double average(double[] array) {
        double sum = 0.0;
        for (double i : array) {
            sum += i;
        }
        return sum / array.length;
    }

    /**
     * 查找数组中的最大值
     *
     * @param array 数组
     * @return 最大值
     */
    public static char max(char[] array) {
        int max = array[0];
        for (char i : array) {
            max = Math.max(i, max);
        }
        return (char) max;
    }

    /**
     * 查找数组中的最大值
     *
     * @param array 数组
     * @return 最大值
     */
    public static int max(byte[] array) {
        int max = array[0];
        for (byte i : array) {
            max = Math.max(i, max);
        }
        return max;
    }

    /**
     * 查找数组中的最大值
     *
     * @param array 数组
     * @return 最大值
     */
    public static int max(short[] array) {
        int max = array[0];
        for (short i : array) {
            max = Math.max(i, max);
        }
        return max;
    }

    /**
     * 查找数组中的最大值
     *
     * @param array 数组
     * @return 最大值
     */
    public static int max(int[] array) {
        int max = array[0];
        for (int i : array) {
            max = Math.max(i, max);
        }
        return max;
    }

    /**
     * 查找数组中的最大值
     *
     * @param array 数组
     * @return 最大值
     */
    public static long max(long[] array) {
        long max = array[0];
        for (long i : array) {
            max = Math.max(i, max);
        }
        return max;
    }

    /**
     * 查找数组中的最大值
     *
     * @param array 数组
     * @return 最大值
     */
    public static float max(float[] array) {
        float max = array[0];
        for (float i : array) {
            max = Math.max(i, max);
        }
        return max;
    }

    /**
     * 查找数组中的最大值
     *
     * @param array 数组
     * @return 最大值
     */
    public static double max(double[] array) {
        double max = array[0];
        for (double i : array) {
            max = Math.max(i, max);
        }
        return max;
    }

    /**
     * 查找数组中的最小值
     *
     * @param array 数组
     * @return 最小值
     */
    public static char min(char[] array) {
        int min = array[0];
        for (char i : array) {
            min = Math.min(i, min);
        }
        return (char) min;
    }

    /**
     * 查找数组中的最小值
     *
     * @param array 数组
     * @return 最小值
     */
    public static int min(byte[] array) {
        int min = array[0];
        for (byte i : array) {
            min = Math.min(i, min);
        }
        return min;
    }

    /**
     * 查找数组中的最小值
     *
     * @param array 数组
     * @return 最小值
     */
    public static int min(short[] array) {
        int min = array[0];
        for (short i : array) {
            min = Math.min(i, min);
        }
        return min;
    }

    /**
     * 查找数组中的最小值
     *
     * @param array 数组
     * @return 最小值
     */
    public static int min(int[] array) {
        int min = array[0];
        for (int i : array) {
            min = Math.min(i, min);
        }
        return min;
    }

    /**
     * 查找数组中的最小值
     *
     * @param array 数组
     * @return 最小值
     */
    public static long min(long[] array) {
        long min = array[0];
        for (long i : array) {
            min = Math.min(i, min);
        }
        return min;
    }

    /**
     * 查找数组中的最小值
     *
     * @param array 数组
     * @return 最小值
     */
    public static float min(float[] array) {
        float min = array[0];
        for (float i : array) {
            min = Math.min(i, min);
        }
        return min;
    }

    /**
     * 查找数组中的最小值
     *
     * @param array 数组
     * @return 最小值
     */
    public static double min(double[] array) {
        double min = array[0];
        for (double i : array) {
            min = Math.min(i, min);
        }
        return min;
    }
}