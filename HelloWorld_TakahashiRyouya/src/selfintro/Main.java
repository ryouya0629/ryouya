package selfintro;

class Main {
    public static void main(String[] args) {

        // 問題5：weight に 60 を入れて Person を作成
        Person person1 = new Person("鈴木太郎", 20, 1.7, 60);

        // 問題8：printメソッドで表示
        person1.print();

        // 問題10：人数を表示
        System.out.println("合計" + Person.count + "人です");
    }
}