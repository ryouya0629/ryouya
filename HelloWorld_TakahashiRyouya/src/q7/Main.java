package q7;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        SalaryReporter reporter = new SalaryReporter();

        // Payable型のリストに、いろんな社員を入れる
        List<Payable> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee("佐藤", 9));
        employees.add(new ContractEmployee("田中", 9));
        employees.add(new FullTimeEmployee("鈴木", 7));
        employees.add(new ContractEmployee("山本", 5));

        // 全員分の給料をレポート
        for (Payable p : employees) {
            reporter.printReport(p);
        }
    }
}