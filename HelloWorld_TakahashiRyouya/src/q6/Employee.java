package q6;

public abstract class Employee implements Billable {

    protected String id;
    protected String name;

    // コンストラクタ
    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    // Billableのメソッドを抽象メソッドとして宣言
    @Override
    public abstract int costForDay(int hoursWorked);
}