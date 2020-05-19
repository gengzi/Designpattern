package fun.gengzi.decorator;

import java.io.*;

public class MyTest {

    public static void main(String[] args) throws FileNotFoundException {
        Person person = new Person("张三");
        Tshirts tshirts = new Tshirts(person);
        Tshirts2 tshirts2 = new Tshirts2(tshirts);

        tshirts2.show();


        BufferedReader bufferedReader = new BufferedReader(new FileReader("1"));
        LineNumberReader lineNumberReader = new LineNumberReader(bufferedReader);


        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("1"));



    }

}
