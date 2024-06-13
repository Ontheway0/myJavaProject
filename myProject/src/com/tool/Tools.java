package com.tool;

public class Tools {
    public static void swap(int[] arr, int i, int j) {
        if(i == j) {
            return;
        }
        arr[i] = arr[i] ^ arr[j];
        arr[j] = arr[i] ^ arr[j];
        arr[i] = arr[i] ^ arr[j];
    }
    public static void insert(int[] arr, int newIndex, int oldIndex){
        int old = arr[oldIndex];
        for(int i = oldIndex; i > newIndex; --i){
            arr[i] = arr[i - 1];
        }
        arr[newIndex] = old;
    }
}
