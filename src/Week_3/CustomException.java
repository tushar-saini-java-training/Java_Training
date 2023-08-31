package Week_3;
import Week_3.Student;
class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);}
}
 class StudentTeacher {
    public Student find(String studentID) throws StudentNotFoundException {
        if (studentID.equals("2001")) {
            return new Student();
        } else {
            throw new StudentNotFoundException("Coulnot find student  id-" + studentID);
        }
               }
}
public class CustomException {
    public static void main(String[] args) {
        StudentTeacher manager = new StudentTeacher();
        try {
            Student student = manager.find("12001");
            if (student != null) {
                System.out.println("ID is matched");
            }
        } catch (StudentNotFoundException e) {
            System.out.print(e);}
    }
    }