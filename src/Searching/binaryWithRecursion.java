package Searching;
import java.util.*;

public class binaryWithRecursion {
    static int binarySearch(int arr[], int l, int r, int key)
    {
        if (l<=r)
    {
        int mid = (l+r)/2;
        if (arr[mid] == key)
        {
            return mid;
        }
        if (arr[mid]>key)
        {
            return binarySearch(arr,l,mid-1,key);
        }
        else {
            return binarySearch(arr,mid+1, r, key);
        }
    }
        return -1;


    }
    public static void main(String[] args) {
        int n,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");
        n = sc.nextInt();
        int [] arr = new int[n];
        for (i=0; i<arr.length; i++)
        {
            System.out.println("Enter the element at the index [" +i+ "]");
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element to search");
        int k= sc.nextInt();
        int value = binarySearch(arr,0, arr.length-1,k);
        if (value !=-1) {

            System.out.println("Yes found");
        }
        else {
            System.out.println("Not found");
        }

    }
}
