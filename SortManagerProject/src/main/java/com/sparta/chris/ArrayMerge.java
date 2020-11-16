package com.sparta.chris;

public class ArrayMerge {

    public static int[] merge(int[] array1, int[] array2) {
        int indexCount = 0;
        int totalLength = array1.length + array2.length;
        int[] joinedArray = new int[totalLength];

        sort(array1);
        sort(array2);

        for(int element : array1) {
            joinedArray[indexCount] = element;
            indexCount++;
        }
        for(int element : array2) {
            joinedArray[indexCount] = element;
            indexCount++;
        }

        int[] sortedArray = sort(joinedArray);

        return sortedArray;

    }

    public static int[] sort(int[] arrayToBeSorted) {
        int[] sortedArray = new int[arrayToBeSorted.length];

        if(arrayToBeSorted.length != 1) {
            int[][] halvedArrays = MergeSort.divideArray(arrayToBeSorted);

            int[] arr1 = halvedArrays[0];
            int[] arr2 = halvedArrays[1];
            int count = 0;
            int arr1Element = 0;
            int arr2Element = 0;

            while (arr1Element < arr1.length && arr2Element < arr2.length) {
                if (arr1[arr1Element] <= arr2[arr2Element]) {
                    sortedArray[count++] = arr1[arr1Element];
                    arr1Element++;
                } else {
                    sortedArray[count++] = arr2[arr2Element];
                    arr2Element++;
                }
            }

            while (arr1Element < arr1.length) {
                sortedArray[count++] = arr1[arr1Element];
                arr1Element++;
            }

            while (arr2Element < arr2.length) {
                sortedArray[count++] = arr2[arr2Element];
                arr2Element++;
            }
        }

        return sortedArray;
    }

}
