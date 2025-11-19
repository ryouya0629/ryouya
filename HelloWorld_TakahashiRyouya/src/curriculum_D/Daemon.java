package curriculum_D;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// デーモンクラス
public class Daemon extends Character {

    public Daemon(String name, int hp, int at, int sp) {
        super(name, hp, at, sp);
    }

    // daemon_status.txt からデーモンのステータスを読むメソッド
    public static Daemon loadDaemon(String fileName) {
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String name = br.readLine();            // 1行目: 名前
            int hp = Integer.parseInt(br.readLine()); // 2行目: HP
            int at = Integer.parseInt(br.readLine()); // 3行目: AT
            int sp = Integer.parseInt(br.readLine()); // 4行目: SP

            return new Daemon(name, hp, at, sp);
        } catch (IOException e) {
            System.out.println("デーモンのファイルが読み込めませんでした。");
            e.printStackTrace();
            // 読めなかったとき用の適当なデーモン
            return new Daemon("DefaultDaemon", 50, 10, 5);
        }
    }
}