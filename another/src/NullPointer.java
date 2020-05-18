import kotlin.reflect.KFunction;

public class NullPointer {
    public static void main(String[] args) {
        check();
        pattern();
        grade(1);
        System.out.println(days("sunday"));
        Person myObj = new Person("Bob", 22);
        System.out.println(myObj.PrintProfile());

    }

    public static void check() {
        String ptr = null;
        try {

            if ("hello".equals(ptr))
                System.out.print("Same");
            else
                System.out.print("Not Same");
        } catch (NullPointerException e) {
            System.out.print("NullPointerException Caught");
        }
    }

    public static void pattern() {
        String version = System.getProperty("java.version");
        System.out.println(version);
    }

    static void grade(int g) {
        System.out.println(
                switch (g) {
                    case 1 -> "A";
                    case 2 -> "B";
                    default -> "C";
                }
        );
    }

    static int days(String day) {
        int j = switch (day) {
            case "monday" -> 0;
            case "tuesday" -> 1;
            default -> 10;
        };
        return j;

    }
}

class Person {
    public String name;
    public int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public String PrintProfile() {
        String a = "name : " + name + "age : " + age;
        return a;
    }
}

class OtherClass {

    public static void main(String[] args) {

    }
}