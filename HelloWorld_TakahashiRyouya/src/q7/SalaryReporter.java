package q7;

// 給料を表示するクラス（計算はしない）
public class SalaryReporter {

    public void printReport(Payable p) {
        int salary = p.calculateSalary();         // 給料は本人に計算してもらう
        System.out.println(p.getName() + " の給料は " + salary + " 円です");
    }
}