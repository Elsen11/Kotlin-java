//package myKotlinPackage;
//import javafx.scene.text.FontWeight
import java.util.Scanner


fun printing() {
    val numbers: MutableList<Int> = mutableListOf(1, 2, 3, 4, 5)
    val readOnlyView: List<Int> = numbers
    println("my mutable list--" + numbers)
    numbers.add(6)
    println("my mutable after addition" + numbers)
    println(readOnlyView)

}

fun array() {
    val item = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    println("first element of our list " + item.first())
    println("last element of our list " + item.last())
    println("even number of our list " + item.filter { it % 2 == 1 })

    val readWriteMap = hashMapOf("foo" to 1, "bar" to "common")
    println(readWriteMap["bar"])

    val strings = hashSetOf("a", "b", "c", "asd", "hello")
    println("my value are" + strings)
}

fun range() {
    val i: Int = 2
    for (j in 1..2)
        println(j)

    if (i in 1..10) {
        print("found it " + i)
    }
}

fun condition() {
    val x: Int = 3;
    when (x) { //Works like Switch
        1 -> print("x==1")
        2 -> print("x==2")
        4, 5 -> print("either 4 or 5")
        else -> {
            print("neither 1 or 2")
        }
    }
}

fun looping() {
    val items = listOf("asd", 1, 2, 3, "hello")
    val number = mutableListOf("a", "b", "c")
    number.add("d")
    for ((index, x) in number.withIndex()) {
        println("$index value of mutable array : " + x)
    }
    for (i in items) {
        println("valies of array " + i)
    }
}

fun doubleme(x: Int): Int {
    return x + 5;

}

fun breakWhile() {
    for (x in 1..10) {
        if (x == 5) {
            println(
                "I am inside if block with value" + x + "\n" +
                        "-- hence it will close the operation"
            )
            break
        } else {
            println(x)
            continue
        }
    }
}

interface human {
    fun think()
}

class myClass {
    private var name: String = "Seth Rollins"

    public fun printName() {
        println("hello " + name)
    }

    class nestedClass {
        fun foo() {
            println("hello im the static nested Class")
        }
    }

    inner class innerClass {
        fun foo() {
            println("hello " + name + " im the Non static nested Class")
        }
    }
}

/*
fun main() {
    printing()

    array()

    range()

    condition()

    looping()

    val x = 4
    var i = 10
    i = 7

    println(doubleme(x))
    println(doubleme(i))
    breakWhile()

    var myObj = myClass()
    myObj.printName()

    var NestedObj = myClass.nestedClass()
    NestedObj.foo()

    var Innerobj = myClass().innerClass()
    Innerobj.foo()

    var Programmer: human = object : human {
        override fun think() {
            print("I am an example of anonymous Inner Class")
        }
    }
    Programmer.think()

    val man = person("Seth Rollins", 33)
    println("${man.FirstName}" + " ${man.Age}" + " ${man.message}")
    println(man.message)

    val woman = people(167, 48)
    println("${woman.High} " + " ${woman.weight}")

    run(latter = 'd')

    input()

    operator()

    mapList()

    reflection()

    var a = BCD()
    a.think()

    val mylambda: (Int) -> Unit = { s: Int -> println(s) }
    addNumber(4, 10, mylambda);
}
*/
open class ABC {
    open fun think() {
        print("Hey!! i am thinking ")
    }
}

class BCD : ABC() { // inheritance happens using default constructor
    override fun think() {
        print("I Am from Child")
    }
}

fun ispositive(x: Int) = x > 0
fun ispositive(s: String) = s == "kotlin" || s == "kotlin"
class A(val x: Int)

fun reflection() {

    val prop = A::x
    println(prop.get(A(5)))

    val numbers = listOf(-10, -5, 0, 5, 10, 90, -8, 2, 0)
    val strings = listOf("kotlin", "progra")
    println(numbers.filter(::ispositive))
    println(strings.filter(::ispositive))
}

fun mapList() {
    var myMap: Map<Int, String> = mapOf<Int, String>(1 to "Ajay", 4 to "Vijay", 3 to "Prakash")

    for (key in myMap.keys) {
        println("Element at key $key = ${myMap.get(key)}")
    }
    for (itr1 in myMap.iterator()) {
        println("key = ${itr1.key} value = ${itr1.value}")
    }
    println(".....myMap.get(1).......")
    println(myMap.get(1))
    println(".....myMap.contains(3).......")
    println(myMap.contains(3))
    println("......myMap.containsKey(2)......")
    println(myMap.containsKey(2))
    println("......myMap.containsValue(\"Ajay\")......")
    println(myMap.containsValue("Ajay"))
    for (m in myMap.minus(4)) {
        println(myMap[m.key])
    }

    for (m in myMap.plus(Pair(5, "Rohan"))) {

        println("Element at key ${m.key} = ${m.value}")
    }
    println("......myMap.getOrDefault(3, \"Vijay\")......")
    println(myMap.getOrDefault(3, "Vijay"))
}

fun run(num: Int = 5, latter: Char = 'x') {
    print("parameter in function definition $num and $latter")
}

class people(var High: Int, var weight: Int) {

}

class person(var FirstName: String, var Age: Int) {
    val message: String = "Hey hello there"

    constructor (name: String, age: Int, message: String) : this(name, age) {
    }
}

fun input() {
    val read = Scanner(System.`in`)
    print("enter your name : ")
    val name = readLine()
    print("enter your age : ")
//    var age :Int = Integer.valueOf(readLine())
    var age = read.nextInt()
    println("Your name is $name and your age is $age")
}

fun operator() {
    var a = 5
    var b = 10
    val max = if (a > b) {
//        println("a is greater than b.")
        a
    } else {
//        println("b is greater than a.")
        b
    }
    println("max = $max")
    a = 10
    b = 3

    println("a.shl(b): " + a.shl(b))
}

fun main() {
    val sum = JavaClass.add(2, 3)
//    println("Printing Sum inside Kotlin file " + sum)

    val time = JavaClass.times(3, 5)
//    println("Printing time inside Kotlin file " + time)

    val myJava = JavaClass()
    myJava.lastName =  "timber"
    myJava.firstName = "justin"

//    println(
//        "accessing value using property: " + myJava.getFirstName() +
//                " " + myJava.getLastName()
//    );

    val numArray = intArrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 0)
    val sumArray = myJava.sumValues(numArray)
//    println("sum of array in kotlin : " + sumArray)
//    myJava.display("hello", numArray)
//    myJava.display2("hello", *numArray)

//    val mylambda: (Int) -> Unit = { s: Int -> println(s) }
//    addNumber(4,10,mylambda);
//
//    val myClass = SecondConstructor("justin", 20, "admin123")
//    val obj1 = Child("justin", 821021)
//    val obj2 = Child("Camila", 980080, "admin123")
//
//    val duck = Duck()
//    duck.fly()
//    duck.swim()
//
//    val objInherit1 = Programmer("seth", 26, 40000f)
//    objInherit1.doProgram()
//    val objInherit2 = Salesman("wiliam", 28, 90000f)
//    objInherit2.fieldWork()
//
//    val primaryInherit1 = Programmer1("Ashu", "Development", 40000f)
//    primaryInherit1.doProgram()
//    println()
//    val primaryInherit2 = Salesman1("Ajay", "Marketing", 30000f)
//    primaryInherit2.fieldWork()
//
//    val ChildInherit = ChildPatent("justin", 300, "engineer")
//
//    val p = ParrotOverride()
//    p.fly()
//    println(p.color)
//    val d = DuckOverride()
//    d.fly()
//    println(d.color)
//
//    val parrot = ParrotMultipleInherit()
//    println(p.color)
//    p.fly()
}

//@file: JvmName("MyKotlinFileName")
public class myKotlin {

    public fun Area(a: Int, b: Int): Int {
        return a * b
    }
}

fun addNumber(a: Int, b: Int, mylambda: (Int) -> Unit) {   //high level function lambda as parameter
    val add = a + b
    mylambda(add) // println(add)
}

class SecondConstructor(password: String) {

    constructor(name: String, id: Int, password: String) : this(password) {
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${password}")
    }
}

open class Parent {

    constructor(name: String, id: Int) {
        println("this executes first")
        println("Name = ${name}")
        println("Id = ${id}")
    }

    constructor(name: String, id: Int, pass: String) {
        println("this executes third")
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${pass}")
    }
}

class Child : Parent {
    constructor(name: String, id: Int) : super(name, id) {
        println("this executes second")
        println("Name = ${name}")
        println("Id = ${id}")
    }

    constructor(name: String, id: Int, pass: String) : super(name, id, "password") {
        println("this executes forth")
        println("Name = ${name}")
        println("Id = ${id}")
        println("Password = ${pass}")
    }
}

open class Bird {
    fun fly() {
        println("flying...")
    }
}

class Duck : Bird() {
    fun swim() {
        println("swimming...")
    }
}

open class Employee(name: String, age: Int, salary: Float) {
    init {
        println("Name is $name.")
        println("Age is $age")
        println("Salary is $salary")
    }
}

class Programmer(name: String, age: Int, salary: Float) : Employee(name, age, salary) {
    fun doProgram() {
        println("programming is my passion.")
    }
}

class Salesman(name: String, age: Int, salary: Float) : Employee(name, age, salary) {
    fun fieldWork() {
        println("travelling is my hobby.")
    }
}

open class Employee1(name: String, salary: Float) {
    init {
        println("Name is $name.")
        println("Salary is $salary")
    }
}

class Programmer1(name: String, dept: String, salary: Float) : Employee1(name, salary) {
    init {
        println("Name $name of department $dept with salary $salary.")
    }

    fun doProgram() {
        println("Programming is my passion.")

    }
}

class Salesman1(name: String, dept: String, salary: Float) : Employee1(name, salary) {
    init {
        println("Name $name of department $dept with salary $salary.")
    }

    fun fieldWork() {
        println("Travelling is my hobby.")

    }
}

open class Patent {

    constructor(name: String, id: Int) {
        println("execute super constructor $name: $id")
    }
}

class ChildPatent : Patent {

    constructor(name: String, id: Int, dept: String) : super(name, id) {
        print("execute child class constructor with property $name, $id, $dept")
    }
}

open class BirdOverride {
    open var color = "Black"
    open fun fly() {
        println("Bird is flying...")
    }
}

class ParrotOverride : BirdOverride() {
    override var color = "Green"
    override fun fly() {
        println("Parrot is flying...")
    }
}

class DuckOverride : BirdOverride() {
    override var color = "White"
    override fun fly() {
        println("Duck is flying...")
    }
}

open class BirdMultipleInherit {
    open var color = "Black"
    open fun fly() {
        println("Bird is flying...")
    }
}

interface DuckMultipleInherit {
    fun fly() {
        println("Duck is flying...")
    }
}

class ParrotMultipleInherit : BirdMultipleInherit(), DuckMultipleInherit {
    override var color = "Green"
    override fun fly() {
        super<BirdMultipleInherit>.fly()
        super<DuckMultipleInherit>.fly()
        println("Parrot is flying...")

    }
}