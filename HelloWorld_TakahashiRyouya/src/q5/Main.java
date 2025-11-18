package q5;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // ① 社員リスト（List<Employee>）を作る
        List<Employee> employees = new ArrayList<>();

        // ② FullTimeEmployee と ContractEmployee を何人か追加
        employees.add(new FullTimeEmployee("F001", "佐藤太郎"));
        employees.add(new ContractEmployee("C001", "田中花子"));
        employees.add(new FullTimeEmployee("F002", "鈴木一郎"));
        employees.add(new ContractEmployee("C002", "山本花子"));

        int hoursWorked = 9;  // 9時間働いたとする

        // ③ for-each ループで、共通の Employee 型として扱う
        for (Employee emp : employees) {
            int wage = emp.calculateDailyWage(hoursWorked);

            // name は Employee クラスで protected なので、同じパッケージから見える
            System.out.println(emp.name + " さんの給与: " + wage + "円");
        }
    }
}