import java.io.*;
import java.util.*;
import java.lang.*;

public class LinearSearch {
    public static boolean linear(int arr[], int target) {
        if (arr.length == 0) {
            System.out.println("Empty Array");
        }
        for (int z = 0; z < arr.length; z++) {
            int ele = arr[z];
            if (ele == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) {
        // int arr[] = {12, 20, 21, 30, 32, 23};
        Scanner scan = new Scanner(System.in);
        System.out.println("LINEAR SEARCH");
        System.out.println("----------------------------");
        System.out.println("Enter Array Size:");
        int n = scan.nextInt();

        int arr[] = new int[n];
        System.out.println("----------------------------");
        System.out.println("Enter array Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }

        System.out.println("----------------------------");
        System.out.println("Array Elements Are=");
        for (int i = 0; i < n; i++) {
            System.out.println("Array Elelment: " + arr[i]);
        }

        System.out.println("----------------------------");
        System.out.println("Enter Searching element=");
        int target = scan.nextInt();
        // int ans = linear(arr, target);
        System.out.println("Result " + linear(arr, target));

    }
}
