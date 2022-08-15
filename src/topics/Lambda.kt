package topics

fun main() {
    val array = listOf(1, 2, 3, 4, 5)
    array.forEach { e -> println(e) }
    println(array.map { e -> e * 2 })
    println(array.filter { e -> e % 2 == 0 })
    println(array.reduce { acc, i -> acc + i })

    println(array.sortedByDescending { it })
    println(array.any { it < 10 })


    val numbers = listOf(1, 3, -4, 11, -14)
    val (positive, negative) = numbers.partition { it > 0 }

    println(positive)
    println(negative)

    var result = listOf("a","b","bb","cccc","ad").groupBy { it.length }
    println(result)
}