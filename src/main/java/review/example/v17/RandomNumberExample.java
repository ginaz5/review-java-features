package review.example.v17;

import java.util.random.RandomGenerator;
import java.util.random.RandomGeneratorFactory;

public class RandomNumberExample {
    public static void main(String[] args) {
        RandomGeneratorFactory<RandomGenerator> random = RandomGeneratorFactory.of("L128X256MixRandom");
        RandomGenerator randomGenerator = random.create(System.currentTimeMillis());
        for (int i = 0; i < 5; i++) {
            System.out.println(randomGenerator.nextInt(10));
        }
    }
}
