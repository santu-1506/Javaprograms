import java.util.*;

public class DietPlanPerformance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] calories = new int[n];
        for (int i = 0; i < n; i++) {
            calories[i] = sc.nextInt();
        }

        int k = sc.nextInt();
        int lower = sc.nextInt();
        int upper = sc.nextInt();

        int currentSum = 0;
        for (int i = 0; i < k; i++) {
            currentSum += calories[i];
        }

        int points = DietPoints(currentSum, lower, upper);

        for (int i = k; i < n; i++) {
            currentSum += calories[i] - calories[i - k];
            points += DietPoints(currentSum, lower, upper);
        }

        System.out.println(points);
    }

    public static int DietPoints(int sum, int lower, int upper) {
        if (sum < lower) {
            return -1;
        }
        if (sum > upper) {
            return 1;
        }
        return 0;
    }
}