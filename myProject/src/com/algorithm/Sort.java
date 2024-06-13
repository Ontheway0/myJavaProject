package com.algorithm;
import com.tool.Tools;

import static com.tool.Tools.swap;

public class Sort {
    // 冒泡排序
    public static void bubbleSort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length  -i- 1; ++j){
                if(arr[j + 1] < arr[j])
                    swap(arr, j + 1, j);

            }
        }
    }
    // 选排
    public static void selectSort(int[] arr){
        for(int i = 0; i < arr.length; ++i){
            int min = arr[i];
            int minIndex = i;
            for(int j = i + 1; j < arr.length; ++j){
                if(arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            swap(arr, i, minIndex);
        }
    }
    // 插排
    public static void insertSort(int[] arr){
        for(int i = 1; i < arr.length; ++i){
            int minIndex = i;
            for(int j = i - 1; j >= 0; --j){
                if(arr[i] < arr[j]){
                    minIndex = j;
                }
                else{
                    break;
                }
            }
            Tools.insert(arr, minIndex, i);
        }
    }
    //快排
    private static int[] partition(int[] arr, int L, int R) {
        int cur = L;
        int less = cur - 1;
        int more = R;
        while(cur < more) {
            if(arr[cur] < arr[R]) {
                swap(arr, ++less, cur++);
            }
            else if(arr[cur] > arr[R]) {
                swap(arr, --more, cur);
            }
            else{
                cur++;
            }
        }
        swap(arr, more, R);
        return new int[] { less + 1, more };
    }
    public static void quickSort(int[] arr, int L, int R) {
        if (L < R) {
            swap(arr, L + (int)(Math.random() * (R - L + 1)), R);
            int[] p = partition(arr, L, R);
            quickSort(arr, L, p[0] - 1);
            quickSort(arr, p[1] + 1, R);
        }
    }
    // 归并排序
    public static void mergeSort(int[] arr, int left, int right){
        if(arr == null||left > right) {
            return;
        }
        int middle = left + (right - left) >> 1;
        mergeSort(arr, left, middle);
        mergeSort(arr, middle + 1, right);
        merge(arr, left, middle, right);
    }
    private static void merge(int[] arr, int left, int middle, int right){
        int[] temp = new int[right - left + 1];
        int l_pos = left;
        int r_pos = middle + 1;
        int i = 0;
        while(l_pos <= middle&&r_pos <= right){
            if(arr[l_pos] <= arr[r_pos])
                temp[i++] = arr[l_pos++];
            else{
                temp[i++] = arr[r_pos++];
            }
        }
        while(l_pos <= middle)
            temp[i++] = arr[l_pos++];
        while (r_pos <= right)
            temp[i++] = arr[r_pos++];

        int j = left;
        i = 0;
        while(i < temp.length)
            arr[j++] = temp[i++];
    }
}
