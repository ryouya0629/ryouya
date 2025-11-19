package curriculum_D;

import java.util.Random;

// プレイヤークラス
public class Player extends Character {

    // コンストラクタ：名前だけもらって、能力はランダム
    public Player(String name) {
        super(name, 0, 0, 0);

        Random rand = new Random();
        // ここは適当に範囲を決めてOK（例）
        this.hp = 60 + rand.nextInt(41);  // 60〜100
        this.at = 10 + rand.nextInt(11);  // 10〜20
        this.sp = 5 + rand.nextInt(6);    // 5〜10
    }
}