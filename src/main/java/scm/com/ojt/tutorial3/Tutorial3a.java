package scm.com.ojt.tutorial3;

public class Tutorial3a {

    public static void main(String[] args) {
        // Initialize an array
        int arrayObj[] = { 3, 4, 5, 7, 9 };
        int sum = 0;
        for (int i : arrayObj) {
            sum = sum + i;
        }
        double avgValue = (double) sum / arrayObj.length;
        System.out.println("Average : " + avgValue);
    }

}
