package curriculum_B;
import java.util.Scanner;
public class Question2 {
	public static void main(String[] args) {
	  //Q1
        int score = 75;  // scoreという箱に75を入れる

        if (score >= 60) {  // scoreが60以上なら
            System.out.println("合格です");
        } else {  // それ以外（60未満）のとき
            System.out.println("不合格です");
        }

      //Q2
        int ageQ2 = 25;
        if (ageQ2 >= 30) {
            System.out.println("高齢者です");
        } else {
            System.out.println("青年です");
        }

      //Q3
        int ageQ3 = 18;
        if (ageQ3 >= 20) {
            System.out.println("成人です");
        } else {
            System.out.println("ティーンエイジャーです");
        }
        
      //Q4
        int x = 30;
        int y = 15;
        int z = 50;

        // 一番大きい数を見つける
        if (x >= y && x >= z) {
            System.out.println("一番大きい値は " + x + " です。");
        } else if (y >= x && y >= z) {
            System.out.println("一番大きい値は " + y + " です。");
        } else {
            System.out.println("一番大きい値は " + z + " です。");
        }
        
      //Q5
        // 1から10まで順番に数える
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        
      //Q6
        int sum = 0; // 合計を入れる箱を0からスタート

        for (int i = 1; i <= 10; i++) {
            sum = sum + i; // 1から10までの数字を順番に足していく
        }

        System.out.println("合計は " + sum + " です。");
        
      //Q7
        Scanner scanner = new Scanner(System.in);
        System.out.print("0から100のいずれかの点数を入力してください：");
        int scoreQ7 = scanner.nextInt();

        if (scoreQ7 >= 90) {
            System.out.println("優");
        } else if (scoreQ7 >= 70) {
            System.out.println("良");
        } else if (scoreQ7 >= 50) {
            System.out.println("可");
        } else {
            System.out.println("不可");
        }

      //Q8
        scanner.nextLine(); // ← 改行対策

        System.out.print("文字を入力してください：");
        String input = scanner.nextLine();

        if (input == null || input.equals("")) {
            System.out.println("入力が無効です");
        } else {
            System.out.println("入力された文字は「" + input + "」です");
        }

        scanner.close();
      //Q9
        // 入力をお願いするメッセージ
        System.out.print("1〜7の数字を入力してください: ");

        // 数字を入力してdayに代入
        int day = scanner.nextInt();

        // 入力された数字に応じて曜日を出す
        switch (day) {
            case 1:
                System.out.println("月曜日");
                break;
            case 2:
                System.out.println("火曜日");
                break;
            case 3:
                System.out.println("水曜日");
                break;
            case 4:
                System.out.println("木曜日");
                break;
            case 5:
                System.out.println("金曜日");
                break;
            case 6:
                System.out.println("土曜日");
                break;
            case 7:
                System.out.println("日曜日");
                break;
            default:
                System.out.println("無効な入力です");
        }
        
      //Q10
        // 入力してもらう
        System.out.print("1〜12の数字を入力してください: ");
        int month = scanner.nextInt();

        // 入力された月に応じて季節を表示
        switch (month) {
            case 12:
            case 1:
            case 2:
                System.out.println("冬");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("春");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("夏");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("秋");
                break;
            default:
                System.out.println("無効な月です");
        }

        scanner.close();
	}

}
