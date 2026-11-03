import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        // 1. Three pairs with different types
        Pair<String, Integer> age = new Pair<>("Ana", 25);
        Pair<String, String> capital = new Pair<>("Portugal", "Lisbon");
        Pair<Integer, Boolean> answer = new Pair<>(42, true);

        System.out.println(age);
        System.out.println(capital);
        System.out.println(answer);

        // 2. No casts: getValue() already returns an Integer
        int nextYear = age.getValue() + 1;
        System.out.println(age.getKey() + " next year: " + nextYear);

        // 3. Swap key and value
        Pair<Integer, String> swapped = age.swap();
        System.out.println("Swapped: " + swapped);

        // 4. A list of pairs
        List<Pair<String, Integer>> stock = new ArrayList<>();
        stock.add(new Pair<>("Apples", 10));
        stock.add(new Pair<>("Pears", 4));
        stock.add(new Pair<>("Bananas", 7));

        int total = 0;
        for (Pair<String, Integer> item : stock) {
            System.out.println(item.getKey() + ": " + item.getValue());
            total = total + item.getValue();
        }
        System.out.println("Total: " + total);

        // Extra: a pair whose value is a list
        Pair<String, List<Integer>> grades = new Pair<>("Rui", List.of(14, 17, 12));
        System.out.println(grades.getKey() + " has " + grades.getValue().size() + " grades: " + grades.getValue());

        // Extra: this line does not compile (String is not an Integer)
        // Pair<String, Integer> wrong = new Pair<>("Ana", "25");
    }
}
