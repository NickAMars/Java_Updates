import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Best one where the function takes input and return values
 */
public class FunctionExample {
    static Function<String, String> function1 = (name)->name.toUpperCase();
    static Function<String, String> addSomeString = (name)->name.concat("-default");
    static Function<List<Student>, Map<String, Double>> studentFunction = (students)->{
        Map<String, Double> studentGradeMap = new HashMap<>();
//        Map<String, Long> studentCount = students.stream().collect(Collectors.groupingBy(student -> student.getName(), Collectors.counting()));
        students.forEach(student ->{
            if(Helper.gpaExcel.test( student.getGpa()))
                studentGradeMap.put(student.getName(), student.getGpa());
        }) ;
//        System.out.println(studentCount);
        return studentGradeMap;
    };
    static BiFunction<List<Student>, Predicate<Student>,Map<String, Double>> biFunction = (students, studentPredicate)->{
        Map<String, Double> studentGradeMap = new HashMap<>();
        students.forEach(student->{
            if(studentPredicate.test(student)){
                studentGradeMap.put(student.getName(), student.getGpa());
            }
        });
        return studentGradeMap;
    };

    public static void main(String[] args) {
        System.out.printf("Result: %s \n",function1.apply("nick"));
        // sequential order of operation
        System.out.printf("Result of andThen: %s \n",function1.andThen(addSomeString).apply("nick"));
        // reverse the order of operations
        System.out.printf("Result compose: %s \n",function1.compose(addSomeString).apply("nick"));
        // collecting student map with GPA
        System.out.printf("Student Grades: %s \n",studentFunction.apply(Helper.students));
        // biFunction
        System.out.printf("BiFunction Result %s",biFunction.apply(Helper.students, Helper.studentHonor));
    }
}
