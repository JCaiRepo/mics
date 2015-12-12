package com.personal.jcai;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        int arrayA[] = {10, 11, 12, 9, 8, 15, 13, 14, 16, 7};
        int arrayB[] = {8, 7, 9, 10, 12, 11, 14, 13, 20, 19, 22, 21, 2, 1, 4, 3, 6, 5};
        int i;
        ArrayList<Integer> intersection = new ArrayList<Integer>();

        Hashtable<String, String> superset = new Hashtable<String, String>();

/*        System.out.println("Before Sorting Two Arrays are:");
        System.out.println("arrayA:");
        for(i=0;i<arrayA.length;i++) {
            System.out.print(" " + arrayA[i]);
        }
        System.out.println("\narrayB:");
        for(i=0;i<arrayB.length;i++) {
            System.out.print(" " + arrayB[i]);
        }
        Arrays.sort(arrayA);
        Arrays.sort(arrayB);

        System.out.println("\nAfter Sorting Two Arrays are:");
        System.out.println("arrayA:");
        for(i=0;i<arrayA.length;i++) {
            System.out.print(" " + arrayA[i]);
        }
        System.out.println("\narrayB:");
        for(i=0;i<arrayB.length;i++) {
            System.out.print(" " + arrayB[i]);
        }*/

        for(i=0;i<arrayA.length;i++) {
            superset.put("" + arrayA[i], "0");
        }

        for(i=0;i<arrayB.length;i++) {
            if(superset.containsKey("" + arrayB[i])) {
                superset.put("" + arrayB[i], "1");
                intersection.add(arrayB[i]);
            } else {
                superset.put("" + arrayB[i], "0");
            }
        }
/*
        Enumeration enumeration = superset.elements();

        while (enumeration.hasMoreElements()) {
            System.out.println(" " + enumeration.nextElement());
        }
*/

        System.out.println("\nSize of unique elements: " + superset.size());

        System.out.println("\nIntersection size is " + intersection.size() + " elements of the intersection are: ");
        for(Integer item: intersection){
            System.out.print(" " + item);
        }

    }
}
