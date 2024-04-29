package com.leetcode.demo.problem1;

import java.util.Arrays;

public class MergeSortArray {

	public static void main(String[] args) {
	
		int nums1[] = { 1, 3, 4, 9, 0, 0, 0 };
		int nums2[] = { 4, 5, 6 };
		int m = 4,n=3;
	/*	int z=0;

		for (int i = m; i <k; i++) {
          
			arr1[i]=arr2[z];
			z++;		
		}
		
		Arrays.sort(arr1);
		System.out.println(arr1);
	}*/
		  int i = m - 1;
	        int j = n - 1;
	        int k = m + n - 1;
	        
			while (j >= 0) {
				if (i >= 0 && nums1[i] > nums2[j]) {
					nums1[k] = nums1[i];
					k--;
					i--;
				} else {
					nums1[k] = nums2[j];
					k--;
					j--;
				}
			}
	    }

}
