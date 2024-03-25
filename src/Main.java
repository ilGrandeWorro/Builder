package src;

public class Main {
    public static void main(String[] args) {
        PersonBuilder person1 = new PersonBuilder("Enzo","Marino");
        PersonBuilder person2 = new PersonBuilder("Marina","Carisi");


        System.out.println(person1);

        person2.setAge(27);
        person2.setAddress("Via della conciliazione, 18");
        System.out.println(person2);

    }
}