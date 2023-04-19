public class Parent {
    String name;
    void dislay(){
        System.out.println("super Class is Running!");
    }
}
class Child extends Parent{
    int age;

    @Override
    void dislay() {
        System.out.println("Sub Class is Running!");
    }
}
class Downcasting{
    public static void main(String[] args) {
        Parent p = new Child(); // upcasted object
        p.name = "Sewwandi";
        Child c = (Child) p; //Downcasted object
        c.age = 24;
        System.out.println(c.name);
        System.out.println(c.age);
        c.dislay();
    }
}
