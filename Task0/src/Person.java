public class Person {
    String name;
    int age;

    Person() {
        String name = "No name";

    }
    Person(String newName) {
        name = newName;
        age = -- age;
    }
    Person(String newName, int newAge) {
        name = newName;
        age = newAge;
    }

    void setName(String nameValue) {

        name = nameValue;
    }
    String getName() {

        return this.name;
    }

    void setAge(int ageValue) {

        age = ageValue;
    }
    int getAge() {
        return this.age;
    }

    String nameSentence () {
        if (age != -1) {
            System.out.printf("Hello, I'm %s. I am %d years old." , name,age);
        } else {
            if (age < 1) {
                System.out.printf("Hello, I'm %s" , name);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Person p1 = new Person("Andrej", 21);
        p1.nameSentence();


    }
}