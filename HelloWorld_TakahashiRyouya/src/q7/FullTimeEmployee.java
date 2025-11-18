package q7;

// 正社員
public class FullTimeEmployee extends Employee {

    private static final int HOURLY_RATE = 1200;

    public FullTimeEmployee(String name, int hours) {
        super(name, hours);
    }

    @Override
    public int calculateSalary() {
        int h = getHours();
        int overtime = Math.max(0, h - 8);     // 8時間を超えた分
        int regularHours = h - overtime;       // 8時間まで

        int regularPay = regularHours * HOURLY_RATE;
        int overtimePay = (int)(overtime * HOURLY_RATE * 1.25);

        return regularPay + overtimePay;
    }
}