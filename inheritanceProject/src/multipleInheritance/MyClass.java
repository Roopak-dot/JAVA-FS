package multipleInheritance;

class MyClass implements InterfaceA, InterfaceB {
    public void methodA() {
        System.out.println("Method from InterfaceA");
    }
    public void methodB() {
        System.out.println("Method from InterfaceB");
    }
}