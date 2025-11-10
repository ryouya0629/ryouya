package curriculum_A;

public class Quustion3 {

	public static void main(String[] args) {
		  // Q2で指定された値
        byte byteNum   = 10;
        short shortNum = 100;
        int intNum     = 1000;
        long longNum   = 10000L;
        float floatNum = 9.5f;
        double doubleNum = 10.5;
        char letter    = 'a';
        String letters = "ハロー";
        boolean bool   = true;

        // ① 11110：整数だけを足す（10 + 100 + 1000 + 10000）
        System.out.println(byteNum + shortNum + intNum + longNum);

        // ② 20：例）10を2倍
        System.out.println(byteNum * 2);

        // ③ a ハロー true：間に半角スペース
        System.out.println(letter + " " + letters + " " + bool);

        // ④ 11130：「数字を全て」足す＝小数(9.5,10.5)も含む
        // 小数を含めると 11130.0 になるので、整数にキャストして 11130 にする
        System.out.println((int)(byteNum + shortNum + intNum + longNum + floatNum + doubleNum));

        // ⑤ 1E+10：小数点以外の数字（10,100,1000,10000）を全部かける
        long prod = (long) byteNum * shortNum * intNum * longNum; // 10000000000
        System.out.printf("%.0E%n", (double) prod);               // 科学表記で 1E+10 と出す

        // ⑥ 0.105：10.5 ÷ 100
        System.out.println(doubleNum / 100);

        // ⑦ -90：10 − 100
        System.out.println(byteNum - shortNum);
	}

}
