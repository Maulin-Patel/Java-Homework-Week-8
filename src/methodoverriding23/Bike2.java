package methodoverriding23;

class Bike2 extends Vehicle { // Bike2 class extending Vehicle class

    @Override
    public void run() { // Overriding parent class run method
        System.out.println("Vehicle is running Safely");
    }

    public static void main(String[] args) {
        Bike2 obj = new Bike2(); // Object creation of Bike2 Class
        obj.run(); // Will run method using logic provided in Bike2 Class
    }
}
