

public class     Employee {

    private String name;
    private int age;
    private String job;

    public Employee(String name, int age, String job) throws InvalidAgeException {
        if (age < 0) {
            throw new InvalidAgeException("Age cannot be negative: " + age);
        }
        this.name = name;
        this.age = age;
        this.job = job;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Job: " + job;
    }


}
