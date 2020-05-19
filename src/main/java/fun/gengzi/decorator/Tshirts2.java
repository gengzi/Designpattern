package fun.gengzi.decorator;

public class Tshirts2 extends Finery {

    public Tshirts2(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.println("穿T2");
        super.show();
    }
}
