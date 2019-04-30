package com.ljj.seckill.common.algorithm;

/**
 * @CLassName AlgorithmVs
 * @Description 排序 VS
 * @Author LeeJack
 * @Date 2019/4/30/030 12:39
 * @Version 1.0
 */
public class AlgorithmVs {
    public static void main(String[] args) {
        testQuick();//快速排序
        testShell();//希尔排序
        testHeap();//堆排序
        testMerge();//归并排序
        testSelection();//直接排序
        testInsert();//直接插入排序
        testBubble();//冒泡排序
        /*
         * 快速排序耗费的时间: 8
         * 希尔排序耗费的时间：10
         * 堆排序排序耗费的时间：3
         * 归并排序排序耗费的时间：4
         * 直接排序耗费的时间：132
         * 直接插入排序耗费的时间：36
         * 冒泡排序耗费的时间：231
         */
    }

    private static void testBubble() {
        int[] list = list();
        // 冒泡排序
        long start = System.currentTimeMillis();
        BubbleSort.bubbleSort(list);
        long end = System.currentTimeMillis();
        System.out.println("冒泡排序耗费的时间：" + (end - start));
        display(list);
    }

    /**
     * 测试直接插入排序耗费的时间
     */
    private static void testInsert() {
        int[] list = list();
        // 直接插入排序
        long start = System.currentTimeMillis();
        InsertSort.insertSort(list);
        long end = System.currentTimeMillis();
        System.out.println("直接插入排序耗费的时间：" + (end - start));
        display(list);
    }

    /**
     * 直接选择排序耗费的时间
     */
    private static void testSelection() {
        int [] list = list();
        long start = System.currentTimeMillis();
        SelectionSort.selectionSort(list);
        long end = System.currentTimeMillis();
        System.out.println("直接排序耗费的时间：" + (end - start));
        display(list);

    }

    /**
     * 测试归并排序排序排序耗费的时间
     */
    private static void testMerge() {
        int[] list = list();
        long start = System.currentTimeMillis();
        MergeSort.mergeSort(list , new int[list.length] , 0 , list.length - 1);
        long end = System.currentTimeMillis();
        System.out.println("归并排序排序耗费的时间：" + (end - start));
        display(list);
    }

    /**
     * 测试堆排序排序耗费的时间
     */
    private static void testHeap() {
        int[] list = list();
        long start = System.currentTimeMillis();
        HeapSort.heapSort(list);
        long end = System.currentTimeMillis();
        System.out.println("堆排序排序耗费的时间：" + (end - start));
        display(list);
    }

    /**
     * 测试希尔排序耗费的时间
     */
    private static void testShell() {
        int[] list = list();
        //希尔排序
        long start = System.currentTimeMillis();
        ShellSort.shellSort(list);
        long end = System.currentTimeMillis();
        System.out.println("希尔排序耗费的时间：" + (end - start));
        display(list);
    }

    /**
     * 测试快速排序耗费的时间
     */
    private static void testQuick() {
        int[] list = list();
        //快速排序
        long start = System.currentTimeMillis();
        QuickSort.quickSort(list , 0 , list.length - 1);
        long end = System.currentTimeMillis();
        System.out.println("快速排序耗费的时间: " + (end - start));
        display(list);
    }

    private static int[] list() {
        int[] list = new int[10000];
        for (int i = 0; i < 10000; i++) {
            list[i] = (int) (Math.random() * 100000);
        }
        return list;
    }

    /**
     * 遍历打印前10个数
     */
    private static void display(int[] list) {
        System.out.println("********排序之后的前10个数start********");
        if (list != null && list.length > 0) {
            for (int i = 0; i < 10; i++) {
                System.out.print(list[i] + " ");
            }
            System.out.println("");
        }
        System.out.println("********排序之后的前10个数end**********");
        System.out.println("");
    }


}
