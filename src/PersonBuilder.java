package src;

public class PersonBuilder  {
    private String firstName;
    private String lastName;
    private String address;
    private int age;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public PersonBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public PersonBuilder setAge(int age) {
        this.age = age;
        return this;
    }
    public Person build (){
        return new Person(firstName,lastName,address,age);

    }
    public String Print() {
        String info = "Name: " + firstName + "\n" + "Last name: " + lastName + "\n";
        if (this.address != null) {
            info += "Address: " + address + "\n";
        }
        if (this.age != 0) {
            info += "Age: " + age +"\n";
        }
        return info;
    }
}
