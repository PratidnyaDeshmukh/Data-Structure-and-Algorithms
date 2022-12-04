import java.io.*;
import java.util.*;
import java.lang.*;

public class BinarySearch {
    public static int binarySearch(int arr[], int target) {
        int low = 0, high = (arr.length - 1);
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] > target) {
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else if (arr[mid] == target) {
                return target;
            }
        }
        return -1;
    }

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.print("--------BINARY SEARCH-------");
        System.out.println("----------------------------");
        System.out.println("Enter Array Size:");
        int n = scan.nextInt();
        System.out.println("----------------------------");
        int arr[] = new int[n];
        System.out.println("Enter array Elements=");
        for (int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        System.out.println("----------------------------");
        System.out.println("Array Elements are:");
        for (int i = 0; i < n; i++) {
            System.out.println("Array Element " + arr[i]);
        }
        System.out.println("----------------------------");
        System.out.println("BINARY SEARCHING");
        System.out.println("----------------------------");

        System.out.println("Enter Target Element to Search:");
        int target = scan.nextInt();
        System.out.println("----------------------------");
        System.out.println("Result= " + binarySearch(arr, target));
    }
}
