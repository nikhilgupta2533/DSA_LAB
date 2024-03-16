package Searching;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class HelloWorld
{
    public static void main(String[] args) {
        List<Integer>list = new ArrayList<Integer>();
        list.add(23);
        list.add(24);
        list.add(25);
        list.add(26);
        list.add(27);
        list.add(28);
        list.add(29);
        int k = HelloWorld.binarySearch(list,125);
        if (k>=0)
        {
            System.out.println("Yes found");
        }
        else
        {
            System.out.println("Not found");
        }

    }
}
