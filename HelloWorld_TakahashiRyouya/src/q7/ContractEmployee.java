package q7;

// 契約社員
public class ContractEmployee extends Employee {

    private static final int HOURLY_RATE = 1000;

    public ContractEmployee(String name, int hours) {
        super(name, hours);
    }

    @Override
    public int calculateSalary() {
        return getHours() * HOURLY_RATE;
    }
}