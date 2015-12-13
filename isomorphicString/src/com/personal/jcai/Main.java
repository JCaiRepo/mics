package com.personal.jcai;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);

        System.out.println("Enter the 1st string");
        String a = in.nextLine();

        System.out.println("Enter the 2nd string");
        String b = in.nextLine();

        System.out.println("1st string is " + a + "; 2nd string is " + b);

        isomorphic isomorphicPair = new isomorphic(a, b);
        boolean result = isomorphicPair.check();

        if(result) {
            System.out.println(a + " and " + b + " is isomorphic.");
        } else {
            System.out.println(a + " and " + b + " is not isomorphic.");
        }
    }
}
