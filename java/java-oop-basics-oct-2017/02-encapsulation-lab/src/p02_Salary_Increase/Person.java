package p02_Salary_Increase;

class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    void increaseSalary(double bonus) {
        if (this.age < 30) {
            bonus /= 2;
        }
        this.salary += this.salary * bonus / 100;
    }

    @Override
    public String toString() {
        return String.format("%s %s get %s leva", this.firstName, this.lastName, this.salary);
    }
}
