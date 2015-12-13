package com.personal.jcai;

import java.util.*;
import java.util.stream.Collector;

/**
 * Created by jcai on 12/11/15.
 */

/*Given two strings s and t, determine if they are isomorphic.

Two strings are isomorphic if the characters in s can be replaced to get t.

All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.

For example,
Given "egg", "add", return true.

Given "foo", "bar", return false.

Given "paper", "title", return true.

Note:
You may assume both s and t have the same length.
*/
public class isomorphic {

    public String a;
    public String b;

    isomorphic(String n, String m) {
        a = n;
        b = m;
    }

    public boolean check() {

        int i;
        HashMap<Character, Character> hashTableAB = new HashMap<Character, Character>();
        HashMap<Character, Character> hashTableBA = new HashMap<Character, Character>();

        if(a.length() != b.length()){
            return false;
        } else {
            for(i=0; i<a.length(); i++) {
                if(hashTableAB.containsKey(a.toCharArray()[i])){
                    if(hashTableAB.get(a.toCharArray()[i]) != b.toCharArray()[i]) {
                        return false;
                    }
                } else {
                    hashTableAB.put(a.toCharArray()[i], b.toCharArray()[i]);
                }

                if(hashTableBA.containsKey(b.toCharArray()[i])){
                    if(hashTableAB.get(b.toCharArray()[i]) != a.toCharArray()[i]) {
                        return false;
                    }
                } else {
                    hashTableAB.put(b.toCharArray()[i], a.toCharArray()[i]);
                }
            }
        }

        return true;
    }
}
