import interfaces.Birthable;
import interfaces.Identifiable;
import interfaces.Person;

public class Citizen implements Person, Identifiable, Birthable {
    private String name;
    private int age;
    private String id;
    private String birthdate;

    Citizen(String name, int age, String id, String birthdate) {
        this.name = name;
        this.age = age;
        this.id = id;
        this.birthdate = birthdate;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public String getBirthdate() {
        return this.birthdate;
    }
}
