package com.jcai;
import java.io.*;

public class LoopingArray {

    public static void main(String[] args) throws IOException {
	// reading marathon running results from stdin and store to an double array
	// then call findmix and find_2ndmin methods
        int array_size, i=0;
        String s;
        System.out.println("Input number of players:");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        array_size = Integer.parseInt(in.readLine());
        double [] running_results = new double[array_size];
        System.out.println("Input the result for each player line by line:");
        while ((s = in.readLine()) != null && s.length() != 0 && i < array_size) {
            running_results[i++] = Double.parseDouble(s);
        }

    // completed the array initialization start to calling the method
        System.out.println("The fastest player is No. " + findminIndex(array_size, running_results));
        System.out.println("The 2nd fastest player is No. " + find_2ndmin_Index(array_size, running_results));
    }

    public static int findminIndex(int size, double[] results) {
        int idx = -1;
        int i;
        double min = Integer.MAX_VALUE;
        for (i = 0 ; i < size ; i++) {
            if(min > results[i]) {
                min = results[i];
                idx = i;
            }
        }
        return idx+1;
    }

    public static int find_2ndmin_Index(int size, double[] results) {
        int second_idx = -1;
        int minIdx, i;
        double second_min = Double.MAX_VALUE;
        minIdx = findminIndex(size, results);
        for(i = 0; i < size; i++) {
            if (i == minIdx)
                continue;
            if(second_min > results[i]){
                second_min = results[i];
                second_idx = i;
            }
        }
        return second_idx+1;
    }
}
