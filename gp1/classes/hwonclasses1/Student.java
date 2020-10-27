
//1. C 1 and 2 only

public class Student {
    private String myName;
    private int myAge;

    public Student() {
        myName = null;
        myAge = 0;
    }

    public Student(String name, int age) {
        myName = name;
        myAge = age;
    }

    public int getAge() {
        return myAge;
    }

    public void setAge(int age) {
        myAge = age;
    }

    public String getName() {
        return myName;
    }

    public void setName(String name) {
        myName = name;
    }

    public int grow() {
        return ++myAge;
    }

}
