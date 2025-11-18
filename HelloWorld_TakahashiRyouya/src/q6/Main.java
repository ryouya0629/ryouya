package q6;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // Billable型のリストを作成
        List<Billable> employees = new ArrayList<>();

        // 社員を追加
        employees.add(new FullTimeEmployee("F001", "佐藤太郎"));
        employees.add(new ContractEmployee("C001", "田中花子"));
        employees.add(new FullTimeEmployee("F002", "鈴木一郎"));
        employees.add(new ContractEmployee("C002", "山本花子"));

        int hoursWorked = 9; // 9時間働いたとする

        // for-each で全員の日給を計算して表示
        for (Billable b : employees) {
            // Billable は costForDay しか使えない
            int wage = b.costForDay(hoursWorked);

            // 名前を表示するためキャストが必要（Employee の name を使う）
            Employee emp = (Employee)b;

            System.out.println(emp.name + " さんの日給: " + wage + "円");
        }
    }
}