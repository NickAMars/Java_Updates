import java.util.function.*;

public class MethodReferenceExample {

    static Function<String, String> toUpperCase = String::toUpperCase;
    static Consumer<Student> printStudent = System.out::println;
    static Predicate<Student> highGrade = MethodReferenceExample::greaterThanGradeLevel;
    static Consumer<Student> acceptStudent = MethodReferenceExample::acceptedStudent;
    static Supplier<Student> studentSupplier = Student::new;
    static BiFunction<String,Integer, Student> studentBiFunction = Student::new;


    static boolean greaterThanGradeLevel(Student student){
        return student.getGradeLevel() >=3;
    }
    static void acceptedStudent(Student student){
        String isApproved =  student.getGradeLevel() >=3? "Yes": "No";
        System.out.println(isApproved);
    }
    public static void main(String[] args) {
        System.out.println(toUpperCase.apply("nick"));
//         final Student student = Helper.students.getFirst(); //.get(0)
//         final Student student2 = Helper.students.get(4);
//        System.out.println("-------------------------------");
//         printStudent.accept(student);
//        System.out.println("-------------------------------");
//        Helper.students.forEach(printStudent);
//        System.out.println("-------------------------------");
//        System.out.println(highGrade.test(student));
//        System.out.println("-------------------------------");
//        acceptStudent.accept(student2);
        System.out.println(studentSupplier.get());
        System.out.println(studentBiFunction.apply("nick", 4));
    }
}
