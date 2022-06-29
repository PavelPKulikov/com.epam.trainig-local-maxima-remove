package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{15, 15, 15, 15, 15, 15, 15};
        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array)throws UnsupportedOperationException{
        int [] arrayWoLm = new int [array.length];
        int j =0;
        for (int i=0;i < array.length-1; i++){
            if (array[i] <= array[i+1]){
                arrayWoLm[j] = array[i];
                j++;
            } else if(i != 0 && array[i] == array[i-1]){
                arrayWoLm[j] = array[i];
                j++;
            }
        }
        if (array[array.length-1] <= array[array.length-2]){
            arrayWoLm[j] = array[array.length-1];
            j++;
        }
        arrayWoLm = Arrays.copyOf(arrayWoLm,j);
        return arrayWoLm;

        //put your code here


    }
}
