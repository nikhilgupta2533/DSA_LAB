package Searching;
import java.util.Arrays;
import java.util.Scanner;

public class predefined_Methods
{
    public static void main(String[] args) {
        int []arr = {22,24,23,25,26,77,88,6,78};

        int k;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search");
        k = sc.nextInt();
        int value = Arrays.binarySearch(arr,k);
        if (value>=0)
        {
            System.out.println("Yes found");
        }
        else {
            System.out.println("Not found");
        }
    }
}
