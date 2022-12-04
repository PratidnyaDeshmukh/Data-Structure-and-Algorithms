import java.io.*;
import java.util.*;
import java.lang.*;

public class BubbleSort {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("--------**********----------");
        System.out.println("Enter Array Size:");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Arrays Elements are:");
        System.out.println("---------******---------");
        {
            for (int i = 0; i < n; i++) {
                System.out.println("Array Element at " + i + " = " + arr[i]);
            }
        }
        System.out.println("---------**********----------");
        System.out.println("BUBBLE SORTING");
        int temp;
        for (int z = 1; z < n; z++) {
            for (int j = 0; j < n - z; j++) {

                if (arr[j] > arr[j + 1]) {
                    temp = arr[j + 1];
                    arr[j + 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Sorted Elements: ");
        for (int k = 0; k < n; k++) {
            System.out.println(arr[k]);
        }

    }
}