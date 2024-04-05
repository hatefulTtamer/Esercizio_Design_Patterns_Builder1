public class PersonBuilder {
    private String firstName;
    private String lastName;
    private int age;
    private String address;

    public PersonBuilder (String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    };

    public String getFirstName () {
        return firstName;
    }

    public String getLastName () {
        return lastName;
    }

    public String getAddress () {
        return address;
    }

    public int getAge() {
        return age;
    }

    public PersonBuilder setAge (int age) {
        this.age = age;
        return this;
    }

    public PersonBuilder setAddress (String address) {
        this.address = address;
        return this;
    }

    public Person build() {
        return new Person(this);
    }
}
