package com.company;

import java.util.Arrays;

public class RemoveDuplicateCharFromString {
    static String str = "subhbaas";

    public static void main(String[] args) {
        Boolean isDuplicate = false;
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isDuplicate = true;
                    count++;
                    break;

                }
            }

        }
        Character[] dauplicate = new Character[count];

        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    isDuplicate = true;
                    dauplicate[k] = str.charAt(i);
                    k++;
                    break;

                }
            }

        }
        if (!isDuplicate) {
            System.out.println("No Duplicate");
        } else {
            System.out.println("Duplicate are: " + Arrays.toString(dauplicate));
        }
    }

}
