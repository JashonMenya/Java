package refresher_exercises.inheritance;

public class Person {
    private String name;
    private int age;
    private String gender;

    public Person() {
        System.out.println("Person constructor called");
    }

    public Person(String name) {
        System.out.println("Person 2nd constructor called");
    }

    public Person(String name, int age, String gender) {
        System.out.println("Person 3nd constructor called");
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
}
