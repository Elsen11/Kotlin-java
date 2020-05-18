//package myJavaPackage;
//import myKotolinPakage.*;
public class JavaClass {
    protected String firstName;
    protected String lastName;

    public static void main(String[] args) {
        myKotlin objKotlin = new myKotlin();
        int area = objKotlin.Area(2,3);
        System.out.println("printing area inside Java class returning " +
                "from Kotlin file: "+area);

    }

    public static void add(int a, int b) {
        int result = a + b;
//        System.out.println("Result printing in java class " + result);
    }

    public static int times(int a, int b) {
        return a * b;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int sumValues(int[] nums) {
        int result = 0;
        for (int x : nums) {
            result += x;
        }
        return result;
    }

    public void display(String message, int[] nums) {
        System.out.println(message);
        for (int s : nums) {
            System.out.println(s);
        }
    }

    public void display2(String message, int... values) {
        System.out.println("string is " + message);
        for (int s : values) {
            System.out.println(s);
        }
    }
}



