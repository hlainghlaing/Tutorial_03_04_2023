package scm.com.ojt.tutorial4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tutorial4a {

    public static void main(String[] args) {
        // Scanner Object to ask user to create or not
        Scanner input = new Scanner(System.in);
        List<String> arrList = new ArrayList<>();
        System.out.print("Enter values you want to create.(Size of array ) :");
        String sizestr = input.nextLine();
        int size = Integer.parseInt(sizestr);
        for (int i = 0; i < size; i++) {
            System.out.print("Enter elements in array index " + i + " : ");
            arrList.add(input.nextLine());
        }
        System.out.println("An Array List you created : " + arrList);
    }

}
