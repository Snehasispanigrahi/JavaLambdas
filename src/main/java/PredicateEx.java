import java.util.function.Predicate;

public class PredicateEx {

    public static void main(String[] args) {
        Predicate<Integer> atLeast5 = x -> x > 5;
        System.out.println(atLeast5.test(5));
    }
}
