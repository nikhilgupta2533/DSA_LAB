package Searching.Linear_Searching;

import java.util.Scanner;

public class search {
    static void linearSearch(int arr[], int key) {
        int flag = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == key) {
                flag = 1;
                break;
            }
        }
        if (flag == 1) {
            System.out.println("Yes found");
        } else {
            System.out.println("Not found");
        }
    }

    public static void main(String[] args) {
        int n, i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        n = sc.nextInt();
        int[] arr = new int[n];
        for (i = 0; i < arr.length; i++) {
            System.out.println("Enter the element at the index [" + i + "]");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int k = sc.nextInt();
        linearSearch(arr, k);

    }
}