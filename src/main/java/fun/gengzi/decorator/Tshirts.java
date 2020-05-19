package fun.gengzi.decorator;

public class Tshirts extends Finery{

    public Tshirts(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.println("穿T");
        super.show();
    }
}
