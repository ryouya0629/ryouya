package curriculum_B;

import java.util.Scanner; // Q6で入力を使うために必要！

public class Question4 {
	public static void main(String[] args) {

		// Q1 配列 {1, 2, 3, 4, 5} を順番に表示
		int[] num1 = { 1, 2, 3, 4, 5 };
		System.out.println("Q1:");
		for (int i = 0; i < num1.length; i++) {
			System.out.println(num1[i]);
		}
		System.out.println();

		// Q2 配列 {10, 20, 30, 40, 50} を逆順に表示
		int[] num2 = { 10, 20, 30, 40, 50 };
		System.out.println("Q2:");
		for (int i = num2.length - 1; i >= 0; i--) {
			System.out.println(num2[i]);
		}
		System.out.println();

		// Q3 配列 {3, 5, 7, 9, 11} の合計を出す
		int[] num3 = { 3, 5, 7, 9, 11 };
		int sum3 = 0;
		for (int i = 0; i < num3.length; i++) {
			sum3 += num3[i];
		}
		System.out.println("Q3: 合計 = " + sum3);
		System.out.println();

		// Q4 配列 {12, 7, 9, 21, 5, 18} の最大値・最小値
		int[] num4 = { 12, 7, 9, 21, 5, 18 };
		int max = num4[0];
		int min = num4[0];
		for (int i = 1; i < num4.length; i++) {
			if (num4[i] > max)
				max = num4[i];
			if (num4[i] < min)
				min = num4[i];
		}
		System.out.println("Q4: 最大 = " + max + ", 最小 = " + min);
		System.out.println();

		// Q5 配列 {1, 2, 3, 4, 5} の平均を出す
		int[] num5 = { 1, 2, 3, 4, 5 };
		int sum5 = 0;
		for (int n : num5) {
			sum5 += n;
		}
		double avg = (double) sum5 / num5.length;
		System.out.println("Q5: 平均 = " + avg);
		System.out.println();

		// Q6 配列 {4, 7, 10, 15, 20} の中に入力値があるか調べる
		Scanner sc = new Scanner(System.in);
		int[] num6 = { 4, 7, 10, 15, 20 };
		System.out.println("Q6: 数字を入力してください > ");
		int input = sc.nextInt();

		boolean found = false;
		for (int n : num6) {
			if (n == input) {
				found = true;
				break;
			}
		}

		if (found) {
			System.out.println("入力した値 " + input + " は配列に含まれています。");
		} else {
			System.out.println("入力した値 " + input + " は配列に含まれていません。");
		}
		System.out.println();

		// Q7 2次元配列 { {1, 2, 3}, {4, 5, 6} } を全表示
		int[][] array7 = {
				{ 1, 2, 3 },
				{ 4, 5, 6 }
		};
		System.out.println("Q7:");
		for (int i = 0; i < array7.length; i++) {
			for (int j = 0; j < array7[i].length; j++) {
				System.out.print(array7[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();

		// Q8 2次元配列 {{10, 20, 30}, {40, 50, 60}, {70, 80, 90}} の合計
		int[][] array8 = {
				{ 10, 20, 30 },
				{ 40, 50, 60 },
				{ 70, 80, 90 }
		};
		int sum8 = 0;
		for (int i = 0; i < array8.length; i++) {
			for (int j = 0; j < array8[i].length; j++) {
				sum8 += array8[i][j];
			}
		}
		System.out.println("Q8: 合計 = " + sum8);
		System.out.println();

		// Q9 2次元配列 {{12, 15, 8}, {6, 19, 25}, {30, 2, 10}} の最大値・最小値
		int[][] array9 = {
				{ 12, 15, 8 },
				{ 6, 19, 25 },
				{ 30, 2, 10 }
		};
		int max9 = array9[0][0];
		int min9 = array9[0][0];
		for (int i = 0; i < array9.length; i++) {
			for (int j = 0; j < array9[i].length; j++) {
				if (array9[i][j] > max9)
					max9 = array9[i][j];
				if (array9[i][j] < min9)
					min9 = array9[i][j];
			}
		}
		System.out.println("Q9: 最大 = " + max9 + ", 最小 = " + min9);
		System.out.println();

		// Q10 3次元配列 {{{1, 2}, {3, 4}}, {{5, 6}, {7, 8}}} を全表示
		int[][][] array10 = {
				{
						{ 1, 2 },
						{ 3, 4 }
				},
				{
						{ 5, 6 },
						{ 7, 8 }
				}
		};

		System.out.println("Q10:");
		for (int i = 0; i < array10.length; i++) {
			for (int j = 0; j < array10[i].length; j++) {
				for (int k = 0; k < array10[i][j].length; k++) {
					System.out.print(array10[i][j][k] + " ");
				}
			}
		}
		System.out.println();

		// 終了
		sc.close();
	}
}