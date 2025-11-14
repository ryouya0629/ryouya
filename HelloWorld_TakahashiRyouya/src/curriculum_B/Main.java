package curriculum_B;

public class Main {

	public static void main(String[] args) {

		// -----------------------------
		// Q4 Greeting クラスの実行
		// -----------------------------
		System.out.println("【Q4 実行結果】");
		Greeting greeting = new Greeting();
		greeting.sayHello();

		// -----------------------------
		// Q5 Animal クラスの実行
		// -----------------------------
		System.out.println("\n【Q5 実行結果】");

		Animal lion = new Animal();
		lion.setName("ライオン");
		lion.setLength(2.1);
		lion.setSpeed(80);

		System.out.println("動物名：" + lion.getName());
		System.out.println("体長：" + lion.getLength() + "m");
		System.out.println("速度：" + lion.getSpeed() + "km/h");
	}
}