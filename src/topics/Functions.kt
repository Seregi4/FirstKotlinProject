package topics

fun main() {

    println(getSumFiveAndFive())

    println(getSumNumbXAndNumbY(
            3,
            4
    ))

    println(getStringIsInt(11))
    println("====================================================================================")

    var numbs = getNamedArguments(y = 3, z = 2, x = 5)
    for (numb in numbs) {
        println(numb)
    }
    println("====================================================================================")

    getSumDefaultArguments()
    getSumDefaultArguments(x = 10)
    getSumDefaultArguments(4, 6)
    println("====================================================================================")

    printEven(2,3,5,8,10,11,22,17)
    println()
    println("====================================================================================")

    printEven(*intArrayOf(1,2,3,4,5),6,7,8,9,10)
    println()
    println("====================================================================================")
}

fun getSumFiveAndFive(): Int {
    return 5 + 5
}

fun getSumNumbXAndNumbY(x: Int, y: Int) = x + y

fun getStringIsInt(x: Int): String {
    return "String is $x"
}

fun getNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

fun getSumDefaultArguments(x: Int = 2, y: Int = 3) {
    println(x + y)
}

fun printEven(vararg numbers: Int) {
    numbers.forEach { numb -> if (numb % 2 == 0) print("$numb ") }
}
