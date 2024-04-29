package teslra;

import java.util.*;

public class CandyCombos {
    public static int minCost(int K, String[] combos, int[] costs, int N) {
        int minCost = Integer.MAX_VALUE;
        for (int i = 0; i < (1 << N); i++) {
        	//System.out.println(1 << N);
            List<Integer> flavors = new ArrayList<>();
            int totalCost = 0;
            for (int j = 0; j < N; j++) {
            	System.out.println(i & (1 << j));
                if ((i & (1 << j)) != 0) {
                    for (int k = 0; k < K; k++) {
                        if (combos[j].charAt(k) == '1') {
                            if (!flavors.contains(k)) {
                                flavors.add(k);
                            }
                        }
                    }
                    totalCost += costs[j];
                }
            }
            if (flavors.size() == K) {
                minCost = Math.min(minCost, totalCost);
            }
        }
        return minCost == Integer.MAX_VALUE ? -1 : minCost;
    }

    public static void main(String[] args) {
        int K = 4;
        String[] combos = {"1010", "0100", "0001", "1111", "1011"};
        int[] costs = {5, 5, 5, 10, 2};
        int N = 5;

        int result = minCost(K, combos, costs, N);
        System.out.println("Minimum cost required: " + result); // Output: 7
    }
}
