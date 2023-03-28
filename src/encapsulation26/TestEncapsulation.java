package encapsulation26;

public class TestEncapsulation {
    public static void main(String[] args) {
        Encapsulate obj = new Encapsulate(); // Object creation
        obj.setName("Maulin Patel"); // setting name value using object
        obj.setAge(40); // setting age value using object
        obj.setRollNo(10); // setting Roll number value using object
        System.out.println("Student's Name: " + obj.getName()); // Printing name value
        System.out.println("Student's Age: " + obj.getAge()); // printing age value
        System.out.println("Student's Roll Number: " + obj.getRollNo()); // printing roll number value
    }
}
