package topics

fun main(){
testWhen(2)
testWhen("hi")
testWhen(12)
testWhen(43)

}


fun testWhen(input: Any){
    when(input){
        1 -> println("единица")
        2 -> println("двойка")
        in 10..20 -> println("От десяти до двадцати")
        is String -> println("введена строка из ${input.length} символов")
        else -> println("Что то ещё")
    }
}
