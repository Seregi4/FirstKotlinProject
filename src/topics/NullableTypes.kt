package topics

fun main() {

    var a: String = "Hello"
    // a=null //NPE Exception
    println(a.length)

    var b: String? = "Hello"
    b = null
    // b.length
    b?.length

    val l = b?.length ?: 3
    println(l)

}