import java.util.*;

public class FruitList {
    public FruitList() {
    }

    public static void main(String[] args) {
        tryArrayList();
        tryHashSet();
    }

    private static void tryHashSet() {
        Set<String> fruits = null;
        new HashSet<>();
        fruits.add("apple");
        fruits.add("orange");
        fruits.add("orange");
        fruits.add("banana");

        System.out.println(fruits);

        for (String fruit : fruits) {
            System.out.println(fruits);
        }
        Iterator<String> iterator = fruits.iterator();
        while (iterator.hasNext()) {
            String nextElement = iterator.next();
            System.out.println(nextElement);
        }
    }

    private static void tryArrayList() {
        List<String> fruits = new ArrayList<>();

        fruits.add("apple");
        fruits.add("orange");

        fruits.add("apple");
        fruits.add("orange");

        List<String> moreFruits = new ArrayList<>();
        moreFruits.addAll((Collection<? extends String>) fruits);
        moreFruits.add("pears");
        moreFruits.remove("orange");

        System.out.println(fruits.get(1));

        System.out.println(fruits);
        System.out.println(moreFruits);

        for (int i = 0; i < ((Collection<? extends String>) fruits).size(); i++) {
            System.out.println(fruits.get(i));
        }

    }
}
