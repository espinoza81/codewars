//Given an array of integers, find the one that appears an odd number of times.

import java.util.Scanner;

import static java.util.Arrays.stream;

public class FindOdd {
    public static int findIt(int[] a) {

        return stream(a).reduce(0, (x, y) -> x ^ y);
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int[] integerArr = stream(console.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

    }
}
