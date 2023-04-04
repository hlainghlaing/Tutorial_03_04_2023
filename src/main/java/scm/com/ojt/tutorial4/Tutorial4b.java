package scm.com.ojt.tutorial4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Tutorial4b {

    public static void main(String[] args) {
        List<String> colorObj = new ArrayList<>();
        colorObj.add("Red");
        colorObj.add("Green");
        colorObj.add("Black");
        colorObj.add("White");
        colorObj.add("Pink");
        System.out.println("Before Swapping : " + colorObj);
        System.out.println("Index number must be between 0 - " + (colorObj.size() - 1));
        Scanner input = new Scanner(System.in);
        System.out.print("Enter index number of 1st element to swap : ");
        int firstIndex = input.nextInt();
        System.out.print("Enter index number of 2nt element to swap : ");
        int secondIndex = input.nextInt();
        input.close();
        // use static method swap from collection class to swap
        Collections.swap(colorObj, firstIndex, secondIndex);
        System.out.println("After Swapping : " + colorObj);
    }
}
