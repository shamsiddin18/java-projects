package com.javacodeexamples.basic.arrayexample;

import java.util.Arrays;
public class SortStringArrayExample {
    public static void main(String[] args) {

        String[] strArray =
                { "E", "A", "S", "Y", "Q", "U", "E", "S", "T", "I", "O", "N"
                };

        //sort String array
        Arrays.sort(strArray);

        //print array
        System.out.println(Arrays.toString(strArray));

    }
}
