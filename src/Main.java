package src;


import person.Person;

public class Main {
    public static void main(String[] args) {
        Person user = Person.builder("Enzo", "Giorgi").build();
        Person user1 = Person.builder("Marina", "Carisi").setAddress("Via roma, 2").setAge(18).build();


        System.out.println(user);
        System.out.println(user1);

    }
}