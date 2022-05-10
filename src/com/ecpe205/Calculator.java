package com.ecpe205;

import java.util.Arrays;

public class Calculator {
    public double sum( double a, double b ) {
        return a + b;
    }
    public boolean isEven (int value) {
        return value % 2 == 0;
    }
    public boolean isOdd (int value) {
        return value % 2 == 1;
    }

    //create a method that computes base x power of y
    //use parameterizedTest methodsource - 5 sets to test

    public double exponent(double x, double y){
        return Math.pow(x,y);
    }

    //create a method that computes for the factorial of a value
    //use parameterizedTest- 5 values to test

    public long factorial(int n) {
        return (1 > n) ? 1 : n * factorial(n - 1);
    }

    //create a method that checks if a given string is a palindrome
    //use parameterizedTest - 5 values to test

    static boolean isPalindrome(String str)
    {
        String OriginalString = str;
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return OriginalString.equalsIgnoreCase(str);
    }

    //create a method that accepts an array of integer values, the method then sorts the value in ascending order
    //** you may choose whatever sort data structure (bubble sort, shell sort,...)
    //use parameterizedTest methodSource

    static String bubbleSort(int[] array) {
        int size = array.length;
        for (int i = 0; i < size - 1; i++)

            for (int j = 0; j < size - i - 1; j++)

                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
        return Arrays.toString(array);
    }

    static String shellSort(int array []) {//to be compared to bubbleSort result for proof
        for (int interval = array.length / 2; interval > 0; interval /= 2) {
            for (int i = interval; i < array.length; i += 1) {
                int temp = array[i];
                int j;
                for (j = i; j >= interval && array[j - interval] > temp; j -= interval) {
                    array[j] = array[j - interval];
                }
                array[j] = temp;
            }
        }
        return Arrays.toString(array);
    }

}
