package com.sparta.chris;

import javax.enterprise.inject.Alternative;

@Alternative
public class MergeSort extends Sorter{

    public static int[][] divideArray(int[] array) {
        int length = array.length;
        boolean lengthEven = (length % 2 == 1) ? false : true;
        int arr1Len = lengthEven ? length/2 : (length/2) + 1;

        int[] arr1 = new int[arr1Len];
        int[] arr2 = new int[length/2];

        System.arraycopy(array, 0, arr1, 0, arr1Len);
        System.arraycopy(array, arr1.length, arr2, 0, length/2);

        return new int[][]{arr1, arr2};
    }

    public static int[] sort(int[] unsortedArray) {

        if(unsortedArray.length == 1)
            return unsortedArray;

        int[][] halvedArrays = MergeSort.divideArray(unsortedArray);
        int[] arr1 = halvedArrays[0];
        int[] arr2 = halvedArrays[1];

        arr1 = MergeSort.sort(arr1);
        arr2 = MergeSort.sort(arr2);

        return ArrayMerge.merge(arr1, arr2);

    }
}
