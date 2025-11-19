package selfintro;

class Person {

    // 問題1：インスタンスフィールド
    String name;      // 名前（string）
    int age;          // 年齢（int）
    double height;    // 身長（double）
    double weight;    // 問題4：体重（double）

    // 問題10：人数カウント用のクラスフィールド
    static int count = 0;

    // 問題2・3：コンストラクタ
    Person(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;

        count++; // 人数を増やす
    }

    // 問題6：bmiメソッド（返り値 double）
    double bmi() {
        return this.weight / (this.height * this.height);
    }

    // 問題8：printメソッド
    void print() {
        System.out.println("名前は" + this.name + "です");
        System.out.println("年は" + this.age + "です");
        System.out.println("BMIは" + String.format("%.2f", this.bmi()) + "です");
    }
}