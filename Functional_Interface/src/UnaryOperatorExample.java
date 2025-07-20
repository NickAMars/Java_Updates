import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

/**
 * same as function but input and output are of the same type
 * */
public class UnaryOperatorExample {
    static UnaryOperator<String> unaryOperator = (s)->s.concat("-Default");
    static BinaryOperator<String> binaryOperator = (s1, s2)->s1.concat(s2);
    public static void main(String[] args) {
        System.out.printf("Result unaryOperator apply: %s\n",unaryOperator.apply("Java8"));
        System.out.printf("Result binaryOperator apply: %s\n",binaryOperator.apply(" Java8 ", " Java20 "));
        System.out.printf("Result of MaxBy is: %d \n",BinaryOperator.maxBy(Helper.comparator).apply(90,55));
        System.out.printf("Result of MinBy is: %d \n",BinaryOperator.minBy(Helper.comparator).apply(90,55));
//        Math.max(1,5);
//        Math.min(1,5)
    }
}
