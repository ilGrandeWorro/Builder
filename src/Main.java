package src;

public class Main {
    public static void main(String[] args) {
        PersonBuilder person1 = new PersonBuilder();
        PersonBuilder person2 = new PersonBuilder();
        
        person1.setFirstName("Enzo");
        person1.setLastName("Marino");
        System.out.println(person1.Print());

        person2.setFirstName("Marina");
        person2.setLastName("Carisi");
        person2.setAge(27);
        person2.setAddress("Via della conciliazione, 18");
        System.out.println(person2.Print());
    }
}