public class PersonBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public PersonBuilder () {};

    public PersonBuilder setFirstName (String firstName) {
        this.firstName = firstName;
        return this;
    }

    public PersonBuilder setLastName (String lastName) {
        this.lastName = lastName;
        return this;
    }

    public Person build() {
        return new Person(firstName, lastName, age, address);
    }
}
