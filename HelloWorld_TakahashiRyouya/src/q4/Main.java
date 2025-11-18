package q4;

public class Main {
    public static void main(String[] args) {

        // 正社員のオブジェクト
        FullTimeEmployee full = new FullTimeEmployee("F001", "正社員さん");

        // パート社員のオブジェクト
        PartTimeEmployee part = new PartTimeEmployee("P001", "パートさん");

        // 9時間働いたときの給料を計算
        int fullWage = full.calculateDailyWage(9);   // 正社員
        int partWage = part.calculateDailyWage(9);   // パート

        // 結果を表示
        System.out.println("正社員の給与: " + fullWage + "円");
        System.out.println("パート社員の給与: " + partWage + "円");
    }
}