package com.oguzcanbudumlu.easy.array.remove_duplicates_from_sorted_array;

public class Main {
    public static void main(String[] args) {
        int[] arr1 = { 1, 1, 2};
        int result1 = new Solution().removeDuplicates(arr1);
        printArray(arr1, result1);
        System.out.println(result1);

    }
    public static void printArray(int[] arr, int elementCount) {
        for(int i = 0; i < elementCount; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
