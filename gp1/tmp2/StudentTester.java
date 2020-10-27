// A program to test the Student class
// It is not part of the Student class

public class StudentTester
{
    public static void main(String args []) {
        
        //create an object using the blueprint Student
        Student pupil = new Student(10, 15, 3.56);
        
        System.out.println("The pupil's age is " + pupil.getAge());
        System.out.println("The pupil's grade is " + pupil.getGrade());
        System.out.println("The pupil's GPA is " + pupil.getGpa());
        
        // At the end of the year we need update the data for the student
        pupil.setGpa(3.75);  //she had a good year
        pupil.promoteStudent();  //a rising junior
        
        // check that the changes worked
        System.out.println("The pupil's age is " + pupil.getAge());
        System.out.println("The pupil's grade is " + pupil.getGrade());
        System.out.println("The pupil's GPA is " + pupil.getGpa());
    }
}
