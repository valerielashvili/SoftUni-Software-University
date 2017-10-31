package p10_Family_Tree;

class Child {
    private String name;
    private String birthDate;

    Child() {
        this.name = "";
        this.birthDate = "";
    }

    Child(String name) {
        this.name = name;
        this.birthDate = "";
    }

    String getName() {
        return this.name;
    }

    String getBirthDate() {
        return this.birthDate;
    }

    void setName(String name) {
        this.name = name;
    }

    void setBirthDate(String date) {
        this.birthDate = date;
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.name, this.birthDate);
    }
}
