public class Main {

    public static void main(String[] args) {
        // write your code here
        Person mom = new PersonBuilder()
                .setName("Анна")
                .setSurname("Вольф")
                .setAge(31)
                .setAddress("Сидней")
                .build();

        Person son = mom.newChildBuilder()
                .setName("Антошка")
                .setAge(5)
                .build();

        System.out.println(mom);
        System.out.println(son);

        try {
            // Не хватает обязательных полей
            Person person1 = new PersonBuilder()
                    .setName("Юрий")
                    .setAge(37)
                    .build();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }

        try {
            // Возраст недопустимый
            Person person2 = new PersonBuilder()
                    .setName("Иван")
                    .setSurname("Петров")
                    .setAge(-100)
                    .build();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        }
    }

}
