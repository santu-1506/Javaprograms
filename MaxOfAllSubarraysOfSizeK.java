import java.util.*;

public class MaxOfAllSubarraysOfSizeK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        List<Integer> window = new ArrayList<>();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < n; i++) {
            window.add(nums[i]);
            if (window.size() == k) {
                result.append(Collections.max(window));
                if (i < n - 1) {
                    result.append(' ');
                }
                window.remove(0);
            }
        }

        System.out.println(result.toString().trim());
    }
}