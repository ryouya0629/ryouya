package curriculum_C;

import java.util.Random;

public class Cpu {

    private Random random = new Random();

    // CPU の手をランダムで決める
    public int getHand() {
        // 0,1,2 のどれかがランダムで出る
        return random.nextInt(3);
    }
}