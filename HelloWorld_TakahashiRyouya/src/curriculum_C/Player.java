package curriculum_C;

import java.util.Scanner;

public class Player {

    private Scanner scanner;

    // コンストラクタ（最初に一回だけ呼ばれる）
    public Player(Scanner scanner) {
        this.scanner = scanner;
    }

    // 人間の手をキーボードから読む
    public int getHand() {
        System.out.print("グー(0), チョキ(1), パー(2) を入力: ");
        int hand = scanner.nextInt();  // 数字を入力
        return hand;
    }

    // 数字 → 文字に変える
    public static String handName(int hand) {
        switch (hand) {
            case 0:
                return "グー";
            case 1:
                return "チョキ";
            case 2:
                return "パー";
            default:
                return "？？";
        }
    }
}