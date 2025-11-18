package q7;

// 社員の共通の親クラス
public abstract class Employee implements Payable {

    private String name;
    private int hours;

    public Employee(String name, int hours) {
        this.name = name;
        this.hours = hours;
    }

    @Override
    public String getName() {
        return name;
    }

    public int getHours() {
        return hours;
    }

    // 給料の計算は子クラスにまかせる
    @Override
    public abstract int calculateSalary();
}