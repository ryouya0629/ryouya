package curriculum_B;
import java.util.Scanner;
public class Question7 {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in); // 入力を使う準備
        System.out.print("点数を入力してください（0〜100）: ");
        int score = scanner.nextInt(); // 入力された数をscoreに入れる

        if (score >= 90) {
            System.out.println("優");
        } else if (score >= 70) {
            System.out.println("良");
        } else if (score >= 50) {
            System.out.println("可");
        } else {
            System.out.println("不可");
        }

        scanner.close();
	}

}
