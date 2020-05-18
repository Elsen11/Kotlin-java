import java.util.Scanner

fun main() {
    var n: Int
    print("Input nilai : ")
    val read = Scanner(System.`in`)
    n = read.nextInt()
    christmastTree(n)
}

fun christmastTree(n: Int) {
//    var i : Int =0
    for (i in 0..n - 1) {
        for (j in 0..n - (i + 1)) {
            print(" ")
        }
        for (k in 1..2 * i + 1) {
            if (i == 0) {
                print(
                    """
          *
       *  *  *
         *  *""")
            } else if (i % 2 == 0) {
                print("*")
            } else {
                print("^")
            }
        }
        println()
    }
    for (i in n / 2..n - 1) {
        for (j in 0..n - (i + 1)) {
            print(" ")
        }
        for (k in 1..2 * i + 1) {
            if (i % 2 == 0) {
                print("*")
            } else {
                print("^")
            }
        }
        println()
    }
    for (i in n / 2..n - 1) {
        for (j in 0..n - (i + 1)) {
            print(" ")
        }
        for (k in 1..2 * i + 1) {

            if (i % 2 == 0) {
                print("*")
            } else {
                print("^")
            }
        }
        println()
    }
    for (i in 0..2) {
        for (j in 0..n -2) {
            print(" ")
        }
        for (k in 0..2) {
            print("|")
        }
        println()
    }
}