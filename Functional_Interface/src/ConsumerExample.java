import java.util.List;
import java.util.function.Consumer;

/**
 * only executes what need to be  done does not return values
 */
public class ConsumerExample {
    static Consumer<Student> c2 = (s) -> System.out.println(s);
    static Consumer<Student> c3 = (s) -> System.out.print(s.getName());
    static Consumer<Student> c4 = (s) -> System.out.println(s.getActivities());
    public static void printName(){
        System.out.println("\nprintName :\n");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c2);
    }
    public static void printNameAndActivities(){
        System.out.println("\nprintNameAndActivities :\n");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(c3.andThen(c4));
    }
    public static void printNameAndActivitiesUsingCondition(){
        System.out.println("\n printNameAndActivitiesUsingCondition : \n");
        List<Student> studentList = StudentDataBase.getAllStudents();
        studentList.forEach(student->{
            if(student.getGradeLevel() >= 3 && student.getGpa() >= 3.9){
                c3.andThen(c4).accept(student);
            }
        });
    }

    public static void main(String[] args) {
        Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
        c1.accept("java8");
        printName();
        printNameAndActivities();
        printNameAndActivitiesUsingCondition();
    }
}
