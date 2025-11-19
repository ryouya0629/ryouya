package curriculum_D;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Question7 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> log = new ArrayList<>();

        System.out.println("==== Player vs Daemon バトル ====");
        System.out.print("プレイヤーの名前を入力してください: ");
        String playerName = sc.nextLine();

        // プレイヤーを作成（ランダムステータス）
        Player player = new Player(playerName);
        // デーモンをファイルから読み込み
        Daemon daemon = Daemon.loadDaemon("daemon_status.txt");

        log.add("プレイヤー: " + player.name +
                " HP:" + player.hp + " AT:" + player.at + " SP:" + player.sp);
        log.add("デーモン: " + daemon.name +
                " HP:" + daemon.hp + " AT:" + daemon.at + " SP:" + daemon.sp);
        log.add("--------------------------------");

        Random rand = new Random();

        // どちらかのHPが0以下になるまで戦う
        while (player.isAlive() && daemon.isAlive()) {

            Character first;  // 先に攻撃する人
            Character second; // あとから攻撃する人

            // 先攻決定
            if (player.sp > daemon.sp) {
                first = player;
                second = daemon;
            } else if (player.sp < daemon.sp) {
                first = daemon;
                second = player;
            } else {
                // SPが同じならランダム
                if (rand.nextBoolean()) {
                    first = player;
                    second = daemon;
                } else {
                    first = daemon;
                    second = player;
                }
            }

            log.add("ターン開始！ 先攻は " + first.name + "！");

            // 先攻の攻撃
            String before = second.name + " HP:" + second.hp;
            first.attack(second);
            log.add(first.name + " の攻撃 → " + before + " → HP:" + second.hp);

            if (!second.isAlive()) {
                log.add(second.name + " は倒れた！");
                break;
            }

            // 後攻の攻撃
            before = first.name + " HP:" + first.hp;
            second.attack(first);
            log.add(second.name + " の攻撃 → " + before + " → HP:" + first.hp);

            if (!first.isAlive()) {
                log.add(first.name + " は倒れた！");
                break;
            }

            log.add("--------------------------------");
        }

        // 勝者決定
        String result;
        if (player.isAlive()) {
            result = "勝者は " + player.name + "！";
        } else {
            result = "勝者は " + daemon.name + "！";
        }
        System.out.println(result);
        log.add(result);

        // battle_log.txt に書き込み
        try (PrintWriter pw = new PrintWriter(new FileWriter("battle_log.txt"))) {
            for (String line : log) {
                pw.println(line);
            }
        } catch (IOException e) {
            System.out.println("バトルログの書き込みに失敗しました。");
            e.printStackTrace();
        }

        sc.close();
    }
}