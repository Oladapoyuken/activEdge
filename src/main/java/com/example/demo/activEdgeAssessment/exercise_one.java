package com.example.demo.activEdgeAssessment;

import java.util.*;

public class exercise_one {


    public static int smallestNonInteger(int[] arr){

        if(arr.length < 1) return 1;

        Set<Integer> set = new TreeSet();

        for(int i = 0; i < arr.length; i++){
            if(arr[i] >= 0) set.add(arr[i]);
        }
        int count = 1;
        for (int x : set) {
            if(count < x) return count;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        int x = smallestNonInteger(new int[]{1,-1, 4});
        System.out.println(x);
    }
}
