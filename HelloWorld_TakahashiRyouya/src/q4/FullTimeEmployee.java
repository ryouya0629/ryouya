package q4;

public class FullTimeEmployee extends Employee {

    // 時給（正社員）
    private static final int HOURLY_RATE = 1200;

    // 親クラス(Employee)のコンストラクタを使う
    public FullTimeEmployee(String id, String name) {
        super(id, name);
    }

    // 正社員の1日の給料を計算（8時間までは通常、8時間超は25%増し）
    @Override
    public int calculateDailyWage(int hoursWorked) {

        if (hoursWorked <= 8) {
            // 8時間以内ならそのまま時給
            return hoursWorked * HOURLY_RATE;
        } else {
            // 8時間を超えた部分に25%増（1.25倍）
            int regularHours = 8;
            int overtimeHours = hoursWorked - 8;

            int regularPay = regularHours * HOURLY_RATE;
            int overtimePay = (int)(overtimeHours * HOURLY_RATE * 1.25);

            return regularPay + overtimePay;
        }
    }
}