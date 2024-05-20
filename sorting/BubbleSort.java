package sorting;

import java.util.Arrays;

public class BubbleSort {
    /*
            Time Complacity:o(n^2)
     */
    public static void main(String[] args) {
        int []number={6,21,3,65};
        for(int i=0;i<number.length;i++)
        {
            for(int j=0;j< number.length-i;j++)
            {
                if(number[i]<number[j])
                {
                    int temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(number));
    }
}
