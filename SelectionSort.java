import java.io.*;
import java.util.*;
import java.lang.*;

public class SelectionSort {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("SELECTION SORT");
        System.out.println("--------------------------------");
        System.out.println("Enter Array Size:");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Arrays Elements are:");
        System.out.println("------------------------------");
        {
            for (int i = 0; i < n; i++) {
                System.out.println("Array Element at " + i + " = " + arr[i]);
            }
        }
        System.out.println("------------------------------");
        System.out.println("SORTING:");
        System.out.println("------------------------------");

        // Logic for SELECTION SORT.
        int temp;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        // Print the SOrted Array here
        System.out.println("Sorted Array:");
        for (int i = 0; i < n; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}
