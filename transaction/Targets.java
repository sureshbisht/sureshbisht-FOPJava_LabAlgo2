package transaction;

import java.util.Scanner;

public class Targets {
	public void targetCheck(int[] earnings, int targets) {
		Scanner sc = new Scanner(System.in);

		for (int i = 1; i <= targets; i++) {
			System.out.println("Please enter target " + i);
			int target = sc.nextInt();

			int flag = 0, sum = 0;

			for (int j = 0; j < earnings.length; j++) {
				sum += earnings[j];
				if (sum >= target) {
					flag = 1;
					System.out.println("Target Achieved on day " + (j + 1));
					System.out.println("Remaining Balance = " + (sum - target));
					break;
				}
			}

			if (flag == 0)
				System.out.println("Target Not Achieved");

		}

	}

}