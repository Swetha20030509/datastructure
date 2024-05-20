package sorting;

import java.util.Arrays;

public class SelectionSort {
    /*
        time complexity:o(n^2)
     */
    public static void main(String[] args) {
        int []number={6,21,3,65,1};
        int index=-1;
        for(int i=0;i<number.length;i++)
        {
            int min=number[i];
            index=-1;
            for(int j=i+1;j<number.length;j++)
            {
                if(min>number[j]) {
                    min = number[j];
                    index=j;
                   /* int temp=number[i];
                    number[i]=number[j];
                    number[j]=temp;*/
                }
            }
            if(index!=-1)
            {
                int temp=number[index];
                number[index]=number[i];
                number[i]=temp;

            }

        }
        System.out.println(Arrays.toString(number));
    }
}
