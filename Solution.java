import java.util.Scanner;

public class Solution {

    public static int solution(int number) {
        return IntStream.range(0, number)
                    .filter(n -> (n % 3 == 0) || (n % 5 == 0))
                    .sum();
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int number = Integer.parseInt(console.nextLine());
        int sum = solution(number);
        System.out.println(sum);
    }
}
