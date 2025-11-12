package curriculum_B;

import java.util.Random;
import java.util.Scanner;

public class Question3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in); // Scannerは最初に1回だけ作る

		// Q1: for文を使って1から10までの数字を1つずつ表示する
		for (int i = 1; i <= 10; i++) {
			System.out.println(i);
		}

		// Q2: for文を使って2から20までの偶数を1つずつ表示する
		for (int i = 2; i <= 20; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}

		// Q3: for文を使って10から1までの数字をカウントダウンで表示する
		for (int i = 10; i >= 1; i--) {
			System.out.println(i);
		}

		// Q4: for文を使って1から100までの合計を表示する
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			sum += i;
		}
		System.out.println("合計: " + sum);

		// Q5: for文を使って三角形を出力する
		for (int i = 1; i <= 5; i++) { // 行（1段目〜5段目）
			for (int j = 1; j <= i; j++) { // 1段ごとに*を増やす
				System.out.print("*");
			}
			System.out.println(); // 改行
		}

		// Q6: while文で1から10までを1つずつ表示
		int n1 = 1;
		while (n1 <= 10) {
			System.out.println(n1);
			n1++;
		}

		// Q7: while文で2から20までの偶数を1つずつ表示
		int n2 = 2;
		while (n2 <= 20) {
			System.out.println(n2);
			n2 += 2;
		}

		// Q8: while文で10から1までカウントダウン
		int n3 = 10;
		while (n3 >= 1) {
			System.out.println(n3);
			n3--;
		}

		// Q9: while文で1から100までの合計を表示
		int n4 = 1;
		int sum2 = 0;
		while (n4 <= 100) {
			sum2 += n4;
			n4++;
		}
		System.out.println("合計: " + sum2);

		// Q10: ユーザーから数値を入力してもらう
		try {
			while (true) {
				System.out.print("数値を入力してください（0で終了）: ");
				if (!scanner.hasNextInt()) {
					System.out.println("数字を入力してください。");
					scanner.next(); // 不正な入力を捨てる
					continue;
				}

				int inputNum = scanner.nextInt();
				if (inputNum == 0) {
					System.out.println("終了しました。");
					break;
				}

				System.out.println("入力された数: " + inputNum);
			}
		} finally {
			// ここでは閉じない（Q12でも使うため）
			// scanner.close();
		}

		// Q11: 九九を表示
		// nextInt後の改行を吸収しておく
		scanner.nextLine();

		for (int i = 1; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%02d * %02d = %02d\t", i, j, i * j);
			}
			System.out.println();
		}

		// Q12: 入力した商品の残り台数を出力する
		System.out.println("== Q12 ==");

		System.out.print("商品名をカンマ区切りで入力（例: パソコン, 冷蔵庫, テレビ, ディスプレイ）: ");
		String line = scanner.nextLine();

		for (String raw : line.split("、|,|，")) { // 全角・半角カンマ対応
			String item = raw.trim();
			Random rand = new Random();
			int stock = rand.nextInt(12); // 0〜11の乱数

			switch (item) {
			case "パソコン":
			case "冷蔵庫":
			case "扇風機":
			case "洗濯機":
			case "加湿器":
				System.out.println(item + "の残り台数は" + stock + "台です");
				break;

			case "テレビ":
			case "ディスプレイ": {
				int base = rand.nextInt(12);
				int tv = (item.equals("テレビ")) ? base : (11 - base);
				int dsp = (item.equals("ディスプレイ")) ? base : (11 - base);

				System.out.println("テレビの残り台数は" + tv + "台です");
				System.out.println("ディスプレイの残り台数は" + dsp + "台です");
				break;
			}

			default:
				System.out.println("「" + item + "」は指定の商品ではありません。");
				break;
			}
		}

		// プログラムの最後でScannerを閉じる
		scanner.close();
	}
}