package sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={23,1,10,5,2};
        int value=0;
        for(int i=1;i<arr.length;i++)
        {
            int second=arr[i];
           // System.out.println(second);
            int j=i-1;
            for(;j>=0;j--) {
                if (arr[j] > second) {
                   arr[j+1]=arr[j];
                }
                else
                    break;
            }
            arr[j+1]=second;
           // System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
