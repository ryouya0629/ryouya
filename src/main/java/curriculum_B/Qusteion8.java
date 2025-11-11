package curriculum_B;

import java.util.Scanner;

public class Qusteion8 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // 入力をお願いするメッセージ
        System.out.print("文字を入力してください: ");

        // 入力された文字列を変数 text に入れる
        String text = scanner.nextLine();

        // 入力された文字が空かどうか判定
        if (text == null || text.equals("")) {
            System.out.println("入力が無効です");
        } else {
            System.out.println(text + "を入力しました");
        }

        scanner.close();

	}

}
