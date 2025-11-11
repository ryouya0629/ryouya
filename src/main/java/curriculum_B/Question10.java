package curriculum_B;

import java.util.Scanner;

public class Question10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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