package methodoverriding24;

class AXIS extends Bank {
    public int getRateOfInterest() { // Overriding method of parent class to return different value
        return 9;
    }
}
