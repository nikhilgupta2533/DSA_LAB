package Searching;
import java.util.*;
public class Binary_Search {
    static void binary(int arr[], int key)
    {
        int  l=0,mid;
        int r = arr.length-1;
        int flag = 0;
        while(l<=r)
        {
            mid = (l+r)/2;
            if (arr[mid]==key)
            {
                flag = 1;
                break;
            }
            else if(arr[mid]>key) {
                r = mid - 1;
            }
            else {
                l = mid+1;

            }
        }
            if (flag==1)
            {
                System.out.println("Yes found");

            }
            else {
                System.out.println("Not found");

        }
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
        binary(arr,k);
    }
}
