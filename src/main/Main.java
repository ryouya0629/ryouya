package curriculum_A;

public class Quustion1 {

	public static void main(String[] args) {
		
		// Q1：初期値を代入する（実際に代入する形で確認）
        byte   byteNum   = 0;       // byte型は0が初期値だけど、0を代入
        short  shortNum  = 0;       // short型は0が初期値だけど、0を代入
        int    intNum    = 0;       // int型は0が初期値だけど、0を代入
        long   longNum   = 0L;      // long型は0Lが初期値だけど、0Lを代入
        float  floatNum  = 0.0f;    // float型は0.0fが初期値だけど、0.0fを代入
        double doubleNum = 0.0;     // double型は0.0が初期値だけど、0.0を代入
        char   letter    = '\u0000';// char型は'\u0000'が初期値だけど、これを代入
        String letters   = null;    // String型はnullが初期値だけど、nullを代入
        boolean bool     = false;   // boolean型はfalseが初期値だけど、falseを代入

        System.out.println(byteNum);
        System.out.println(shortNum);
        System.out.println(intNum);
        System.out.println(longNum);
        System.out.println(floatNum);
        System.out.println(doubleNum);
        System.out.println(letter);
        System.out.println(letters);
        System.out.println(bool);


     // Q2：Q1で宣言した変数に再代入する（型は書かない）
        byteNum   = 10;
        shortNum  = 100;
        intNum    = 1000;
        longNum   = 10000L;
        floatNum  = 9.5f;
        doubleNum = 10.5;
        letter    = 'a';
        letters   = "ハロー"; // ← 課題指定通り
        bool      = true;

        // 出力　
        System.out.println(byteNum);
        System.out.println(shortNum);
        System.out.println(intNum);
        System.out.println(longNum);
        System.out.println(floatNum);
        System.out.println(doubleNum);
        System.out.println(letter);
        System.out.println(letters);
        System.out.println(bool);
        
  	  //Q3 :Q2で使った変数
        byte byteNum = 10;
        short shortNum = 100;
        int intNum = 1000;
        long longNum = 10000L;
        float floatNum = 9.5f;
        double doubleNum = 10.5;
        char letter = 'A';
        String letters = "ハロー";
        boolean bool = true;

        // 🔸 Q3 出力
        System.out.println(byteNum + shortNum + intNum + longNum); // 11110
        System.out.println(floatNum + doubleNum); // 20.0（→出力的には20）
        System.out.println(letter + " " + letters + " " + bool); // a ハロー true
        System.out.println(byteNum + shortNum + intNum + 20); // 11130
        System.out.println(1E+10); // 1E+10
        System.out.println(doubleNum / shortNum); // 0.105
        System.out.println(10 - shortNum); // -90
        
     // Q4
        String name = "山田太郎";
        System.out.println("こんにちは、" + name + "さん！");

        int age = 25;
        System.out.println("年齢：" + age + "歳");
        
     // Q5
    	// int型の変数 age を宣言して、25を代入
        int age = 25;

        // age変数を使って出力
        System.out.println("年齢：" + age + "歳");
        
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
  	  // int型の変数aとbを作って値を入れる
        int a = 10;
        int b = 20;

        // aがbより小さいかどうかをresultに代入
        boolean result = a < b;

        // resultの値を出力
        System.out.println(result);
        
     // Q12：三項演算子を使った条件分岐
        int x = 15;  // 変数xに15を代入
        String judge = (x >= 10) ? "OK" : "NG";  // 三項演算子で条件分岐
        System.out.println(judge);
        
     // Q13：「Java」を「Python」に置き換える
        // ============================
        String text = "私はJavaが好きです。Java楽しい！";

        // 「Java」を「Python」に置き換える
        String replacedText = text.replace("Java", "Python");

        // 結果を出力
        System.out.println(replacedText);
        } 
}
