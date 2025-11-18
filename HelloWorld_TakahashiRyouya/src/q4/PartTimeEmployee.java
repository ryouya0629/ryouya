package q4;

public class PartTimeEmployee extends Employee {

    // パート社員の時給
    private static final int HOURLY_RATE = 1000;

    // 親クラス(Employee)のコンストラクタを使う
    public PartTimeEmployee(String id, String name) {
        super(id, name);
    }

    // パート社員の1日の給料を計算（時間 × 時給）
    @Override
    public int calculateDailyWage(int hoursWorked) {
        return hoursWorked * HOURLY_RATE;
    }
}