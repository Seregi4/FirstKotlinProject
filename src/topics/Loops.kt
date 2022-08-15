package topics

fun main(){

    val fruits = listOf("apple","banana","orange")
    var fruits2 = mutableListOf("apple2","banana2","orange2")

    for (fruit in fruits) {
        println(fruit)
    }

    var index = 0
    while (index < fruits2.size) {
        println("Fruit at $index is ${fruits2[index]}")
        index++
    }

    println(5 in 3..10)

    for (i in 1..5){
        print("$i ")
    }
    println()

    for(i in 1 until 5){
        print("$i ")
    }
    println()

    for (i in 3 downTo 1){
        print("$i ")
    }
    println()

    for (i in 0..100 step 10){
        print("$i ")
    }
    println()
}