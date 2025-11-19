package curriculum_C;

import java.util.Scanner;

public class Question6 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Player player = new Player(sc); // 人間
        Cpu cpu = new Cpu();            // コンピューター

        System.out.println("じゃんけんゲームスタート！");

        // 勝つまでくり返す
        while (true) {
            int pHand = player.getHand(); // 人間の手
            int cHand = cpu.getHand();    // CPUの手

            System.out.println("あなたの手: " + Player.handName(pHand));
            System.out.println("CPUの手: " + Player.handName(cHand));

            int result = judge(pHand, cHand);

            if (result == 0) {
                System.out.println("あいこです。もう一回！\n");
            } else if (result == 1) {
                System.out.println("あなたの勝ち！");
                break; // 勝ったら終わり
            } else {
                System.out.println("あなたの負け…もう一回！\n");
            }
        }

        sc.close();
    }

    // 勝ち負け判定
    // 戻り値：0 = あいこ, 1 = プレイヤー勝ち, -1 = プレイヤー負け
    private static int judge(int p, int c) {
        if (p == c) {
            return 0; // あいこ
        }

        // プレイヤーが勝つパターン
        if ((p == 0 && c == 1) || // グー vs チョキ
            (p == 1 && c == 2) || // チョキ vs パー
            (p == 2 && c == 0)) { // パー vs グー
            return 1;
        }

        // それ以外は負け
        return -1;
    }
}