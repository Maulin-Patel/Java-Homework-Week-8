package encapsulation26;

public class Encapsulate {
    // Private variables which can only be accessed by public methods of class
    private String name;
    private int rollNo;
    private int age;

    // get method accessing name variable
    public String getName() {
        return name;
    }

    // set method accessing name variable
    public void setName(String name) {
        this.name = name;
    }
// get method accessing rollNo variable

    public int getRollNo() {
        return rollNo;
    }

    // set method accessing rollNo variable
    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }
    // get method accessing age variable

    public int getAge() {
        return age;
    }

    // set method accessing age variable
    public void setAge(int age) {
        this.age = age;
    }
}
