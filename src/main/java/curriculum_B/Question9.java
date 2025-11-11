package curriculum_B;

import java.util.Scanner;

public class Question9 {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

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

	        scanner.close();
	}
}
