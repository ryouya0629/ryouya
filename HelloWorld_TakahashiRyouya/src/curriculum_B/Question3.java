package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in); // ← ここで1回だけ作成

		// Q1: for文を使って1から10まで表示
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// Q2: 2から20までの偶数を表示
		for (int i = 2; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// Q3: 10から1までカウントダウン
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		// Q4: 1〜100 の合計を表示
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("合計: " + sum);

		// Q5: 三角形の表示
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}

		// Q6: while文で1から10まで表示
		int num = 1;
		while (num <= 10) {
			System.out.println(num);
			num++;
		}

		// Q7: do-whileで1〜5表示
		int num2 = 1;
		do {
			System.out.println(num2);
			num2++;
		} while (num2 <= 5);

		// Q8: 配列の合計
		int[] nums = { 3, 5, 7, 2, 8 };
		int sum2 = 0;
		for (int n : nums) {
			sum2 += n;
		}
		System.out.println("合計: " + sum2);

		// Q9: 配列の最大値
		int[] nums2 = { 4, 9, 1, 7, 3 };
		int max = nums2[0];
		for (int n : nums2) {
			if (n > max) {
				max = n;
			}
		}
		System.out.println("最大値: " + max);

		// Q10: 数値を入力してもらう
		try {
			while (true) {
				System.out.print("数値を入力してください（0で終了）: ");

				if (!scanner.hasNextInt()) {
					System.out.println("※数字を入力してください。");
					scanner.next(); // 不正入力を捨てる
					continue;
				}

				int inputNum = scanner.nextInt();

				if (inputNum == 0) {
					System.out.println("終了しました");
					break;
				}

				System.out.println("入力された数: " + inputNum);
			}
		} finally {
			// Q12 でも使うために close しない
			// scanner.close();
		}

		scanner.nextLine(); // ← nextInt() の改行消費

		// Q11: 九九表を表示
		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%02d * %02d = %02d | ", i, j, i * j);
			}
			System.out.println();
		}

		// Q12: 商品の残り台数をランダム表示
		System.out.println("== Q12 ==");

		System.out.print("商品名を入力してください（例: パソコン）: ");
		String item = scanner.nextLine();

		Random rand = new Random(); // ★ Randomは1回だけ作る
		int stock = rand.nextInt(12); // 0〜11の乱数

		switch (item) {
		case "パソコン":
			System.out.println("パソコンの残り台数は " + stock + " 台です");
			break;
		case "冷蔵庫":
			System.out.println("冷蔵庫の残り台数は " + stock + " 台です");
			break;
		case "扇風機":
			System.out.println("扇風機の残り台数は " + stock + " 台です");
			break;
		case "洗濯機":
			System.out.println("洗濯機の残り台数は " + stock + " 台です");
			break;
		case "加湿器":
			System.out.println("加湿器の残り台数は " + stock + " 台です");
			break;
		case "テレビ":
			System.out.println("テレビの残り台数は " + stock + " 台です");
			System.out.println("ディスプレイの残り台数は " + (11 - stock) + " 台です");
			break;
		case "ディスプレイ":
			System.out.println("ディスプレイの残り台数は " + stock + " 台です");
			System.out.println("テレビの残り台数は " + (11 - stock) + " 台です");
			break;
		default:
			System.out.println("「" + item + "」は指定の商品ではありません。");
			break;
		}

		scanner.close(); // 最後に閉じる
	}
}