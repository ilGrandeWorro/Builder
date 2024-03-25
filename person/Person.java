package person;

public class Person {
    protected String firstName;
    protected String lastName;
    protected String address;
    protected int age;


    public int getAge() {
        return age;
    }


    public String getAddress() {
        return address;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

//    public void setAge(int age) {
//        this.age = age;
//    }
//
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public void setFirstName(String firstName) {
//        this.firstName = firstName;
//    }
//
//    public void setLastName(String lastName) {
//        this.lastName = lastName;
//    }

    protected Person(PersonBuilder builder) {
        this.firstName = builder.getFirstName();
        this.lastName = builder.getLastName();
        this.age = builder.getAge();
        this.address = builder.getAddress();
    }
    public static PersonBuilder builder(String firstName, String lastName){
        return new PersonBuilder(firstName, lastName);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}

