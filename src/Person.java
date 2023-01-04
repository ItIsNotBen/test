public class Person {

    private String name;
    private int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;


        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        public void displayName() {
            System.out.println("This person's name is: " + name);
        }

        public void displayAge() {
            System.out.println("This person's age is: " + age);
        }
    }
}
