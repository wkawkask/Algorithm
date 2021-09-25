package 과제3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

/**
 * Algorithm0
 */
public class Main {

    public static void main(String[] args) {

        int[] arr1 = {3,4,0,2,0,6};
        int j=0;

        for(int i=0; i<arr1.length; i++){
            if(arr1[i] != 0){
                arr1[j] = arr1[i];
                j++;
            }
        }
            
        
        for(int i=j; i<arr1.length; i++)
            arr1[i] = 0;


        System.out.println(Arrays.toString(arr1));  

        

    }
}