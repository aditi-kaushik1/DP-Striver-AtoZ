//Memoization
import java.util.*;
public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[]dp = new int[n + 1];
		dp[0] = 0;
		dp[1] = 1;
		System.out.println(helper(n, dp));
	}

	private static int helper(int n, int[] dp) {
		if(n == 0)
			return 0;
		if(dp[n] != 0)
			return dp[n];
		return dp[n] = helper(n - 1, dp) + helper(n - 2, dp);
	}
}

//Tabulation
// import java.util.*;
// public class Solution {

// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
// 		int[] dp = new int[n + 1];
// 		dp[0] = 0;
// 		dp[1] = 1;

// 		for(int i = 2; i <= n; i++) {
// 			dp[i] = dp[i - 1] + dp[i - 2];
// 		}
// 		System.out.println(dp[n]);
// 	}
// }
