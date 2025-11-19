package curriculum_D;

// キャラクターの共通クラス
public class Character {

    String name; // 名前
    int hp;      // 体力
    int at;      // こうげき力
    int sp;      // スピード

    public Character(String name, int hp, int at, int sp) {
        this.name = name;
        this.hp = hp;
        this.at = at;
        this.sp = sp;
    }

    // 相手を攻撃する
    public void attack(Character target) {
        System.out.println(name + " の攻撃！ " + at + " のダメージ！");
        target.hp -= at;
        if (target.hp < 0) {
            target.hp = 0;
        }
        System.out.println(target.name + " の残りHP: " + target.hp);
    }

    public boolean isAlive() {
        return hp > 0;
    }
}