fun con(month: Int): Any {
    var monthYear = when (month) {
        1 -> "January"
        2 -> "Febuary"
        3 -> "March"
        4 -> "April"
        5 -> "May"
        6 -> "June"
        7 -> "July"
        8 -> "August"
        9 -> "September"
        10 -> "October"
        11 -> "November"
        12 -> "December"
        else -> {
            println("Not a month of year")
        }
    }
    return monthYear
}

fun Planet(p: String): Any {
    var p = when (p) {
        "Mercury", "Earth", "Mars", "Jupiter"
            , "Neptune", "Saturn", "Venus", "Uranus" -> println("Planet")
        else -> println("Neither planet nor star")
    }
    return p
}

fun range(num: Int) {
    when (num) {
        in 1..3 -> println("It is spring season")
        in 4..6 -> println("It is summer season")
        in 7..8 -> println("It is rainy season")
        in 9..10 -> println("It is autumn season")
        in 11..12 -> println("It is winter season")
        !in 1..12 -> println("Enter valid month of year")
//        else -> {
//            println("Enter valid month of year")
//        }
    }
}

fun triple() {
    var triple = Triple("Hello Geeks", "This is Kotlin tutorial", listOf(10, 20, 30))
    println(triple.first)
    println(triple.second)
    println(triple.third)
}

fun isOdd(x: Int) = x % 2 == 1
fun isEven(x: Int) = x % 2 == 0

fun main() {
    println(KotlinVersion.CURRENT)
//    var monthOfYear = read.nextInt()
//    print(con(monthOfYear))
//    var num = read.nextInt()
//    range(num)
//    var planet =read.next()
//    print(Planet(planet))
/*
    when{
        isOdd(num) ->println("Odd")
        isEven(num) -> println("Even")
        else -> println("Neither even nor odd")
    }*/
//    triple()

/*    var read = Scanner(System.`in`)
    print("Enter the number:")
    var num=read.nextInt()
    print(fact(num))*/

    val employ = employee(12, "Jodi")
    val employ2 = employee2(30, "Jo")
    print(employ2.emp)
}

fun fact(num: Int): Long {
    return if (num == 1) num.toLong()
    else num * fact(num - 1)
}

class employee(emp_id: Int, emp_name: String) {
    val id: Int
    var name: String

    // initializer block
    init {
        id = emp_id
        name = emp_name

        println("Employee id is: $id")
        println("Employee name: $name")
    }
}

class employee2 constructor(emp_id: Int, emp_name: String) {
    var emp = emp_id.toString() + emp_name
}

