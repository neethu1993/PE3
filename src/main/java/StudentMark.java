/*Checks whether the grade is between 0 and 100
*/
import java.util.ArrayList;
import java.util.List;

public class StudentMark {

    private int numOfStudents;
    private List<Integer> stuGrades;

    public Boolean getStudentMarks(List<Integer> marks) {
        numOfStudents = marks.size();
        System.out.println(numOfStudents);
        stuGrades = new ArrayList<>(); //creates an object for list

        /*Checks for the grade is between 0 and 1000

         */

        for (int grade:marks) {
            if((grade >= 0) && (grade<=100)) {
                stuGrades.add(grade);
            }
            else {
                return false;
            }
        }
        return true;

    }
}
