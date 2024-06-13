package com.tool;
public class Comparator {
    public static int times ;
    public static int maxValue ;
    public static int maxLength ;
    public static boolean result;
    static {
        times = 50000;
        maxValue = 100;
        maxLength = 100;
        result = true;
    }

    // 1. 创建数组
    public static int[] createArray(int maxLength, int maxValue) {
        int Length = (int)(Math.random() * maxLength) + 1;
        int[] arr = new int[Length];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random() * maxValue);
        }
        return arr;
    }
    // 2. 拷贝数组
    public static int[] copyArr(int[] arr){
        int[] copyArr = new int[arr.length];
        System.arraycopy(arr, 0, copyArr, 0, arr.length);
        return copyArr;
    }
    // 3. 判断
    public static boolean res(int[] arr1, int[] arr2){
        for(int i = 0; i < arr1.length; i++){
            if(arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}