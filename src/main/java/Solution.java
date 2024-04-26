public class Solution {
    public int countArrangement(int n) {
        return dfs(n, 0, 1);
    }

    int dfs(int n, int mask, int count) {
        if (count == n + 1) {
            return 1;
        }
        int result = 0;
        for (int i = 1; i <= n; i++) {
            if ((mask & (1 << i)) == 0) {
                if (count % i == 0 || i % count == 0) {
                    result += dfs(n, (mask | (1 << i)), count + 1);
                }

            }
        }
        return result;
    }
}
