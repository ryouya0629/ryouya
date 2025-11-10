
public class Main {

	public static void main(String[] args) {
		
		// Q1
		byte byteNum = 0;       // 小さい数字（−128〜127）
        short shortNum = 0;     // ちょっと大きい数字
        int intNum = 0;         // 普通の数字（よく使う！）
        long longNum = 0L;      // すごく大きい数字（最後にLをつける）
        float floatNum = 0.0f;  // 小数（最後にfをつける）
        double doubleNum = 0.0; // 小数（もっと正確）
        char letter = 'A';      // 1文字（' ' ←シングルクォート）
        String letters = "Hello"; // 文字列（" " ←ダブルクォート）
        boolean bool = true;    // 真（true）か偽（false）

     // Q2
        byteNum = 10;
        shortNum = 1000;
        intNum = 10000;
        longNum = 100000L;
        floatNum = 9.5f;
        doubleNum = 0.5;
        letter = 'A';
        letters = "ABC";
        bool = true;
        
     // Q3
        System.out.println(byteNum);
        System.out.println(shortNum);
        System.out.println(intNum);
        System.out.println(longNum);
        System.out.println(floatNum);
        System.out.println(doubleNum);
        System.out.println(letter);
        System.out.println(letters);
        System.out.println(bool);
        
     // Q4
        String name = "山田太郎";
        System.out.println("こんにちは、" + name + "さん！");

        int age = 25;
        System.out.println("年齢：" + age + "歳");
        
     // Q5
        int a = 10;
        int b = 3;

        System.out.println("a + b = " + (a + b));  
        System.out.println("a - b = " + (a - b));  
        System.out.println("a * b = " + (a * b));  
        System.out.println("a / b = " + (a / b));  
        System.out.println("a % b = " + (a % b));  
        
     // Q6
        int num1 = 10;  
        int num2 = 5;   

        int sum = num1 + num2;  

        System.out.println("合計は " + sum + " です。");
        
     // Q7   
        int score = 80;       
        score = score + 20;   

        System.out.println("最終スコア：" + score);
        
     // Q8 
        double price = 99.99;  

        System.out.println("変数値: " + price);  
        System.out.println("整数部分: " + (int)price);
        
     // Q9
        String numStr9 = "123";
        int num9 = Integer.parseInt(numStr9);
        int result9 = num9 + 10;
        System.out.println("結果：" + result9);

     // Q10
        int num10 = 50;
        String numStr10 = String.valueOf(num10);
        System.out.println(numStr10 + "点");
        
     // Q11
        int num = 15;  // 変数numを作って値を入れる

        if (num > 10) {
            System.out.println("大きい");
        } else {
            System.out.println("小さい");
        } 
	}
}
