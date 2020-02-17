import java.util.ArrayList;
import java.util.List;

public class Basket {
    private final String fruits;

    public Basket(String fruits) {
        this.fruits = fruits;
    }

    public boolean findApple() {
        return fruits.contains("banana");
    }

    public boolean findBanana() {
        for (String fruit : fruits) {
            if (fruit.equals("banana")) {
                return true;
            }
        }

        public List<String> uniqueMine () {
            List<String> result = new ArrayList<>();
            for (String fruit : fruits) {
                if (!result.contains(fruit)) {
                    result.add(fruit);
                }
            }
        }
    }
}
