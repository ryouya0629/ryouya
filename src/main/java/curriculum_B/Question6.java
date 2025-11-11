package curriculum_B;

public class Question6 {
	public static void main(String[] args) {

        int sum = 0; // 合計を入れる箱を0からスタート

        for (int i = 1; i <= 10; i++) {
            sum = sum + i; // 1から10までの数字を順番に足していく
        }

        System.out.println("合計は " + sum + " です。");

    }
}
