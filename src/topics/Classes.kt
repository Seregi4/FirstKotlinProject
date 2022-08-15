package topics

fun main() {

    val child = Person("Andy", "Ivanov", 5)
    val p1 = Person("Tom", "Ivanov", 35, child)
    println(p1.firstName)
    println(p1.toString())

    val rectangle1 = Rectangle(5.0, 2.0)
    println("The perimeter is ${rectangle1.perimeter}")

    val rectangle2 = Rectangle(5.0, 3.0)
    println(rectangle1 == rectangle2)
}

data class Person(val firstName: String, val lastName: String, var age: Int) {
    var children: MutableList<Person> = mutableListOf()

    init {
        println("Person is created $firstName")
    }

    constructor(firstName: String, lastName: String, age: Int, child: Person) :
            this(firstName, lastName, age) {
        children.add(child)
    }

    constructor() : this("", "", 0)
}

data class Rectangle(var height: Double, var length: Double) {
    var perimeter = (height + length) * 2

    var test = 1
        get() = field + 1
        set(value) {
            if (value < 0) println("Negative value")
            field = 0
        }

    fun area() = height * length
}