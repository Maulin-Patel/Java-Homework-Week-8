package methodoverriding24;

// Test class for creation of Objects and calling the methods within

public class Test2 {
    public static void main(String[] args) {
        SBI s = new SBI(); // Object creation of SBI class
        ICICI i = new ICICI(); // Object creation of ICICI class
        AXIS a = new AXIS(); // Object creation of AXIS class
        System.out.println("SBI Rate of Interest: " + s.getRateOfInterest()); // Method of bank overridden by SBI class
        System.out.println("ICICI Rate of Interest: " + i.getRateOfInterest()); // Method of bank overridden by ICICI class
        System.out.println("AXIS Rate of Interest: " + a.getRateOfInterest()); // Method of bank overridden by AXIS class
    }
}
