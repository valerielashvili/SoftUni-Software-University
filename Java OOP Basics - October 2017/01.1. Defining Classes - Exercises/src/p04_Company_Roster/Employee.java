package p04_Company_Roster;

class Employee {
    private String name;
    private double salary;
    private String position;
    private String department;
    private String email = "n/a";
    private int age = -1;

    Employee(String name, double salary, String position, String department) {
        this.name = name;
        this.salary = salary;
        this.position = position;
        this.department = department;
    }

    Employee(String name, double salary, String position, String department, String email) {
        this(name, salary, position, department);
        this.email = email;
    }

    Employee(String name, double salary, String position, String department, int age) {
        this(name, salary, position, department);
        this.age = age;
    }

    Employee(String name, double salary, String position, String department, String email, int age) {
        this(name, salary, position, department);
        this.email = email;
        this.age = age;
    }

    String getDepartment() {
        return department;
    }

    double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %s %d", this.name, this.salary, this.email, this.age);
    }
}
