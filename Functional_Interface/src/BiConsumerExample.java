import java.util.List;
import java.util.function.BiConsumer;

/**
 * Take two values instead of one, does not return any value only for execution
 */
public class BiConsumerExample {
    static BiConsumer<String, String> biConsumer = (a,b)->{
        System.out.printf("\n a: %s, b: %s \n", a, b);
    };
    static BiConsumer<Integer, Integer> multiply = (a,b) -> {
        System.out.printf("\n a*b: %d \n", a*b);
    };
    static BiConsumer<Double, Double> division = (a,b) -> {
        System.out.printf("\n a/b: %.2f%n \n", a/b);
    };
    static BiConsumer<String, List<String>> biNameAndActivities = (name,activities) -> {
        System.out.printf("\n name: %s, activities: %s \n", name, activities);
    };
    public static void nameAndActivities(){
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student -> biNameAndActivities.accept(student.getName(), student.getActivities()));
    }
    public static void main(String[] args) {
        biConsumer.accept("Java7", "Java8");
        multiply.accept(10, 10);
        division.accept(10.0, 3.0);
        nameAndActivities();

    }
}
