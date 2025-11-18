package objectoriented;

public class Main {

	public static void main(String[] args) {

		// Employeeクラスのインスタンス生成
		Employee emp = new Employee();

		// name に「山田太郎」を設定
		emp.name = "山田太郎";

		// work() を呼び出して出力
		emp.work();
	}
}