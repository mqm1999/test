package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] a = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279};
        int[] b = {832, 998, 148, 570, 533, 561, 455, 147, 894, 279};
        int count = 0;
        ArrayList<Integer> aDiff = new ArrayList<>();
        ArrayList<Integer> bDiff = new ArrayList<>();

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) {
                aDiff.add(a[i]);
                bDiff.add(b[i]);
                count++;
            }
        }

        if (count == 2) {
            if (aDiff.get(0).equals(bDiff.get(1)) && aDiff.get(1).equals(bDiff.get(0))) {
                System.out.println(aDiff.get(0));
                System.out.println(bDiff.get(1));
                System.out.println(aDiff.get(1));
                System.out.println(bDiff.get(0));
                System.out.println("true");
            } else {
//                System.out.println(aDiff.get(0));
//                System.out.println(bDiff.get(1));
//                System.out.println(aDiff.get(1));
//                System.out.println(bDiff.get(0));
                System.out.println("false");
                //return false;
            }
        } else if (count == 0) {
            //return true;
        } else {
            //return false;
        }
    }
}


