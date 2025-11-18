package q6;

public class ContractEmployee extends Employee {

    // 契約社員の時給
    private static final int HOURLY_RATE = 1000;

    // 親クラス(Employee)のコンストラクタを呼ぶ
    public ContractEmployee(String id, String name) {
        super(id, name);
    }

    // costForDay の実装（割増なし）
    @Override
    public int costForDay(int hoursWorked) {
        return hoursWorked * HOURLY_RATE;
    }
}