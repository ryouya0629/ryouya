package q6;

public class FullTimeEmployee extends Employee {

    // 時給（正社員）
    private static final int HOURLY_RATE = 1250;

    // コンストラクタ（Employee のコンストラクタを呼ぶ）
    public FullTimeEmployee(String id, String name) {
        super(id, name);
    }

    // costForDay の実装
    @Override
    public int costForDay(int hoursWorked) {
        int overtime = Math.max(0, hoursWorked - 8); // 8時間超過分
        int regularHours = hoursWorked - overtime;   // 通常時間

        int regularPay = regularHours * HOURLY_RATE;
        int overtimePay = (int)(overtime * HOURLY_RATE * 1.25);

        return regularPay + overtimePay;
    }
}