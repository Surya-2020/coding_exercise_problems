package com.parctice.problem;

public class BeyondSquare {

	public static void main(String[] args) {
		calculateNos();
		System.out.println("THe result "+calculateNos());

	}

	private static int calculateNos() {
		int a[] = { 1, 5, 3 };
		int product = 1, sum = 0;
		boolean flag1 = false,flag2=false;
		for (int i = 0; i < a.length; i++) {
			sum += a[i];
			product *= a[i];
			if (a[i] == 0) {
				flag1 = true;
			}else if(a[i]==3) {
				flag2=true;
			}
		}
		if (product % 2 == 0) {
			if (flag1) {
				sum = sum * 2;
			}
			return sum;

		}else {
			if(flag2) {
				product=product+1;
			}
			return product;
		}
	}
}
