package scm.com.ojt.tutorial3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tutorial3b {

    public static void main(String[] args) {
        List<Integer> arrObj = new ArrayList<>();
        arrObj.add(25);
        arrObj.add(14);
        arrObj.add(56);
        arrObj.add(15);
        arrObj.add(36);
        System.out.println("Before Removing " + arrObj);
        // create scanner object to ask user want to remove
        Scanner input = new Scanner(System.in);
        System.out.print("Enter element you want to remove.");
        int rmVar = input.nextInt();

        for (int i = 0; i < arrObj.size(); i++) {
            if (arrObj.get(i) == rmVar) {
                arrObj.remove(i);
            }
        }
        System.out.println("After Removing " + arrObj);
    }

}
