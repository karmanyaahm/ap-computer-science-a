
/**
 * Example of how to write a class definition
 *
 * @author (Karmanyaah Malhotra)
 * @version (10/2/20)
 */
public class Student {
    // instance variables - aka data fields- hold data that describes object
    // they are always private

    private int grade, // the year in school like 9th or 10th
            age; // in years

    private double gpa; // grade point average

    /**
     * Constructor for objects of class Student constructors initialize the data
     * fields
     */
    public Student(int iGrade, int iAge, double iGpa) {
        // initialise instance variables
        grade = iGrade;
        age = iAge;
        gpa = iGpa;
    }

    // the data is private so we write special methods to access the data
    // these are called accessor methods or getter methods

    public int getGrade() {
        return grade;

    }

    public int getAge() {
        return age;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public void promoteStudent() {
        grade++;
    }

}
