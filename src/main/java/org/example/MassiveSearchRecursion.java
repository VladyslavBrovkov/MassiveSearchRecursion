package org.example;

/**
 * Recursion implementation
 *
 */
public class MassiveSearchRecursion {

    public static void main(String[] args) {
        int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0, 5, 0 };
        int sum = MassiveSearchRecursion.sumOfArray(array, 0);
        System.out.println("Sum of array's elements = " + sum);
        int sum2 = MassiveSearchRecursion.sumOfArrayElements(array, 0);
        System.out.println("Number of array's elements = " + sum2);
        int max = MassiveSearchRecursion.findMax(array, 0);
        System.out.println("Max element in the array = " + max);
    }

    public static int sumOfArray(int[] array, int i) {
        if (i == array.length - 1) {
            return array[i];
        } else {
            return array[i] + sumOfArray(array, i + 1);
        }

    }

    public static int sumOfArrayElements(int[] array, int i) {
        if (i == array.length) {
            return i;
        } else {
            return sumOfArrayElements(array, ++i);
        }

    }

    public static int findMax(int[] n, int max) {
        if (n.length > max) {
            int next = findMax(n, max + 1);
            return (n[max] > next) ? n[max] : next;
        } else {
            return n[0];
        }
    }

}
