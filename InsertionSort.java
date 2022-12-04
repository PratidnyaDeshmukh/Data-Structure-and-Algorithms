import java.io.*;
import java.util.*;
import java.lang.*;

public class InsertionSort {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("--------------*********-------------");
        System.out.println("INSERTION SORT");

        System.out.println("Define an Array");
        System.out.println("Enter an array size:");
        int n = scan.nextInt();
        System.out.println("-------------------");

        int arr[] = new int[n];
        System.out.println("Enter Array Elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("Array Elements are =");
        for (int i = 0; i < n; i++) {
            System.out.println(i + "th" + " Element= " + arr[i]);
        }

        System.out.println("INSERTION SORTING");
        System.out.println("------------------");

        // int j = 0;
        for (int j = 1; j < n; j++) {
            int temp = arr[j];
            int i = j - 1;
            while ((i > -1) && (arr[i] > temp)) {
                arr[i + 1] = arr[i];
                i--;
            }
            arr[i + 1] = temp;
        }
        System.out.println("Sorted Elements");
        for (int z = 0; z < n; z++) {
            System.out.println(arr[z]);
        }

    }
}
