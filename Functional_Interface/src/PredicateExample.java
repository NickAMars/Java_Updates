import java.util.function.BiPredicate;
import java.util.function.Predicate;

/**
 * is a condition which return true or false
 */
public class PredicateExample {
    static Predicate<Integer> predicate = (i) ->  i % 2 == 0;

    static Predicate<Integer> predicate2 = (i) ->  i % 5 == 0;

    static BiPredicate<Integer, Integer> biPredicate = (t, u)  -> t > 5 && u < 20;

    public static void predicatedAnd(){
        System.out.println("\npredicatedAnd: ");
        boolean isFlag = predicate.and(predicate2).test(10);
        boolean isFlag2 = predicate.and(predicate2).test(5);
        System.out.printf("chain predicates (and): %b\n", isFlag);
        System.out.printf("chain predicates (and): %b\n", isFlag2);
    }
    public static void predicatedOr(){
        System.out.println("\npredicatedOr: ");
        boolean isFlag = predicate.or(predicate2).test(5);
        boolean isFlag2 = predicate.or(predicate2).test(8);
        System.out.printf("chain predicates (or): %b\n", isFlag);
        System.out.printf("chain predicates (or): %b\n", isFlag2);
    }
    public static void predicatedNegate(){
        System.out.println("\npredicatedNegate: ");
        boolean isFlag = predicate.or(predicate2).negate().test(5);
        boolean isFlag2 = predicate.or(predicate2).negate().test(8);
        System.out.printf("chain predicates (negate-or): %b\n", isFlag);
        System.out.printf("chain predicates (negate-or): %b\n", isFlag2);
    }
    public static void biPredicateExample(){
        System.out.println("\nbiPredicateExample: ");
        boolean isFlag = biPredicate.test(1,5);
        boolean isFlag2 = biPredicate.test(8,10);
        System.out.printf("biPredicate (negate-or): %b\n", isFlag);
        System.out.printf("biPredicate (negate-or): %b\n", isFlag2);
    }
    public static void main(String[] args) {
        System.out.printf("predicates execution:  %b \n",predicate.test(4));
        predicatedAnd();
        predicatedOr();
        predicatedNegate();
        biPredicateExample();
    }
}
