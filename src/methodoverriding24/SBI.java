package methodoverriding24;

class SBI extends Bank { // SBI class extending Bank class
    public int getRateOfInterest() { // Overriding method of parent class to return different value
        return 8;
    }
}
