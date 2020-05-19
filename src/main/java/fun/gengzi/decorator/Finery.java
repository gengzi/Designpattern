package fun.gengzi.decorator;

public abstract class Finery extends Person {

    protected Person person;

    public Finery(Person person) {
        this.person = person;
    }

    public void Decorate(Person person) {
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }
}
