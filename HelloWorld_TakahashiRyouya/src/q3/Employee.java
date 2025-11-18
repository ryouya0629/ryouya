package q3;

public class Employee {

    // 大事な情報なので外から見えないようにする（private）
    private String employeeId;
    private String name;

    // 社員IDを書き込む専用のペン（setter）
    public void setEmployeeId(String id) {
        this.employeeId = id;
    }

    // 社員IDを読み取る専用の窓（getter）
    public String getEmployeeId() {
        return this.employeeId;
    }

    // 名前を書き込む専用のペン（setter）
    public void setName(String name) {
        this.name = name;
    }

    // 名前を読み取る専用の窓（getter）
    public String getName() {
        return this.name;
    }
}