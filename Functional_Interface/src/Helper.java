import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Helper {
    static Comparator<Integer> comparator = (a,b) ->  a.compareTo(b);
    static Predicate<Double> gpaExcel = (gpa) ->  gpa >= 3.8;
    static Predicate<Double> gpaAverage = (gpa) ->  gpa >= 3.5;
    static Predicate<Student> studentHonor = (student) ->  student.getGpa() >= 3.9;
    static List<Student> students = StudentDataBase.getAllStudents();
    public static Supplier<List<Student>> studentSupplier = ()->{
        return students;
    };
}
