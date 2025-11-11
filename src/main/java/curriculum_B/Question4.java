package curriculum_B;

public class Question4 {
	public static void main(String[] args) {

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

    }
}
