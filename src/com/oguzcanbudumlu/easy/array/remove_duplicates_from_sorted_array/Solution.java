package com.oguzcanbudumlu.easy.array.remove_duplicates_from_sorted_array;

public class Solution {
    public int removeDuplicates(int[] arr) {
        int realIndex = 0;
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] != arr[realIndex]) {
                realIndex++;
                arr[realIndex] = arr[i];
            }
        }
        return realIndex + 1;

    }
}
