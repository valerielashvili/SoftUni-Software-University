import interfaces.Person;

public class European extends BasePerson implements Person {

    European(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
