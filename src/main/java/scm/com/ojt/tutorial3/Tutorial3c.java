package scm.com.ojt.tutorial3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Tutorial3c {

    public static void main(String[] args) {
        List<String> arrList = new ArrayList<>();
        arrList.add("Java");
        arrList.add("Python");
        arrList.add("PHP");
        arrList.add("C#");
        arrList.add("Ruby");
        System.out.println("Array List : " + arrList);
        String arr[] = new String[arrList.size()];
        arr = arrList.toArray(arr);
        System.out.print("Array : " + Arrays.toString(arr));
    }
}
