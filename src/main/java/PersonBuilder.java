public class PersonBuilder {
    private Person newPerson;

    public PersonBuilder() {
        newPerson = new Person();
    }

    public PersonBuilder setName(String name) {
        newPerson.name = name;
        return this;
    }

    public PersonBuilder setSurname(String surname) {
        newPerson.surname = surname;
        return this;
    }

    public PersonBuilder setAge(int age) {
        newPerson.age = age;
        return this;
    }

    public PersonBuilder setAddress(String address) {
        newPerson.address = address;
        return this;
    }

    public Person build() {
        if (newPerson.getName() == null) {
            throw new IllegalStateException("Не указано имя");
        } else if (newPerson.getSurname() == null) {
            throw new IllegalStateException("Не указана фамилия");
        } else if (newPerson.getAge() <= 0) {
            throw new IllegalArgumentException("Неверно указан возраст");
        }
        return newPerson;
    }
}
