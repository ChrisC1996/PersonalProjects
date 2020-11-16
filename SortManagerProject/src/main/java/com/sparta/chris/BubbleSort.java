package com.sparta.chris;
import javax.enterprise.inject.Default;
import java.util.Arrays;

@Default
public class BubbleSort extends Sorter {

    public static int[] sort(int[] arr) {
        for(int i=0; i<arr.length-1; i++) { // for each element in the array
            for(int x=0; x<arr.length - i - 1; x++) { // for each element in the array after i element
                if(arr[x] > arr[x + 1]) {
                    int temp = arr[x];
                    arr[x] = arr[x+1];
                    arr[x+1] = temp;
                    System.out.println(Arrays.toString(arr));
                }
            }
        }
        return arr;
    }

    public void print(int[] sortedArr) {
        for(int i=0; i<sortedArr.length; i++) {
            System.out.print(sortedArr[i] + ", ");
        }
    }

}
