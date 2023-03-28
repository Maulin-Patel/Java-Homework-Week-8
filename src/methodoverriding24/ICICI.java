package methodoverriding24;

class ICICI extends Bank { // ICICI class extending Bank class

    public int getRateOfInterest() { // // Overriding method of parent class to return different value
        return 7;
    }
}
