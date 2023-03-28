package multilevelinheritance23;

class TestInheritance2 {
    public static void main(String[] args) {
        BabyDog d = new BabyDog(); // Object creation of BabyDog class which can access all methods from other classes
        d.weep();
        d.bark();
        d.eat();
    }
}
