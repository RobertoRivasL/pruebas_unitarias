package $org.example;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {


        AnotherClass anotherClass = new AnotherClass();
        System.out.println(anotherClass.getLength("Hello"));
        System.out.println(anotherClass.toUpperCase("hello"));
        System.out.println(anotherClass.isEmpty(""));

    }
}
